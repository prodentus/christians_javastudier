package exercises_step2;

public class P04_MethodWithTwoParameters {

	public static void main(String[] args) {
		QuoteWithTwoParameters quote = new QuoteWithTwoParameters();
		System.out.println("Ett eget citat:");
		quote.customDisplay("Att tala är silver, att tiga är guld", 1);
		System.out.println("Ett eget citat fyra gånger:");
		quote.customDisplay("Den som inte frågar får inget veta.", 4);
	}

}

class QuoteWithTwoParameters {
	
	public void customDisplay (String quoteString, int quoteCount) {
		for ( int i = 1 ; i <= quoteCount ; i++) {
			System.out.println(quoteString);
		}
	}
	
}
