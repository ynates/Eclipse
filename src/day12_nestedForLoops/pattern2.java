package day12_nestedForLoops;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		/*
		 * int row =5; for (int i = 1; i <= row; i++) { //COLUMN
		 * 
		 * for (int j = 1; j <= 4; j++) { System.out.print(j); //ROW
		 * }System.out.println(""); //this belongs to outer loop -COLUMN }
		 */

		/*
		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s <= 5 - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(i);
			}
			System.out.println();
			
			*/

		 int n, i, j, space = 1;
	        System.out.print("Enter the number of rows: ");
	        Scanner s = new Scanner(System.in);
	        n = s.nextInt();
	        space = n - 1;
	        for (j = 1; j <= n; j++) 
	        {
	            for (i = 1; i <= space; i++) 
	            {
	                System.out.print(" ");
	            }
	            
	            space--;
	            for (i = 1; i <= 2 * j - 1; i++) 
	            {
	                System.out.print("*");                
	            }
	            System.out.println("");
	        }
	        space = 1;
	        for (j = 1; j <= n - 1; j++) 
	        {
	            for (i = 1; i <= space; i++) 
	            {
	                System.out.print(" ");
	            }
	            space++;
	            for (i = 1; i <= 2 * (n - j) - 1; i++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	    }
	}
		
