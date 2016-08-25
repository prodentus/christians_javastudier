package laborations;

/** Checks if a civic registration number has a valid format and
 * whether it belongs to a man or a woman.
 * 
 * @author christian
 *
 */

public class CivicRegistrationNumber {
	
	private String number;

	public CivicRegistrationNumber(String number) {
		this.number = number;
	}
	
	public boolean isMale() {
		if (!this.isWellFormed()) {
			System.out.println("Personnumret " + number + " har inte rätt format!");
			return false; //throw exception would be better.
		} else {
			char maleOrFemaleDigit = this.number.charAt(this.number.length()-2);
			return (Character.getNumericValue(maleOrFemaleDigit) % 2 != 0 );
		}
	}
	
	public boolean isWellFormed() {
		boolean hasFoundError = false;
		if ((this.number.length() == 10) || (this.number.length() == 11)) {
			for (int i = 1; i <= this.number.length() ; i++) {
				Character character = this.number.charAt(i-1);
				if (!Character.isDigit(character)) {
					if (!( (i == 7) && (character == '-'))) {
						hasFoundError = true;
						break;
					}
				}
			}
		} else {
			hasFoundError = true;
		}
		return (!hasFoundError);
	}
	
}