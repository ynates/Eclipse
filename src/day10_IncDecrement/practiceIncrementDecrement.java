package day10_IncDecrement;

public class practiceIncrementDecrement {

	
	public static void main(String[] args) {
		
		int a =10;
		a = a+1;
		a = a+1;
		
	System.out.println(a);
		
		
	int b = 10;
	++b;  //pre-increment
	b++;  //post-increment
	
	System.out.println(b);
	
	
	int x =10;
	int y = ++x;			//pre-increment----first increase then assign
	
	System.out.println("Value of y is " + y);
	System.out.println("Value of x is " +x);
	
	int z = 10;
	int q = z++;   			//post-increment---first assign then increase
	
	System.out.println("Value of z is " +z);
	System.out.println("Value of q is " +q);
	
	
	
	int d =10;
	--d;
	
	System.out.println("d value is: " + d);
	
	int h =100;
	int g = --h;			//pre-decrement---first decrease then assign
	
	System.out.println("h value is: " +h  + "Value of g is: " + g);
	
	
	
	int T =100;
	int L = T--;			//post-decrement---first assign then decrease
	
	System.out.println("T value is: " + T + "L value is: " +L);
	// T is 99 L is 100
	
	
	int Z =10, W;
	
	W = Z++ + Z++;
	System.out.println(W);
	System.out.println(Z);
	
	}
}
