import java.util.Scanner;

public class OverSizedArrayExample {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int [] nums = new int[1000];
		int num;
		int count = 0;
		do {
			System.out.print("Enter a number: ");
			num = scnr.nextInt();
			
			if(num > 0 && count < nums.length) {
				nums[count] = num;
				count++;
			}
			
		}while(num > 0);
		
		int sumResult = 0;
		
		for(int i = 0; i < count; i++) {
			sumResult += nums[i];
		}
		System.out.println(sumResult);

	}

}
