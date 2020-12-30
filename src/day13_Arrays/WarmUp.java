package day13_Arrays;

public class WarmUp {

	public static void main(String[] args) {
		
		
		
		int [] array;
		array = new int [5];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		
		for(int i =0; i <array.length; i++) {
			System.out.println(i + "-->" + array[i]);
		}
		
		System.out.println();
		
		int [] numbers = {100,200,300,400,500};
		
		for(int a =0; a<numbers.length; a++) {
			System.out.print(numbers[a] + " ");
		}
		
		System.out.println();
		
		System.out.println(numbers.length);
	}
}
