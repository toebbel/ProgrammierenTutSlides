/**
 * this is an awesome bird simulator!
 */
public class BirdSim {
	
	/** stores all the birds for the simulation*/
	Bird[] myBirds;
	
	public BirdSim() {
		//create some Birds
		Bird myBird1 = new Crow(); //Create a bird, which is a crow
		Crow myBird2 = new Crow(); //Create just a crow
		
		myBirds = new Bird[2]; //you can make the array bigger, if you want to.
		myBirds[0] = myBird1;
		myBirds[1] = myBird2;
	}

	/**
	 * Fetches all the sounds from all the birds in this simulation and generates a String
	 * @return sounds of all birds
	 */
	public String getBackroundSound() {
		String result = "";
		for (int i = 0; i < myBirds.length; i++) {
			if (myBirds[i] != null) { //avoid nullPointerExceptions
				result = result + myBirds[i].getSound() + ", ";
			}
		}
		return result;
	}
}