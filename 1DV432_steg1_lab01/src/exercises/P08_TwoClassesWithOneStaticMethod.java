package exercises_step2;

public class P08_TwoClassesWithOneStaticMethod {

	public static void main(String[] args) {
		System.out.println("Ett citat:");
		QuotationWithStaticVariable.quote();
		System.out.println("Ett citat fyra gånger:");
		for (int i = 1 ; i <= 4 ; i++) {
			QuotationWithStaticVariable.quote();
		}
	}
	
}

class Quotation {
	public static void quote() {
		System.out.println("Tärningen är kastad.");
	}
}