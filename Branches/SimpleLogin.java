import java.util.Scanner;

public class SimpleLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your password:");
		String password = scan.next();
		
		String storedPassword = "pass12345";
		/*
		 * To compare strings in Java for equality, we can use
		 * the equals method.
		 * 
		 *  We can also be able to use the equalsIgnoreCase method.
		 *  
		 *  The equals method is case sensitive and the equalsIgnoreCase method
		 *  is not case sensitive.
		 */
		if(storedPassword.equalsIgnoreCase(password)) {
			System.out.println("Welcome! You are now logged in.");
		}else {
			System.out.println("The password you entered is not correct");
		}

	}

}
