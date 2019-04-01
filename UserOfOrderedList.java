/* Functions to have:

-Create, obviously
		-Perhaps conver an existing array into an orderedList
-Add
-Remove from a specific location
-Get from a specific location
-Get size
*/

public class UserOfOrderedList {
	public static void main(String[] args) {
		//OrderedList_inArraySlots list = new OrderedList_inArraySlots(true);
		OrderedList_inArraySlots list = new OrderedList_inArraySlots(false);
		System.out.println(list);

		list.add(3);
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(5);

		System.out.println(list);
		//System.out.println(list.size());
		/*for(int x = 0; x < list.size(); x++){
			System.out.println(Integer.toString(list.get(x)));
		}*/

		list.remove(3);
		list.remove(1);

		System.out.println(list);
	}

	
}