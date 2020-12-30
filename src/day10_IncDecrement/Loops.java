package day10_IncDecrement;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num = scan.nextInt();
		int reverse =0;
		int lastDigit;

		while (num != 0) {

			lastDigit = num % 10;
			//System.out.print(lastDigit);
			num = num / 10;
			
			reverse = lastDigit;

			System.out.print(reverse);

		}
	}
}
