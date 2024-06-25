
public class FranchiseDriver {

	public static void main(String[] args) {
		Restaraunt a1  = new Restaraunt("Kingsbridge Mac", 4.8);
		Restaraunt a7  = a1;
		Restaraunt a2  = new Restaraunt("Fordham Road Mac", 4.0);
		Restaraunt a3  = new Restaraunt("Broadway Mac", 4.0);
		Restaraunt a4  = new Restaraunt();
		
		Franchise fran = new Franchise("MacDonalds");
		fran.add(a1);
		fran.add(a2);
		fran.add(a3);
		fran.add(a4);
		fran.add(a1);
		fran.add(a2);
		fran.add(a3);
		fran.add(a4);
		fran.add(a1);
		fran.add(a2);
		fran.add(a3);
		fran.add(a4);
		System.out.println("add is successfull");
		System.out.println(fran );
	}

}
