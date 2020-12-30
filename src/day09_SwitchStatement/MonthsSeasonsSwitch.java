package day09_SwitchStatement;

import java.util.Scanner;

public class MonthsSeasonsSwitch {

	public static void main(String[] args) {

		char c = 'z';
		

		String message;

		switch (c) {

		case 'a':
			message = "It is vowel";
			break;
		case 'e':
			message = "It is vowel";
			break;
		case 'i':
			message = "It is vowel";
			break;

		case 'o':
			message = "It is vowel";
			break;
		case 'u':
			message = "It is vowel";
			break;
		
		default:
			message = "Not Vowel";
			break;
		}

		System.out.println(message);
		
		
	}
}
