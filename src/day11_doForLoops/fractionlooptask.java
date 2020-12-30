package day11_doForLoops;

import java.util.Scanner;

public class fractionlooptask {

	
	
	public static void main(String[] args) {
		
		// 1/2 + 2/3 + 3/4 + 4/5 +......10/11
		
		Scanner input=new Scanner (System.in);
		
		double sum =0;
		
		for(double i=1; i<=10; i++) {
			
			sum = sum+i / (i+1);  // (1/2) -> (2/3) -> (3/4)...
		}
		
		System.out.println(sum);
		
		
	}
}


