
public class ArrayAsMethodParameters {
	
	/* 
	 * Arrays can also be used as parameters to methods.
	 * 
	 * When we use an array as a parameter, in that array parameter
	 * we are keeping an address.
	 * 
	 * In the following example, I would like us to create a method
	 * called sum that takes an array of integers and returns the 
	 * sum of the integers.
	 */
	public static int sum(int [] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		
		return sum;
	}
	
	/*
	 * 
	 */
	public static double getAverage(int [] nums) {
		return sum(nums) / (double)nums.length;
	}
	
	/*
	 * We want to write a method that takes an array of integers
	 * and returns the largest value in the array.
	 * 
	 */
	public static int getMax(int [] nums) {
		/*
		 * Create a variable that you will use to store the largest element
		 */
		int largest;
		
		/*
		 * Take the first element from the array and place it into the
		 * variable largest. We are initially assuming that the first elements
		 * in the array is the largest element.
		 */
		largest = nums[0];
		
		/* 
		 * Next we need a loop that will iterate through all the elements
		 * searching for the largest element.
		 * 
		 * We will make a for loop to read each element and compare it against
		 * the largest element. We will make update to the largest element
		 * when the value we just read is greater than the current value in largest
		 */
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > largest)
				largest = nums[i];
		}
		
		
		/*
		 * Once you are done searching, you return the largest value
		 */
		return largest;
	}
	
	public static void display(int [] nums) {
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int [] nums, int index1, int index2) {
		/* To swap values, I need to create a temp variable
		 * that will keep a value from one of the indexes
		 */
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

	public static void main(String[] args) {
		int [] scores = new int[5];
		scores[0] = 100;
		scores[1] = 89;
		scores[2] = 445;
		scores[3] = 67;
		scores[4] = 74;
		System.out.println("Sum " + sum(scores));
		System.out.println("Largest " + getMax(scores));
		System.out.println("AVG " + getAverage(scores));
		
		//Swapping values
		System.out.println("Before swapping");
		display(scores);
		swap(scores, 0, 4);
		System.out.println("After swapping");
		display(scores);

	}

}
