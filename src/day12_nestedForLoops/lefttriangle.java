package day12_nestedForLoops;

public class lefttriangle {

	public static void main(String[] args) {

		
		for(int i =1; i <= 5; i++) { //column
			
			for(int s =1; s <=5-i; s++) {
				System.out.print(" ");
			}
			for(int j =1; j <=i; j++ ) { //row i =1 j =1
				
				System.out.print(j + "");
				
				
			}
			System.out.println(" ");

		}
		
		
		
		
		
		
	}
}
