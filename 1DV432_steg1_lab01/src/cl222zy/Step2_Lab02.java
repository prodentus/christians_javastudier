package cl222zy;

/** Asks for a sentence ant tells whether it is a palindrome or not.
 * 
 * @author christian
 */

import java.util.Scanner;

public class Step2_Lab02 {

	public static void main(String[] args) {	
		System.out.println("Ange en sträng och tryck [Enter]:");
		Scanner scanner = new Scanner(System.in);
		String inputSentence = scanner.nextLine();
		Palindrome palindrome = new Palindrome();
		String inputSentenceWithoutNoneLetters = palindrome.removeNoneLetters(inputSentence);
		if (palindrome.isPalindrome(inputSentenceWithoutNoneLetters)) {
			System.out.println("'" + inputSentence + "'" + " är ett palindrom.");
		} else {
			System.out.println("'" + inputSentence + "'" + "är INTE ett palindrom.");
		}
		scanner.close();
	}
	
}
	
class Palindrome {
	
	public boolean isPalindrome(String str) {
		String reverseStr = (new StringBuffer(str)).reverse().toString();
		return str.equalsIgnoreCase(reverseStr);
	}
	
	public String removeNoneLetters(String str) {
		String result = "";
		for (int i = 0; i < str.length(); ++i) {
			if (Character.isLetter(str.charAt(i))) {
				result = result + str.charAt(i);
			}
		}
		return result;
	}
	
}