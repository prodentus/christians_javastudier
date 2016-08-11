package cl222zy;

/**
 * Rolls a 6-sided die a (1000 * die-size) number of times.
 * Then outputs a table showing the frequency for each die-roll name.
 * This typically shows that the frequency is close to 1000 for each die-roll name.
 * @author Christian Löwendahl
 * 2016-07-03
 */

import java.util.Random;

public class DieRollFrequency {

	public static final String[] DIE_ROLL_NAMES = {"Ettor", "Tvåor", "Treor", "Fyror", "Femmor", "Sexor"};
	public static final int SIZE_OF_DIE = DIE_ROLL_NAMES.length;
	
	public static void main(String[] args) {
		int dieRollCount = SIZE_OF_DIE * 1000;
		int[] dieRollResults = new int[SIZE_OF_DIE];
		for (int i = 0 ; i < dieRollCount ; i++) {
			Random random = new Random();
			int dieRoll = random.nextInt(SIZE_OF_DIE);
			dieRollResults[dieRoll] ++;
		}
		System.out.println("Frekvenstabell över " + dieRollCount + " kast med en " + SIZE_OF_DIE + "-sidig tärning");
		for (int i = 0 ; i < SIZE_OF_DIE ; i++) {
			System.out.format("%-8s%5s\n", (DIE_ROLL_NAMES[i] + ":"), dieRollResults[i]);
		}
	}

}