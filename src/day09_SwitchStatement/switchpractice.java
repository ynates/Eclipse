package day09_SwitchStatement;

import java.util.Scanner;

public class switchpractice {

	public static void main(String[] args) {

		/*
		 * Have a user enter their letter grade, and using a switch statement, print out
		 * a message letting them know how they did.
		 */

		/*
		 * 
		 * switch (condition){
		 * 
		 * 
		 * }
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("How many sides should your object contain?");

		int side = scan.nextInt();

		String message;

		switch (side) {

		case 1:
			message = "There is no shape with 1 Side";
			break;
		
		case 2:
			message = "There is no shape with 2 Side";
			break;
		
		case 3:
			message = "Triangle has 3 Sides";
			break;
		case 4:
			message = "Square has 4 Sides";
			break;
		case 5:
			message = "Pentagon has 5 Sides";
			break;
		case 6:
			message = "Hexagon has 6 Sides";
			break;
		case 7:
			message = "Heptagon has 7 Sides";
			break;
		case 8:
			message = "Octagon has 8 Sides";
			break;
		case 9:
			message = "Nonagon has 9 Sides";
			break;
		case 10:
			message = "Decagon has 10 Sides";
			break;
		default:
			message = "Error - Please Enter Correct Number";
		}
		System.out.println(message);

		
		
		
		
		
		
		// The break statement is used inside the switch to terminate a statement
		// sequence.

	}
}
