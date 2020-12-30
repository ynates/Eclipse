package practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many pennies?");
		int penny = scan.nextInt();

		System.out.println("How many nickels?");
		int nickel = scan.nextInt();

		System.out.println("How many dimes?");
		int dimes = scan.nextInt();

		System.out.println("How many quarters");
		int quarter = scan.nextInt();

		double total = ((penny * 0.01) + (nickel * 0.05) + (dimes * .10) + (quarter * .25));
		System.out.println(total);

		if (total < 1.00) {
			System.out.println("You are so close to $1.00. You were under $1.00 by: " + (1.00 - total) + " cents");
		} else if (total == 1.0) {
			System.out.println("Hurray! It is $1.00. You Win!");

		} else {
			System.out.println("You went over $1.00 by: " + (total - 1.00) + " cents");

		}

	}
}
