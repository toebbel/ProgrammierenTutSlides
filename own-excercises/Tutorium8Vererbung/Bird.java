public abstract class Bird {
	protected String color;
	
	/**
	 * Gets the color from this Bird-instance
	 * @return the color of this bird as String
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Returns the sound of this Bird-Instance
	 * @return the sound of this bird as String
	 */
	public abstract String getSound(); //this is an abstract metod. It has no body, but ";"
}