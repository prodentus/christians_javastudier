package exercise_step3_608;

public class HandleArrayElements2 {
	
	private int[] instanceArray;
	
	public HandleArrayElements2(int arrayLength) {
		this.instanceArray = new int[arrayLength];
		this.setElementValuesToIndex();
	}
	
	private void setElementValuesToIndex() {
		for (int i = 0 ; i < instanceArray.length ; i++) {
			instanceArray[i] = i;
		}
	}
	
	public void addOneToEachElement() {
		for (int i = 0 ; i < instanceArray.length ; i++) {
			instanceArray[i] += 1;
		}
	}
	
	public String toString() {
		char[] charArray = new char[instanceArray.length];
		for (int i = 0 ; i < instanceArray.length ; i++) {
			// OBS! The method forDigit does not seem to work from 10 and up!
			charArray[i] = Character.forDigit(instanceArray[i], 10);
		}
		return new String(charArray);
	}

}