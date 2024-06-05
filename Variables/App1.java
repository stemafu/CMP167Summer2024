/*
 * In this program, we are learning how to create(declare)
 * variables and also to assign values to these 
 * variables
 */
public class App1 {

	public static void main(String[] args) {
		
		//In the following statement, we are creating a variable
		int numStudents;
		
		// In the following statement, we are assigning a value to our variable
		numStudents = 20;
		
		System.out.println(numStudents);
		
		/* Since a value inside a variable can change at any point in time"
		 * during the execution of our program, we assign another value to
		 * our variable in the following line.
		 */
		numStudents = numStudents + 1;
		
		System.out.println(numStudents);

	}

}
