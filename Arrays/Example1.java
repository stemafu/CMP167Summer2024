
public class Example1 {
	
	/* In this example, we are going to see how 
	 * to create arrays and how to assign elements
	 * to array indexes (indeces).
	 * 
	 * Eventually, we will start to use loops with arrays.
	 */

	public static void main(String[] args) {
		
		/* The following is declaring an array whose size is 5
		 * This means this array is capable of storing 5 elements.
		 */
		int [] scores = new int[5];
		
		/*
		 * Now in the following code, we will see how to assign values
		 * to array indexes.
		 */
		scores[0] = 97;
		scores[0] = scores[0] + 3;
		
		scores[1] = 67;
		scores[2] = 86;
		scores[3] = 50;
		scores[4] = 99;
		

		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		// With arrays, we can also easily integrate the use of loops.
		System.out.println();
		
		int sum = 0;
		for(int i = 0;i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("The sum is = " + sum);
		
		
		// Let us see how to create an array using an array initializer
		
		double [] myList = {7.0, 6.5, 4.8, 3.1};
		
		myList[1] = myList[1] + 4;
		System.out.println("Values inside my list array below:");
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}

	}

}
