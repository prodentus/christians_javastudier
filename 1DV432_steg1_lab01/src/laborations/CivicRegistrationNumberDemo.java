package laborations;

import java.util.Scanner;

public class CivicRegistrationNumberDemo {

	public static void main(String[] args) {
		
		System.out.println("MAN ELLER KVINNA?");
		System.out.println();
		System.out.println("Ange ett personnummer (ÅÅMMDD-FFFK):");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		CivicRegistrationNumber civicRegistrationNumber = new CivicRegistrationNumber(number);
		if (!civicRegistrationNumber.isWellFormed()) {
			System.out.println("Personnumret " + number + " har inte rätt format!");
		} else if (civicRegistrationNumber.isMale()) {
			System.out.println("Personnumret " + number + " tillhör en man.");
		} else {
			System.out.println("Personnumret " + number + " tillhör en kvinna.");
		}
		scanner.close();
	}

}