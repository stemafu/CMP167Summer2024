import java.util.Random;
public class RandomNumbersExample {

	public static void main(String[] args) {
		
		Random randomGen = new Random();
		
		int num = randomGen.nextInt(3);
		
		
		String [] names = {"Lehman College", "BCC", "CCNY"};
		
		System.out.println(names[num]);
		
		

	}

}
