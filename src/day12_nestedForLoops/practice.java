package day12_nestedForLoops;

public class practice {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int x = 1; x <= 2; x++) {
				System.out.println("This is an inner loop " + x);
			}

			System.out.println("------This is outer loop" + i);
		}

		
		
		
	}
}

