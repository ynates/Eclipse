package day12_nestedForLoops;

public class pyramidnumbers {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s <= 5 - i; s++) { //4 space, 3 space, 2 space, 1 space, no space
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2-1; j++) { //loop 1 print 1, loop 2 print 3 2s, loop 3 print
				System.out.print(i);
			}
			System.out.println(" ");
			
			
		}

	}
}
