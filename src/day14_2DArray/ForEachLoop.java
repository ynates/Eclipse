package day14_2DArray;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numbers = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		for (int each : numbers) {
			System.out.print(each + " ");
		}
		System.out.println("-----------------------------------------------");

		int [][] number = {
				
				{12,54,51,14}, {93,23,53,65}, {9,3,6,7}
				
		};
		
		for(int i =0; i<number.length;i++) {
			for(int j =0; j< number[i].length; j++) {
				System.out.print(number[i][j] + " ");
			}System.out.println();
		}
		System.out.println("-----------------------------------------------");

		String[][] recipe = { 
				
							{ "Milk", "Yogurt", "Cream" }, { "Tomatoes", "Carrots", "Cucumbers" },
							{ "Cake", "Cookies", "Apple Pie" }

							};
		for(String [] row : recipe) {
			for(String item : row) {
				System.out.print(item + " ");
			}
		}
		System.out.println();

		System.out.println("-----------------------------------------------");

		int [] grades = {125,132,95,116,4};
		Arrays.sort(grades);
		
		System.out.println("Min Value is: " + grades[0]);
		System.out.println("Max Value is: " + grades[4]);
		
		
	}
}