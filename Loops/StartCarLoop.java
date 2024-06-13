import java.util.Scanner;

public class StartCarLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter on or start to start your car:");
		/*
		 * If the user does not enter start or on, the program will
		 * keep on asking for the user to enter start or on until they enter
		 * the correct input.
		 */
		String userInput = scan.next();
		
		while(!userInput.equals("on") && !userInput.equals("start") ) {
			/*
			 * If the user did not enter on or start, ask for the use
			 * to enter on or start again
			 */
			
			System.out.println("Enter on or start to start your car:");
			/*
			 * If the user does not enter start or on, the program will
			 * keep on asking for the user to enter start or on until they enter
			 * the correct input.
			 */
			userInput = scan.next();		
		}
		
		
		System.out.println("The car has started!");

	}

}
