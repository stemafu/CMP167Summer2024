/*
 * The return type is used to return a value from a method.
 * 
 * If a method does not return any value, the return type is
 * void. Void as a return type indicates that the method,
 * does not return any value.
 * 
 * The return type is used in methods that have or require calculations
 * or computations.
 * 
 * 
 * The add method that we created earlier is a good example, were we are
 * doing calculations. SO, we are going to rewrite so that it returns a number
 * 
 * Write a method called add that takes two int parameters, and adds the values
 * of the two parameters and returns the result.
 */
public class MethodsReturnTypeExample {
	
	public static int add(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}
	/* As you can observe, we do have in this class
	 * three different methods called add but they have 
	 * different parameters. The one above, has two parameters
	 * and the one immediately below had one parameter. This is called method overloading.
	 * 
	 * As you can see method overloading allows you to define multiple
	 * methods with the same name but different parameter. The difference in
	 * parameter can either data type or the number of parameter.
	 * 
	 * The other add method below even though it also take two parameters, the 
	 * their data types of the add methods that take two parameters are different.
	 */
	public static int add(int n) {
		//int total = n * (n + 1) / 2;
		
		int total = 0;
		for(int i = 0; i <= n; i++) {
			total = total + i;
		}
		
		return total;
	}
	
	
	public static double add(double num1, double num2) {
		double total = num1 + num2;
		return total;
	}
	
	
	/* Write a method that takes a number and returns
	 * the factorial of that number.
	 * 
	 * With this example, you can observe that the body of 
	 * a method can also contain loops.
	 */
	public static int fact(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++)
			fact = fact * i;
			
		return fact;
	}
	
	
	/* Write a method that takes two int parameters are returns
	 * the largest int of the two.
	 * 
	 * This example is showing that the body of a method can also contain
	 * if statements
	 */
	public static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	/* Write a method that takes three int parameters are returns
	 * the largest int of the three.
	 * */
	public static int max(int num1, int num2, int num3) {
		int m1 = max(num1, num2);
		int largest = max(m1, num3);
		return largest;
	}
	
	
	public static void printTree() {
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println("   *");
		System.out.println("   *");
		System.out.println("   *");
		System.out.println("   *");
		System.out.println("");
	}

	public static void main(String[] args) {
		/* Now that we have a method that takes a parameter and 
		 * return a number, let us see how we can use a value return from
		 * a method call.
		 */
		/*
		 * Here were assigning a value returned from the method call
		 * to a variable ans. 
		 */
		int ans = add(1000, (50 * 20));
		System.out.println(ans);
		
		System.out.print(Math.pow(add(2, 4), 2));
		
		printTree();
		printTree();
		printTree();
		printTree();
		
		System.out.println(fact(5));
		System.out.println(fact(6));
		System.out.println(add(20000));
		
		//System.out.println(fact("String"));
		
		System.out.println(5);
		///System.out.println("strings");

	}
	

}
