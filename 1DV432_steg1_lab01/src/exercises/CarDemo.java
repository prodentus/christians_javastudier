package exercises;

public class CarDemo {

	public static void main(String[] args) {
		System.out.println("\nPROVKÖRNING\n");
		System.out.println("Skapar en bil och ger full gas.");
		Car car = new Car("Ferrari", 20);
		car.turnOnRadio(true);
		for (int i = 1 ; i <= 10 ; i++) {
			car.accelerate(20);
		}
	}

}
