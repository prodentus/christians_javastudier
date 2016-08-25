package laborations;


/**
 * Steg3_lab08
 * Rolls a die with dieRollNames given by the constructor parameter.
 * The die is rolled (1000 * die-size) number of times.
 * Then outputs a table showing the frequency for each die-roll name.
 * This typically shows that the frequency is close to 1000 for each die-roll name.
 * 
 * @author Christian Löwendahl
 * 2016-07-03
 */

import java.util.Random;

public class DieRolls {
	
	public static final int DIE_ROLL_MULTIPLIER = 1000;
	private String[] dieRollNames = null;
	private int sizeOfDie = 0;
	private int dieRollCount = 0;
	private int[] dieRollResults = null;
	
	public DieRolls(String[] dieRollNames) {
		this.dieRollNames = dieRollNames;
		this.sizeOfDie = dieRollNames.length;
		this.dieRollCount = sizeOfDie * DIE_ROLL_MULTIPLIER;
		this.dieRollResults = new int[sizeOfDie];
	}
	
	public void rollDice() {
		for (int i = 0 ; i < dieRollCount ; i++) {
			int dieRoll = rollOneDie();
			increaseDieRollResults(dieRoll);
		}
	}

	private int rollOneDie() {
		Random random = new Random();
		int dieRoll = random.nextInt(sizeOfDie);
		return dieRoll;
	}
	
	private void increaseDieRollResults(int dieRoll) {
		dieRollResults[dieRoll] ++;
	}
	
	public void showFrequencyTable() {
		System.out.println("Frekvenstabell över " + dieRollCount + " kast med en " + sizeOfDie + "-sidig tärning");
		for (int i = 0 ; i < sizeOfDie ; i++) {
			System.out.format("%-8s%5s\n", (dieRollNames[i] + ":"), dieRollResults[i]);
		}
	}
	
}