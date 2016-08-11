package exercises_step2;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ange det första talet: ");
		String firstOperand = scanner.next();
		System.out.println("Ange operator (+ - * /):");
		String operator = scanner.next();
		System.out.println("Ange andra talet: ");
		String secondOperand = scanner.next();
		
		Calculator calculator = new Calculator(firstOperand, secondOperand, operator);
		
		int answer = calculator.getAnswer();
		
		String result = String.format("%s %s %s = %d", firstOperand, operator, secondOperand, answer);
		
		System.out.println(result);
		

	}

}
