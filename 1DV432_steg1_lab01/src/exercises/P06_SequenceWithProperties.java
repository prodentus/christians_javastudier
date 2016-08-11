package exercises_step2;

public class P06_SequenceWithProperties {

	public static void main(String[] args) {
		SequenceWithProperties sequence = new SequenceWithProperties();
		sequence.start = -3;
		sequence.end = 24;
		sequence.displayInts();
		sequence.start = 56;
		sequence.end = 67;
		sequence.displayInts();
	}

}

class SequenceWithProperties {
	
	int start;
	int end;
	
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