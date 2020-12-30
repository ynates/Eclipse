package day16_StringMethods;

public class WarmUp {

	public static void main(String[] args) {
		
		//STRING OBJECTS ARE IMMUTABLE

		String str = "Welcome to QA career Sprinters!";

		int length = str.length();
		System.out.println(length);
		
		String str2 = "Welcome, Students!";
		System.out.println(str2.length());
		
		
		
		
		
		System.out.println("TO UPPER CASE OR LOWER CASE");
		
		String upperCase = str2.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = str2.toLowerCase();
		System.out.println(lowerCase);
		
		
		
		
		
		System.out.println("CONTAINS METHOD");
		
		boolean containsmethod = str2.contains("welcome");
		System.out.println(containsmethod);		

		
		
		
		
		System.out.println("EQUALS METHOD");
		String str1 = "Hello";
		str2 = "hello";
		
		boolean equal = str1.equals(str);
		System.out.println(equal);
		
		boolean equals = str1.equalsIgnoreCase(str2);
		System.out.println(equals);

		
		
		
		
		
		System.out.println("CONCATENATING 2 STRINGS");
		
		String str3 = "Hello";
		String str4 = "Ali";
		
		System.out.println(str3 + str4); //old way
		System.out.println(str3.concat(str4));

		
		
		
		
		
		
		System.out.println("INDEXOF");
		System.out.println(str3.indexOf('o'));

		
		
		System.out.println("CHARAT");
		System.out.println(str3.charAt(0));

		
		
		
		System.out.println("COMPARE TO");
		System.out.println(str3.compareTo(str4));
		
		
		
		System.out.println("ENDS WITH");
		boolean endswith = str3.endsWith("o");
		System.out.println(endswith);
		
		
		
		
		System.out.println("REPLACE METHOD");
		String string = str4.replace("Ali", "Yusuf");
		System.out.println(string);
	}
}
