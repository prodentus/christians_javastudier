package exercises_step2;

public class P05_SequenceOfIntegers {

	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		sequence.displayInts(-3,24);
		sequence.displayInts(56,67);
	}

}

class Sequence {
	
	public void displayInts(int startInteger, int endInteger) {
		for ( int i = startInteger ; i <= endInteger ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}