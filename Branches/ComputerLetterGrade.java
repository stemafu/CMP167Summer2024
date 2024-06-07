import java.util.Scanner;

public class ComputerLetterGrade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int totalScore = 0;
		String letterGrade = "";
		
		System.out.print("Enter your total scores: ");
		totalScore = scan.nextInt();
		
		if(totalScore >= 93)
			letterGrade = "A";
		else if ( (totalScore >= 90) && (totalScore <= 92))
			letterGrade = "A-";
		else if ( (totalScore >= 87) && (totalScore <= 89))
			letterGrade = "B+";
		else if ( (totalScore >= 83) && (totalScore <= 86))
			letterGrade = "B";		
		else if ( (totalScore >= 80) && (totalScore <= 82) ) {
			letterGrade = "B-";	
		}else if ( (totalScore >= 77) && (totalScore <= 79))
			letterGrade = "C+";
		else if ( (totalScore >= 73) && (totalScore <= 76))
			letterGrade = "C";		
		else if ((totalScore >= 70) && (totalScore <= 72))
			letterGrade = "C-";	
		else if ( (totalScore >= 60) && (totalScore <= 69))
			letterGrade = "D";	
		else
			letterGrade = "F";	
		System.out.println("Your letter grade is " + letterGrade);

	
	}

}
