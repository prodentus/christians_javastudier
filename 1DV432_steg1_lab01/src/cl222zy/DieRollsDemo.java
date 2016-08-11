package cl222zy;

public class DieRollsDemo {
	
	public static final String[] DIE_ROLL_NAMES = {"Ettor", "Tvåor", "Treor", "Fyror", "Femmor", "Sexor", "Sjuor"};

	public static void main(String[] args) {
		DieRolls dieRolls = new DieRolls(DIE_ROLL_NAMES);
		dieRolls.rollDice();
		dieRolls.showFrequencyTable();
	}

}