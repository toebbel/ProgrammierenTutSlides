public class Schleifen {
	public static final int N = 1258;
	
	public static void main(String[] args) {
		System.out.println("Prime numbers <= " + N);
		System.out.println("----------------------");
		
		for (int candidate = -1; candidate < N; candidate++) {
			if (isPrimeDoWhile(candidate)) {
				System.out.print(candidate + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		printPrimeFactors(262395);
	}


	/**
	 * Returns true, if the specified candidate is prime.
	 * 
	 * This method uses a for loop.
	 * 
	 * @param candidate the candidate
	 * @return true, if the specified candidate is prime
	 */
	public static boolean isPrimeFor(int candidate) {
		if (candidate <= 1) {
			return false;
		}
		
		for (int i = 2; i < candidate; i++) {
			if (candidate % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	/**
	 * Returns true, if the specified candidate is prime.
	 * 
	 * This method uses a while loop.
	 * 
	 * @param candidate the candidate
	 * @return true, if the specified candidate is prime
	 */	
	public static boolean isPrimeWhile(int candidate) {
		if (candidate <= 1) {
			return false;
		}
		
		int i = 2;
		
		while (i < candidate) {
			if (candidate % i == 0) {
				return false;
			}
			
			i++;
		}
		
		return true;
	}
	
	
	
	/**
	 * Returns true, if the specified candidate is prime.
	 * 
	 * This method uses a do-while loop.
	 * 
	 * @param candidate the candidate
	 * @return true, if the specified candidate is prime
	 */
	public static boolean isPrimeDoWhile(int candidate) {
		if (candidate <= 1) {
			return false;
		}
		
		int i = 2;
		
		if (i < candidate) {
			do {	
				if (candidate % i == 0) {
					return false;
				}
				
				i++;	
			} while (i < candidate);
		}
		
		return true;
	}
	
	
	
	/**
	 * Returns the next prime number that is greater than the specified number.
	 * 
	 * @param number the number
	 * @return the next prime number
	 */
	private static int getNextPrimeNumber(int number) {
		int candidate = number + 1;
		
		while (true) {
			if (isPrimeFor(candidate)) {
				return candidate;
			}
			
			candidate++;
		}
	}
	
	
	/**
	 * Prints the prime factors of the specified number.
	 * 
	 * @param number
	 */
	public static void printPrimeFactors(int number) {
		System.out.println("Primfaktoren der Zahl " + number + ": ");
		
		/* Zahlen <= 1 besitzen keine Primfaktorzerlegung */
		if (number <= 1) {
			System.out.println("keine.");
			return;
		}
				
		
		int primeFactor = 2;
		int countFactor = 0;
		
		/* Bei number == 1 wurden alle Primfaktoren gefunden */
		while (number > 1) {
			
			/* Test, ob Primfaktor */
			if (number % primeFactor == 0) {
				number = number / primeFactor;
				countFactor++;
			} else {
				/* getestete Zahl ist kein Primfaktor */
				if (countFactor > 0) {
					System.out.println(primeFactor + ": " + countFactor + "x");
				}
				primeFactor = getNextPrimeNumber(primeFactor);
				countFactor = 0;
			}
		}
		
		// der letzte Faktor muss noch ausgegeben werden
		System.out.println(primeFactor + ": " + countFactor + "x");
	}
}
