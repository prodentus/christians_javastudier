package exercises;

public class p10_TwoClassesWithStaticVariable {

	public static void main(String[] args) {
		QuotationWithStaticVariable.maxim = "Tärningen är kastad.";
		System.out.println("Ett citat:");
		QuotationWithStaticVariable.quote();
		System.out.println("Ett citat fyra gånger:");
		for (int i = 1 ; i <= 4 ; i++) {
			QuotationWithStaticVariable.quote();
		}
	}

}

class QuotationWithStaticVariable {
	public static String maxim;

	public static void quote() {
		System.out.println(maxim);
	}
}