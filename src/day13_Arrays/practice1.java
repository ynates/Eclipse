package day13_Arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class practice1 {

	public static void main(String[] args) {

		int [] salary = {121,643,752,264,243,754,234,745,23,234};
		
		int store = salary[0];
		int store2 =1000;
		
		for(int i =0; i<salary.length;i++) {
			if(salary[i] >store) {
				store = salary[i];
			}
			if(salary[i]<store2 ) {
				store2 = salary[i];
			}
		}
		System.out.println("Max is:" + store);
		System.out.println("Min is: " +store2);
		
		
	}
}
