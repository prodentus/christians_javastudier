package cl222zy;

public class Step2_lab01 {

	public static void main(String[] args) {
		MultiDisplay multiDisplay = new MultiDisplay();
		multiDisplay.statement = "I have a dream.";
		multiDisplay.numberOfTimesToDisplay = 10;
		multiDisplay.display();
		multiDisplay.display("Make love, not war.", 5);
	}

}

class MultiDisplay {
	
	String statement;
	int numberOfTimesToDisplay;
	
	public MultiDisplay() {
	}
	
	public void display() {
		for (int i = 1 ; i <= this.numberOfTimesToDisplay ; i++) {
			System.out.println(this.statement);
		}
	}
	
	public void display(String statement, int numberOfTimesToDisplay) {
		for (int i = 1 ; i <= numberOfTimesToDisplay ; i++) {
			System.out.println(statement);
		}
	}
	
}