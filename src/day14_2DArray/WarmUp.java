package day14_2DArray;

public class WarmUp {

	public static void main(String[] args) {
		int[][] array = new int[10][20];
		array[0][0] = 1;

		System.out.println(array[0][0]);

		System.out.println("==========================================");

		int[][] arr = { { 1, 2, 3 }, { 3, 2, 1 } };

		System.out.println(arr.length);
		System.out.println(arr[1].length);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);
		
		System.out.println("==========================================");

		for(int i =0; i<2; i++) {
			
			for(int y=0; y<3;y++) {
				System.out.print(arr[i][y] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		

	}
}
