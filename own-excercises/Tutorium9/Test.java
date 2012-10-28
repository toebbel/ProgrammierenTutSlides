public class Test {
	private int nameCount = 0;

	public static void main(String[] args) {
		System.out.println((new Test()).getText());
	}
	
	public String getText() {
		return "Hallo " + getTheName() + " heute ist der " + getDatum();
	}
	
	private String getTheName() {
		return getTheName(getTheName("") + " ");
	}
	
	private String getTheName(String appendTo) {
		if (nameCount == 0) {
			nameCount++;
			return "Carlson" + appendTo;
		} else {
			return appendTo + "vom Dach";
		}
	}
	
	private String getDatum() {
		return getDatum("24.");
	}
	
	private String getDatum(String datePart) {
		if (datePart == null)
			return "";
		if (datePart.length() == 3) {
			return getDatum(datePart + "12.");
		} else if (datePart.length()  == 6) {
			return getDatum(datePart + ".2011");
		} else if (datePart.length()  == 11) {
			return getDatum(datePart + " Weihnachten!");
		}
		return datePart;
	}
}