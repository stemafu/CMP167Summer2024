import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("Not a 1 or 2 or 3");
		}

	}

}
