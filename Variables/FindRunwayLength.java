import java.util.Scanner;

public class FindRunwayLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int v;
		double a;
		double length;
		
		System.out.print("Enter speed and acceleration: ");
		v = scan.nextInt();
		a = scan.nextDouble();
		
		length = Math.pow(v, 2) / (2 * a);
		
		System.out.println("The minimum runway length for this airplane " + length);

	}

}
