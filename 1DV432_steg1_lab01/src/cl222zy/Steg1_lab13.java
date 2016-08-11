package cl222zy;

/** Calculates and prints out all prime integers between 1 and 100.
 * 
 * @author christian
 *
 */

public class Steg1_lab13 {

	public static void main(String[] args) {
		System.out.println("Primtalen mellan 1 och 100 är:");
		for (int i = 3 ; i <= 100 ; i++) {
			if (isPrime (i)) {
				System.out.print(i + " ");	
			}
		}
	}
	
	private static boolean isPrime(int testInteger) {
		boolean hasFoundDivider = false;
		for (int i = 2 ; i <= testInteger-1 ; i++) {
			if (testInteger % i == 0) {
				hasFoundDivider = true;
				break;
			}
		}
		return (!hasFoundDivider);
	}
	
}