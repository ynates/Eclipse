package day14_2DArray;

public class ArrayMaximum {

	public static void main(String[] args) {

		int[][] number = {

				{ 2, 0, 0 }, { 0, 4, 0 }, { 0, 0, 6 }

		};
		int count = 0;
		int matrixnum = number[0].length * number.length;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {

				if (number[i][j] == 0) {
					count++;
				}

			}

			System.out.println();
		}

		if (count > matrixnum/2) {
			System.out.println("It is sparse");
		} else {
			System.out.println("Not sparse");
		}

	
	}
}
