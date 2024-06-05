
public class StringExample {

	public static void main(String[] args) {
		
		// Create a variable whose data type is String
		
		String name = "Drink Water";
		
		char x = name.charAt(10);
		char y = name.charAt(0);
		
		System.out.print (x);
		System.out.println(y);
		
		// Concatenation example
		
		String firstName = "Peter";
		String lastName = "Smith";
		
		int num = 9000;
		String fullName = firstName + " " + lastName;
		
		
		//System.out.println(fullName + num);
		
		//System.out.println(fullName.length());
		
		int indexofE = fullName.indexOf('e');
		int indexofA = fullName.indexOf('a');
		int indexofO = fullName.indexOf('o');
		
		System.out.println(indexofE);
		
		double pi = Math.PI;
		
		String word2 = "This is any string. In the homework it comes from the keyboard";
		
		
		//System.out.println(fullName + num);
		
		//System.out.println(fullName.length());
		
		int indexofEword2 = word2.indexOf('e');
		int indexofAword2 = word2.indexOf('a');
		int indexofOword2 = word2.indexOf('o');
				
		

	}

}
