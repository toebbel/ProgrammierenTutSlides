public class Crow extends Bird {
	/**
	 * Creates an instance of Crow and set's all the default values
	 */
	public Crow() {
		color = "black";
	}
	
	/**
	 * Let's the crow jump on the ground
	 */
	public void jump() {
		System.out.println("Crow is jumping");
	}
	
	/**
	 * Let's the crow fly around
	 */
	public void fly() {
		System.out.println("Crow is flying");
	}
	
	//We don't need javadoc here, because we have written it in Bird.java =)
	public String getSound() {
		return "crah";
	}
}