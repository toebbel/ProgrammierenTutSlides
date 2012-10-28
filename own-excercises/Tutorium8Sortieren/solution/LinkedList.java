public class LinkedList {
	private ListItem first;
	
	/**
	 * Returns the item with the given index or null, if there is no item with that index
	 * @param index zero-based location inside this list
	 * @return the Point at the given index or null if the index wasn't valid
	 */
	public Point getPoint(int index) {
		ListItem current = first; //we will use current to iterate over our list
		int counter = 0;
		while (current != null && counter < index) { //end of list or counter reached?
			current = current.getNext(); //go to next item in list
			counter++;
		}
		
		if (counter == index && current != null) { //really found it, or just reached end of list, without finding the index?
			return current.getValue();
		} 
		return null;
	}
	
	/**
	 * Adds an instance of Point to the beginning of the list.
	 *
	 * Every Point can be added only once to the list.
	 *
	 * @param val the Point that shall be added to the list
	 * @return true if the point could be added
	 */
	public boolean addFirst(Point val) {
		if (val == null || contains(val)) {
			return false; //there is no point to add to the list.
		}
		
		ListItem myItem = new ListItem(val); //create our ListItem for that point and put the point into that item.
		myItem.setNext(first); //let the new item link to the currently first item
		first = myItem;//set our new item to the new first item of the list
		return true;
	}
	
	/**
	 * Removes a given instance of Point from the list.
	 * @param p the point to be removed
	 * @return true if the point could be removed
	 */
	public boolean remove(Point p) {
		if (!contains(p) || size() == 0) { //point, which shall be removed, is not in list? / There are NO points in the list?
			return false;
		}
		
		ListItem current, beforeCurrent; //remember the current item and the item before that.
		current = first;
		beforeCurrent = null;
		
		while(current != null && !current.getValue().equals(p)) {
			beforeCurrent = current;
			current = current.getNext();
		}
		
		if (beforeCurrent != null) {//beforeCurrent is null, if we want to remove the first point
			beforeCurrent.setNext(current.getNext()); //exclude Point from our list.
		} else {
			first = current.getNext();
		}
		return true;
	}
	
	/**
	 * Checks if a given instance of Point is inside this list.
	 * @param p the Point to check
	 * @return true if the Point p is in the list
	 */
	public boolean contains (Point p) {
		ListItem current = first;
		
		while(current != null && !current.getValue().equals(p)) {
			current = current.getNext();
		}
		
		if (current == null) { //we are at the end? -> we couldn't find the given point
			return false;
		}
		return true;
	}
	
	
	/**
	 * Creates a new instance of LinkedList, which contains the same items, but ordered asc.
	 *
	 * Points will be orderd by their distance to the origin
	 * @return a new & sorted list
	 */
	public LinkedList sort() {
		LinkedList result = new LinkedList();
		
		//In all following comments: small = near to origin
		
		while(size() > 0) { //are there unsorted points left?
			Point currentlyBiggestPoint = new Point(0, 0); //tmp variable; create smallest possible point, so every other point will be bigger
			for (int i = 0; i < size(); i++) {
				if (getPoint(i).distanceToOrigin() > currentlyBiggestPoint.distanceToOrigin()) { 
					//we found a point, which is bigger than the biggest smallest point
					currentlyBiggestPoint = getPoint(i); //save the smaller point in tmp.-variable
				}
			}
			remove(currentlyBiggestPoint);
			result.addFirst(currentlyBiggestPoint);
		}
		
		return result;
	}
	
	/**
	 * Calcs the size of this list.
	 * @return the number of items inside this list
	 */
	public int size() {
		ListItem current = first;
		int count = 0;
		while(current != null) {
			current = current.getNext();
			count++;
		}
		return count;
	}
}