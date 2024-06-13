import java.util.Scanner;

/*
 * Write a program that reads positive integers from the user (keyboard)
 * and prints the sum of the numbers and also their average.
 * 
 * The program terminates reading of the numbers when a negative value
 * is entered.
 */



public class AddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		System.out.println("Enter a positive number (a negative number to end)");
		int num = scan.nextInt();
		int sum = 0;
		int countNums = 0;
		while(num >= 1) {
			// add the new number to the current sum
			sum = sum + num;

			// We need to get the next value
			System.out.println("Enter a positive number (a negative number to end)");
			num = scan.nextInt();

			countNums++; // increment
		}



		if(countNums <= 0) {
			System.out.println("The user did not enter any positive numbers");
		}else {
			System.out.println("The total is " + sum);

			/*
			 * To compute the average we need to take the total(sum)  divided by
			 * the count of the inputs.
			 */

			double average = (double)sum / countNums;

			System.out.println("The average is " + average );
		}

	}

}
