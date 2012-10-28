public class ListItem {
	/** content of this ListItem, that shall be stored */
	private Point value;
	
	/** points to the next item in the list, or null */
	private ListItem next;
	
	/**
	 * Creates an instance of ListItem
	 * @param val The Point, that shall be stored in the Item-Instance
	 */
	public ListItem (Point val) {
		value = val;
	}
	
	/**
	 * Returns the Point that is stored inside this ListItem
	 * @return the Point in this Item
	 */
	public Point getValue() {
		return value;
	}
	
	/**
	 * Returns the ListItem which is after this instance of ListItem in a list
	 * @return the next ListItem
	 */
	public ListItem getNext() {
		return next;
	}
	
	/**
	 * Sets the next ListItem
	 * @param next the ListItem, which shall be the next one from this instance
	 */
	public void setNext(ListItem next) {
		this.next = next;
	}
	
}