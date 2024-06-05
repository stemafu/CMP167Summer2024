
public class BoleansExample1 {

	public static void main(String[] args) {
		
		/* A boolean data type is used to store values
		 * that are either true or false.
		 * 
		 * 
		 */
		int X  = 9;
		int Y = 10;
		boolean isValid = (Y + X) < X;
		
		System.out.println(isValid);
		
		/* The following is checking to see of the value
		 * of X is the same at that of Y
		 */
		System.out.println( X == Y);

		
		/* The following is checking to see of the value
		 * of X is the same at that of X
		 */
		System.out.println( X == X);	
		
		
		/* The following is checking to see of the value
		 * of Y is the same at that of X
		 */
		System.out.println( Y == X);		
	}

}
