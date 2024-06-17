
public class MethodsExample1 {
	
	
	/* Let us define a basic method
	 * 
	 */
	public static void test() {
		System.out.println("NYC!");
		
		/* Any variable that is defined within a method
		 * can only be accessed and used within the method.
		 * 
		 * This means this type of a variable cannot be accessed outside
		 * of the method where it is defined (declared).
		 * 
		 * A variable that is defined within a method is referred to as
		 * local variable. It is called a local variable because it can 
		 * only be accessed locally. It cannot be accessed outside of where 
		 * it is defined.
		 */
		int count = 90;
		System.out.println(count);
	}
	
	/* In the following example, we have String name
	 * placed inside (). This is an example a parameter.
	 * The official name of these are called formal
	 * parameters. If you notice, you will see that
	 * this parameter is just a variable declaration.
	 * The formal parameters are place holders for some
	 * actual values. The actual values are supplied when
	 * the method is being called. So, the supplied value
	 * ends up being stored in the formal parameter.
	 * After that, it can be used in the method.
	 */
	public static void display(String name) {
		/* Do not assign a value to a parameter inside
		 * the method where the parameter is defined.
		 * 
		 * The parameter becomes useless but it is 
		 * a common mistake that begginers make.
		 */
		System.out.println("Your name is " + name);
	}
	
	
	/* Let us write a method called add that takes two
	 * int parameters and prints the sum of the values
	 * that may be in the parameters.
	 * 
	 * Multiple parameters are separated by commas.
	 */
	public static void add(int num1, int num2) {
		int total = num1 + num2;
		System.out.println("Sum is " + total);
	}

	public static void main(String[] args) {
		test();
		Lehman.printName();
		
		String someValue = "Drink Water";
		display(someValue);
		
		add(90, 10);
		
		add(5000, 1124);

	}

}
