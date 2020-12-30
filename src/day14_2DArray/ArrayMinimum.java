package day14_2DArray;

import java.util.Scanner;

public class ArrayMinimum {

	public static void main(String[] args) {

		int num; 
		int sum =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		num = scan.nextInt();
		
		int i =1;
		while(i <=num/2) {
			if(num%i ==0) {
				sum +=i;
			}
			i++;
		}
		if(sum ==num) {
			System.out.println("Given number is a perfect number");
		}
		else {
			System.out.println("Given number is not a perfect number");
		}
		
		
		
		
	}
}
