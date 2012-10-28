/**
 * Represents a Duck. All ducks are able to swim and all ducks are birds.
 */
public abstract class Duck extends Bird {
	/**
	 * Let's the duck swim around
	 */
	public void swim() {
		System.out.println("Duck is swimming");
	}
}