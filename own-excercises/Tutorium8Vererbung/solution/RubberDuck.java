/**
 * Rebresents a RubberDuck. That thing you can take with you, if you take a bath.
 */
public class RubberDuck extends Duck {

	/**
	 * Creates an instance of RubberDuck.
	 */
	public RubberDuck() {
		color = "yellow";
	}
	
	//no javadoc needed here =)
	public String getSound() {
		return "quietsch";
	}
}