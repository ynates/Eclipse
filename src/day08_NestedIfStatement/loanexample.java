package day08_NestedIfStatement;

import java.util.Scanner;

public class loanexample {

	/*
	 To qualify for a loan there are two conditions that must be met. The person must make at least $30K and the must also have been at their job for 2 or more years
	 */
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose operation you want to perform");
		
		String str = scan.next();
		
		System.out.println("Now enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		
		switch(str) {
		
		case "Addition":
			System.out.println(num1+num2);
			break;
			
		case "Multiplication":
			System.out.println(num1*num2);
			break;
			
		case "Division":
			System.out.println(num1/num2);
			break;
		case "Subtraction":
			System.out.println(num1-num2);
			break;
			
			default:
				System.out.println("Try again Please");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		/*
		
		int requiredsalary =30000;
		int requiredyearemployed =2;
		
		System.out.println("Enter your salary");
		
		Scanner scan = new Scanner(System.in);
		double salary = scan.nextDouble();
		
		System.out.println("Enter the years with your current employer");
		
		double years = scan.nextDouble();
		
		if(salary >= requiredsalary) {
			if(years >= requiredyearemployed) {
				System.out.println("Congrats! You are Approved");
			}
			else {
				System.out.println("Sorry, you must have worked at least for 2 years");
			}
			
		}else {
			System.out.println("Sorry, you must meet 30K threshold");
		}
		
		*/
		
		
		
		
		
	}
}
