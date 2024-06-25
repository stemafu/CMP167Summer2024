import java.util.Random;
public class RandomNumbersExample {
	String [] names;
	Random randomGen = new Random();
	public RandomNumbersExample() {
		names = new String[6];
	}
	
	public void putNames() {
		names[0] = "Lehman College";
		names[1] = "BCC";
		names[2] = "CCNY";
		names[3] = "Hostos";
		names[4] = "John Jay";
		names[5] = "Hunter";
	}
	
	public String getRandomName() {
		int randomNum = randomGen.nextInt(names.length);
		return names[randomNum ];
	}

	public static void main(String[] args) {
		
		/*
		 * We always have to remember that a method 
		 * does nothing until when it is called.
		 */
		RandomNumbersExample example = new RandomNumbersExample();
		example.putNames();
		System.out.println(example.getRandomName());
		

	}

}
