import java.util.Scanner;
public class SentinelValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an int (0 ends the loop)");
		
		int value = scan.nextInt();
		/* In this example, we are using a 0 as the sentinel value for the loop
		 * 
		 * When a user enters a 0, the loop terminates.
		 */
		while(value != 0) {
			System.out.println("The user entered " + value);
			
			System.out.println("Enter an int (0 ends the loop)");
			value = scan.nextInt();
		}
		
		

	}

}
