import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		new ListDemo().start();
	}
	
	public void start() {
		List<Point> myList = new LinkedList<Point>();
		Point myPointA = new Point(1,1);
		Point myPointB = new Point(5,3);
		Point myPointC = new Point(3,-1);
		
		myList.add(myPointA);
		myList.add(myPointB);
		myList.add(myPointC);
	}
}