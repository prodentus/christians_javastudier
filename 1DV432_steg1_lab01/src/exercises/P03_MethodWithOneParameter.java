package exercises_step2;

public class P03_MethodWithOneParameter {

	public static void main(String[] args) {
		QuoteLoop quote = new QuoteLoop();
		System.out.println("Ett citat: ");
		quote.display(1);
		System.out.println("Fyra citat: ");
		quote.display(4);
	}

}

class QuoteLoop {
	
	public void display (int count) {
		for (int i = 1; i <= count ; i++) {
			System.out.println("Tärningen är kastad.");
		}
	}
	
}