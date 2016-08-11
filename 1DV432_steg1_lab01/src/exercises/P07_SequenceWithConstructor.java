package exercises_step2;

public class P07_SequenceWithConstructor {

	public static void main(String[] args) {
		SequenceWithConstructor sequence = new SequenceWithConstructor(-3, 24);
		sequence.displayInts();
	}

}

class SequenceWithConstructor {
	
	private int start;
	private int end;
	
	public SequenceWithConstructor() {
		// No argument contructor
	}
	
	public SequenceWithConstructor(int startValue, int endValue) {
		this.start = startValue;
		this.end = endValue;
	}
	
	public void start(int startValue) {
		this.start = startValue;
	}
	
	public void end(int endValue) {
		this.end = endValue;
	}
	
	public void displayInts() {
		for (int i = this.start ; i <= this.end ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}