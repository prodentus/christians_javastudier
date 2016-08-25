package laborations;

/** Tells when and how many boxes with birthday candles you have to buy until your
 * 100th birthday and how many candles you have left afterwards.
 * You start with 1 box and each box contains 24 candles.
 * 2016-06-27 Adjusted newBoxesNeededCount. Corrected indentation of if-statement and removed blank row.
 * 2016-06-28 Karl suggests converting the static variables to local in main.
 * 
 * @author christian
 */

public class Steg1_lab11 {
	
	public static final int CANDLES_PER_BOX = 24;
	
	private static int boxesOwnedCount = 1;
	private static int candlesUsedCount = 0;
	private static int candlesRemainingCount = 0;

	public static void main(String[] args) {
		for (int age = 1 ; age <= 100 ; age ++) {
			candlesUsedCount += age;
			if (candlesUsedCount > boxesOwnedCount * CANDLES_PER_BOX) {
				int newboxesBoughtCount = newBoxesNeededCount(candlesUsedCount, boxesOwnedCount);
				boxesOwnedCount += newboxesBoughtCount;
				System.out.println("år " + age + ", köp " + newboxesBoughtCount + " ask(ar)");
			}
		}
		candlesRemainingCount = boxesOwnedCount * CANDLES_PER_BOX - candlesUsedCount;
		System.out.println("Det går åt " + boxesOwnedCount + " askar och det blir "
				+ candlesRemainingCount + " ljus över.");
	}
	
	private static int newBoxesNeededCount (int candlesUsedCount, int boxesOwnedCount) {
		 int newCandlesNeeded = candlesUsedCount - boxesOwnedCount * CANDLES_PER_BOX ;
		 if (newCandlesNeeded % CANDLES_PER_BOX == 0) {
		 	return newCandlesNeeded / CANDLES_PER_BOX;
		 } else {
		 	return newCandlesNeeded / CANDLES_PER_BOX + 1;
		 }
	}
	
}