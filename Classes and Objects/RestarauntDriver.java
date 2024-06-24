
public class RestarauntDriver {
	
	public static void main(String [] args) {
		Restaraunt a1  = new Restaraunt();
		Restaraunt a7  = a1;
		Restaraunt a2  = new Restaraunt();
		Restaraunt a3  = new Restaraunt();
		Restaraunt a4  = new Restaraunt();
		
		Restaraunt a5  = new Restaraunt("Kingsbridge Cafe", 2.5);
		Restaraunt a6 = null;
		Restaraunt a8 = null;
		
		//System.out.println(a8.equals(a6));
		System.out.println("Equals false " + a1.equals(a6));
		
		System.out.println("Equals true " +a1.equals(a1));

		System.out.println(a1.getName());
		a1.display();
		
		a1.setName("Lehman College Harmony Foods");
		a2.setName("Lehman College Harmony Foods");
		a1.setRating(2.5);
		a2.setRating(2.5);
		System.out.println("Equals true " +a1.equals(a2));

		System.out.println(a1.getName());
		a1.display();
		
		System.out.println(a1);
		

	
	
	}

}
