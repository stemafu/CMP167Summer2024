import java.util.Scanner;

public class DivideNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("A enter a value for X and Y");
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		/*
		 * Remember that we cannot divide a number by a 0.
		 * 
		 * In Java this leads to an error when you run your program.
		 */
		
		
		if(Y == 0) {
			System.out.println("Y has value of 0 and you cannot divide a number by a 0");
		}else {
			int total = X / Y;
			System.out.println("Answer is " + total);
		}
		

	}

}
