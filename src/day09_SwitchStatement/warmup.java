package day09_SwitchStatement;

public class warmup { // NESTED IF CONDITION

	public static void main(String[] args) {

		String dbUsername = "yusuf";
		String dbPassword = "123";

		String username = "yusuf1";
		String password = "1231";

		if (dbUsername == username) {

			if (dbPassword == password) {
				System.out.println("Access Granted");
			}else {
				System.out.println("Wrong Password");
			}
	
	} else {
		if(password ==dbPassword) {
			System.out.println("Invalid username");
		}else {
			System.out.println("Both username and password are incorrect");
		}
	}
	}
}

/*
 * 
 * public static void main(String[] args) {
 * 
 * String dbUsername = "yusuf"; String dbPassword = "123";
 * 
 * 
 * String username = "yusuff"; String password = "1233";
 * 
 * if (dbUsername == username) {
 * 
 * if(dbPassword ==password) { System.out.println("Access Granted"); } else {
 * System.out.println("Wrong Password"); } } else {
 * System.out.println("Wrong Username"); }
 * 
 * }
 * 
 * }
 * 
 */