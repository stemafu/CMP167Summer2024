import java.util.Scanner;

public class StartCarUSingDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userInput = "";
		String ans = "";
		do {
			do {
				System.out.println("Enter on or start to start your car:");
				userInput = scan.next();
			}while(!userInput.equals("on") && !userInput.equals("start"));


			System.out.println("The car is now on");
			System.out.println("The car is now moving");
			System.out.println("The car has now stopped");

			
			System.out.println("Start again? yes or no");
			ans = scan.next();
		}while(ans.equalsIgnoreCase("yes"));

	}

}
