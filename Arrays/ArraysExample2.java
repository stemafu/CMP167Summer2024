/*
 * This is our class example on arrays on June 18, 2024.
 */
public class ArraysExample2 {
	
	/* Write a method that takes an array of integers
	 * as a parameter and shift the values in the array
	 * to left once.
	 */
	public static void shiftArray(int [] nums) {
		int temp = nums[0];
		
		for(int i = 0; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}
		
		nums[nums.length - 1] = temp;
	}
	
	public static void shiftArray(int [] nums, int times) {
		
		for(int i = 0; i < times; i++) {
			shiftArray( nums);
		}
	}
	
	public static void display(int [] nums) {
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}	
	
	
	/* Let us create a method that returns true if two given arrays
	 * of integers have the same values. Otherwise the method should return
	 * false.
	 */
	public static boolean equals(int [] nums1, int [] nums2) {
		
		/* If the two arrays have the same address,
		 * we know they are referring to the same location
		 * and this means they will have the same values too.
		 */
		if(nums2 == nums1) {
			return true;
		}else if(nums1.length != nums2.length) {
			return false;
		}else {
			for(int i = 0; i <nums1.length; i++) {
				if(nums1[i] != nums2[i]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	/*
	 * Searching for Values in Arrays
	 * 
	 * One way for searching for a value inside an array is to use linear search.
	 * 
	 * Linear search is also called sequential search.
	 * 
	 * Linear search compares the value that we are search for against each element
	 * in the array start from the first index. If the elements is found at some
	 * index in the array, we return the value of that index. However, if we continue
	 * the search until the end of the array, and we do not find the item that we are
	 * searching for, we return -1.
	 * 
	 * In the following method we are searching for key in nums.
	 */
	public static int linearSearch(int [] nums, int key) {
		for(int i = 0; i < nums.length; i++) {
			/*
			 * If a value at an index of the array is equal to the value of what we
			 * are searching for, then it means we found that the element is in the
			 * array and we will return the index where we found the value
			 */
			if(nums[i] == key) {
				return i;
			}
		}
		
		/* 
		 * This means we did not find the element in the array and we return -1.
		 */
		return -1;
	}

	public static void main(String[] args) {
		int [] scores  = {90, 100, 110, 120, 130};
		display(scores);
		shiftArray(scores, 2);
		display(scores);
		
		
		/*
		 * Copying arrays
		 */
		int [] a = {9, 10, 11, 12};
		
		/* Do not copy arrays in this as this only copies the address of
		 * array to the new array. This means both array are pointing at the same
		 * address.
		 */
		int [] b = a;

		System.out.println(equals(a, a));
		
		display(a);
		display(b);
		
		display(a);
		display(b);
		
		/* To copy array elements into a new array, we need to create a
		 * new array and then copy each element into the new array.
		 */
		
		// We are creating a new array 
		int [] c = new int[a.length];
		
		// We are copying the values from one original array into a new array
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		System.out.println(linearSearch(a, 120));

	}

}
