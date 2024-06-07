import java.util.Scanner;

public class PositiveNumberNestedExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println(num + " is a positive number");
			
			if( (num % 2) == 0) {
				System.out.println(num + " is an even positive number");
			}
			
			
			if( (num % 5) == 0) {
				System.out.println(num + " is divisible by 5");
			}			
			
			
		}

	}

}
