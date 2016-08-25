package laborations;

/** Inputs a tree-digit integer from the keyboard.
 * Then calculates and prints out the sum of the three digits.
 * 
 * @author christian
 */

import java.util.Scanner;

public class Steg1_lab05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ange ett tresiffrigt heltal:");
		String input = Integer.toString(scanner.nextInt());
		int sum = 0;
		for (int i = 1 ; i <= input.length() ; i++) {
			sum = sum + Character.getNumericValue(input.charAt(i-1));
		}
		System.out.println("Summan av siffrorna i heltalet är: " + sum);
		scanner.close();
	}
	
}