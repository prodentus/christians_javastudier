package exercises_step2;

public class P11_OneClassWithStaticVariable {
	
	public static String maxim;

	public static void main(String[] args) {
		maxim = "Tärningen är kastad.";
		System.out.println("Ett citat:");
		quote();
		System.out.println("Ett citat fyra gånger:");
		for (int i = 1 ; i <= 4 ; i++) {
			quote();
		}

	}
	
	public static void quote() {
		System.out.println(maxim);
	}

}