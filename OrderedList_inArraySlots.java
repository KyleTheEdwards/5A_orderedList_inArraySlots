public class OrderedList_inArraySlots{
	private List_inArraySlots arraySlotsList;
	private int size;
	private boolean minFirst;

	public OrderedList_inArraySlots(boolean minFirst){
		arraySlotsList = new List_inArraySlots();
		size = arraySlotsList.size();
		this.minFirst = minFirst;
	}

	public int size(){
		return arraySlotsList.size();
	}

	public int get(int index){
		return arraySlotsList.get(index);
	}

	private void swap(int ind1, int ind2){
		int temp = arraySlotsList.set(ind1, arraySlotsList.get(ind2));
		arraySlotsList.set(ind2, temp);
	}

	public String toString(){
		return arraySlotsList.toString();
	}

	public boolean add(int value){
		arraySlotsList.add(value);
		int currentPlace = size() - 1;

		if(minFirst){
			while (currentPlace > 0 && arraySlotsList.get(currentPlace) < arraySlotsList.get(currentPlace-1)){
				swap(currentPlace, currentPlace-1);
				currentPlace--;
			}
		} else if (!minFirst){
			while (currentPlace > 0 && arraySlotsList.get(currentPlace) > arraySlotsList.get(currentPlace-1)){
				swap(currentPlace, currentPlace-1);
				currentPlace--;
			}
		}

		
		return true;		
	}

	public int remove(int place){
		return arraySlotsList.remove(place);
	}

}