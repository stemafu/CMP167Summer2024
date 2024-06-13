
public class StringsAndLoops {

	public static void main(String[] args) {
		
		/* A string is a sequence of characters
		 * Each character in a string is given an index(position).
		 * The first character is a string is always at index 0
		 * and the last character is always at index = str.length() of the string -1
		 * 
		 * We also have the operation length() that is applied on a string.
		 * length() returns the total amount of characters in a string.
		 * 
		 * We can also be able to use loops to iterate over strings.
		 */
		
		String name = "Lehman College";
		
		String nameCopy = name.replace(" ", "");
		nameCopy = name.toLowerCase();
		
		System.out.println(nameCopy);
		//System.out.println(name.charAt(1));
		//System.out.println(name.charAt(3));
		
		for(int i = 0; i < nameCopy.length(); i++) {
			System.out.println(nameCopy.charAt(i));
		}

	}

}
