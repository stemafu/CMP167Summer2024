import java.util.Scanner;

public class VariablesExample3Improved {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		// Declaring variables
		int firstInt;
		int num1;
		int num2;
		int total;
		
		// Assignment statements
		System.out.print("Enter your first number: ");
		firstInt = keyboard.nextInt();
		
		System.out.print("Enter your second number: ");
		num1 = keyboard.nextInt();
		
		System.out.print("Enter your third number: ");
		num2 = keyboard.nextInt();
		
		// Assignment statement for calculations
		
		total = firstInt * (num1 + num2);
		
		System.out.print("The total is: $");
		System.out.println(total);
		
		

	}

}
