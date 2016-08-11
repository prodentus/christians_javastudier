package exercises_step2;

public class P02_TwoMethods {

	public static void main(String[] args) {
		TwoQuotes quote = new TwoQuotes();
		System.out.println("Ett citat: ");
		quote.display();
		System.out.println("Två citat fyra gånger: ");
		for (int i = 0 ; i <= 4 ; ++i) {
			quote.display();
			quote.anotherDisplay();
		}
	}
		
}

class TwoQuotes {
	
	public void display() {
		System.out.println("Tärningen är kastad.");
	}
	
	public void anotherDisplay() {
		System.out.println("Även du min Brutus.");
	}
	
}