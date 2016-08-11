package exercises_step2;

public class Calculator {
	
	private int operand1;
	private int operand2;
	private char operation;

	public Calculator(String operand1, String operand2, String operation) {
		this.operand1 = Integer.parseInt(operand1);
		this.operand2 = Integer.parseInt(operand2);
		this.operation = operation.charAt(0);
	}
	
	public int getAnswer() {
		int answer = 0;
		switch (operation) {
			case '+':
				answer = operand1 + operand2;
				break;
			case '-':
				answer = operand1 - operand2;
				break;
			case '*':
				answer = operand1 * operand2;
				break;
			case '/':
				answer = operand1 / operand2;
				break;
		}
		return answer;
	}
	
}