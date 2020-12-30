package day13_Arrays;

public class homework3 {

	public static void main(String[] args) {

		  int[][] nums = {
                  {5,2,3,7},
                  {1,5,2,2},
                  {1,2,3,4}
         };
		  
		  int sum = 0;

		  for(int i =2; i<nums.length; i++) {
			  
			  for(int j =0; j <4; j++) {
				  sum+=nums[i][j];
				  
			  }System.out.println(sum);
		  }
		
		  
		  
		  
		  
	}
}
