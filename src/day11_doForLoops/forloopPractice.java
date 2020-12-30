package day11_doForLoops;

public class forloopPractice {
	public static void main(String[] args) {

		//1+2-3+4-5+6-7+8+9+10
		
		int sum = 0;
		int sum2 = 0;

		for (int a = 0; a <= 10; a++) {
			if (a % 3 != 0) {
				sum = sum + a;
			} else {
				sum2 = sum2 + a;
			}
		}
		System.out.println(sum-sum2);

	}
}
