import java.util.Scanner;

public class StringsFromKeyboard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some words");
		String word = scan.next();
		
		int indexofE = word.indexOf('e');
		int indexofA = word.indexOf('a');
		int indexofO = word.indexOf('o');		
		
		
		//String word1 = scan.next();
		// How would I print qoutes
		System.out.println(word);
		//System.out.println(word1);
		
		String remainingWords = scan.nextLine();
		System.out.println(remainingWords);
		
		System.out.println("\"" + word + "\"");
		
		System.out.println("'a'");

	}

}
