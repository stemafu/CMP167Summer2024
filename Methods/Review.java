import java.util.Scanner;

public class Review {
	// 10 5 20 100 -10
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		int largest = num;
		int total = 0;
		while(num >0) {
			 total = total + num;
			
			 
			System.out.println("Enter a number: ");
			num = scan.nextInt();
			
			if(num > largest)
				largest = num;
		}

	}

}
