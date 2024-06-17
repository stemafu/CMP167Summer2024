import java.util.Scanner;
public class ArrayValuesFromUsers {

	public static void main(String[] args) {
		int [] scores = new int[10];
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		for(int i = 0; i <scores.length; i++) {
			System.out.println("Enter a score:");
			int num = scan.nextInt();
			scores[i] = num;
		}
		
		
		 
		System.out.println("Sum " + ArrayAsMethodParameters.sum(scores));
		System.out.println("Largest " + ArrayAsMethodParameters.getMax(scores));
		System.out.println("AVG " + ArrayAsMethodParameters.getAverage(scores));
		

	}

}
