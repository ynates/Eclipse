package day11_doForLoops;

public class Factorials {

	public static void main(String[] args) {
		int sum = 1;

		for (int i = 1; i <= 5; i++) {
			sum = sum * i;
			
			//sum = 1 *1 =1
			//sum = 1 *2 =2
			//sum = 2 *3 =6
			//sum = 6 *4 =24
			//sum = 24*5 =120
		}
		System.out.println(sum);
	}
}
