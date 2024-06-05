/*
 * 
 * In this example. we are going to learn how to get input from the keyboard.
 * 
 * In order for us to get input from the keyboard, we need to use the Scanner
 * class.
 * 
 * To use the Scanner class, we first need to import it.
 * 
 * Once you import, you Scanner class you will need to create an object of
 * the Scanner class. This object makes the methods(operations, functionalities)
 * of the Scanner class available in our program.
 */

import java.util.Scanner;

public class ScannerInputExample {

	public static void main(String[] args) {
		
		/*
		 *  To use the Scanner class, we are creating an object of the class
		 *  and this will allow us to use any of the available methods 
		 *  found in the Scanner class documentation.
		 */
		Scanner keyboard = new Scanner(System.in);
		
		
		int num;
		/*
		 * This is a prompt that a user should see telling what they 
		 * should do on screen (console)
		 */
		System.out.print("What is your pin number? ");
		
		// Now let us get some value from the keyboard
		num = keyboard.nextInt();
		
		
		/*
		 * nextInt() is a method that allows us to read an int from the keyboard
		 */
		
		System.out.println(num);

	}

}
