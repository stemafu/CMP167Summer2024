import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println(num + " is a positive number");
		}

	}

}
