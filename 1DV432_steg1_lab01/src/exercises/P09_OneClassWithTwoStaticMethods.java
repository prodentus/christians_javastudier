package exercises;

public class P09_OneClassWithTwoStaticMethods {

	public static void main(String[] args) {
		System.out.println("Ett citat:");
		quote();
		System.out.println("Ett citat fyra gånger:");
		for (int i = 1 ; i <= 4 ; i++) {
			quote();
		}
	}
	
	public static void quote() {
		System.out.println("Tärningen är kastad.");
	}

}