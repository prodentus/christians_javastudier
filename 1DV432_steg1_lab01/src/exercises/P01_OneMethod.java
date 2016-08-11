package exercises_step2;

public class P01_OneMethod {

	public static void main(String[] args) {
		Quote quote = new Quote();
		System.out.println("Ett citat: ");
		quote.display();
		System.out.println("Ett citat fyra gånger: ");
		for (int i = 0 ; i <= 4 ; ++i) {
			quote.display();
		}
	}
		
}

class Quote {
	
	public void display() {
		System.out.println("Tärningen är kastad.");
	}
	
}