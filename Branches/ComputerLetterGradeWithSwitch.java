import java.util.Scanner;

public class ComputerLetterGradeWithSwitch {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int totalScore = 0;
		String letterGrade = "";
		
		System.out.print("Enter your total scores: ");
		totalScore = scan.nextInt();
		
		switch(totalScore) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
			letterGrade = "A";
			break;
		case 92:
		case 91:
		case 90:
			letterGrade = "A-";
			break;	
		/*
		 *  You can complete this but as you can see the ranges of our
		 *  grades are wide, as such you would have to write lots of
		 *  cases for the switch.
		 */
			
			
		}
	}

}
