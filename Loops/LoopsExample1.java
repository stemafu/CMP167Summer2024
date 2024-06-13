import java.util.Scanner;

public class LoopsExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = scan.nextInt();
		
		int count = 0;
		while(count <= num) {
			System.out.println("CMP 167");
			count = count + 1;
		}

	}

}
