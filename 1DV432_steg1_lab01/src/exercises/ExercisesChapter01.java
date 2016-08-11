package exercises_step1;

public class ExercisesChapter01 {

	public static void main(String[] args) {
		runExercise107();
	}

	private static void runExercise103() {
		int count = 0;
		double distance = 1.5;
		System.out.println(distance);
	}
		
	private static void runExercise104() {
		int time = 5;
		int speed = 80;
		int distance = time * speed;
		System.out.println(distance);
	}
	
	private static void runExercise105() {
		double balance = 100;
		double interestRate = 0.05;
		double interest = balance * interestRate;
		System.out.println(interest);
	}
	
	private static void runExercise107() {
		int x = 0;
		int y = 0;
		int z = 0;
		int First = 3 * x;
		int Second = 3 * x + y;
		double Third = (x+y)/7;
		double Fourth = (3*x + y) / (z+2);	
	}

}