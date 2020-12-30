package day11_doForLoops;

public class ReverseTaskStored {

	public static void main(String[] args) {
		
		int num = 121;
		int reverse =0;
		int num2 =num;
		
		while(num > 0) {
			reverse = reverse*10 + num % 10;
			num = num/10;
			
			
			}
		

		if(num2 == reverse) {
			System.out.println("It is Palindrome");
			
		}else {
			System.out.println("It is not Palindrome");
		}
		
		
		
		
		
	}
}
