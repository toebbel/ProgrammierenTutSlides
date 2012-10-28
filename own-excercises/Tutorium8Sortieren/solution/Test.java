public class Test {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		
		//create add 10 Points to our list
		for (int i = 0; i < 10; i++) {
			//choose x and y randomly [0,100)
			Point myPoint = new Point((int) (Math.random() * 100), (int) (Math.random() * 100));
			myList.addFirst(myPoint);
		}
		
		System.out.println("un-sorted list:");
		printList(myList);
		
//		LinkedList sortedList; //do something here so we get a sorted list out of myList
		LinkedList sortedList = myList.sort();
		System.out.println("\nsorted list:");
		printList(sortedList);
	}
	
	/**
	 * Prints all Points from a LinkedList to the console.
	 * 
	 * format for output of each element: '(x|y) d = 123; '
	 * @param list a list to print
	 */
	private static void printList(LinkedList list) {
		if (list == null) {
			System.out.println("list is null");
		} else {
			System.out.print("items of list: ");
			
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.getPoint(i) + " d = " + (int) (list.getPoint(i).distanceToOrigin()) + "; ");
			}
			
			System.out.print("[number of elements: " + list.size() + "]\n");
		}
	}
}