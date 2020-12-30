package day11_doForLoops;

import java.util.Scanner;

public class SUMofDigits {

	public static void main(String[] args) {
		
		int sum =0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num = scan.nextInt();
		int reverse =0;
		int lastDigit;

		while (num != 0) {

			lastDigit = num % 10;
			//System.out.print(lastDigit);
			num = num / 10;
			
			sum = sum + lastDigit;

			
		} System.out.println(sum);
	}
}
