package cl222zy;

/** Checks how many uppercase letters an input text has.
 * 
 * 2016-06-28 Karl: It would be better to declare variable character inside loop.
 * 
 * @author christian
 *
 */

public class TextAnalyzer {

	private TextAnalyzer() {
		
	}
	
	public static int getUpperCaseCount(String text) {
		int upperCaseCount = 0;
		for (int i = 1 ; i <= text.length() ; i++) {
			char character = text.charAt(i-1);
			if (Character.isUpperCase(character)) {
				upperCaseCount ++;
			}
		}
		return upperCaseCount;
	}
	
}