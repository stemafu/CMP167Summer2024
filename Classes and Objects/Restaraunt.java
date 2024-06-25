/*
 * A class is a blueprint for creating an object.
 */
public class Restaraunt {
	/* In this example, we notice that the declaration of the variables
	 * name and rating is not inside any method but it is inside a class
	 * and we are missing the keyword static. This makes these variables
	 * instance variables.
	 * 
	 * Encapsulation:
	 * With encapsulation, we make the data fields
	 * private and we create methods for accessing
	 * and manipulating these private data fields.
	 */
	private String name = "Test";
	private double rating = 0.0;
	private String address = "No Value";
	private static String industryCategory = "UNK";
	
	/* When a field is made private, it cannot be
	 * directly access from the outside.
	 * It can only be directly accessed within the
	 * class.
	 */
	
	
	/*
	 * The following is an example of a default
	 * constructor. It takes no parameters.
	 * If we do not define any constructor in 
	 * our class, Java will provide a default
	 * constructor that we can use to create 
	 * objects.
	 */
	
	public Restaraunt() {
		name = "No name";
		rating = 0.0;
		address = "No address has been provided yet";
		industryCategory = "Unknown industry";
	}
	
	/* Just like what we saw with methods,
	 * we can be able to create multiple constructors
	 * with the same name but different parameters.
	 * 
	 * This is called constructor overloading.
	 */
	public Restaraunt(String name) {
		this.name = name;
		this.rating = 0.0;
		this.address = "No address has been provided yet";
		
	}
	
	public Restaraunt(String name, double rating) {
		this.name = name;
		/*if(name.equals("")) {
			this.name = "UKN";
		}else {
			this.name = name;
		}*/
		
		if(rating < 0) {
			this.rating = 0.0;
		}else {
			this.rating = rating;
		}
		
		this.address = "No address has been provided yet";
	}	
	
	public Restaraunt(String name, double rating,
			String address) {
		this.name = name;
		if(rating < 0) {
			this.rating = 0.0;
		}else {
			this.rating = rating;
		}
		
		this.address = address;
	}
	
	/* Since we have defined our data fields as private,
	 * to make them accessible we need to define methods
	 * that we can use to access(to get) their values or 
	 * to modify(to set, to change) their values.
	 * 
	 * The method for modifying a value inside a private
	 * data field is called a set method. This is because
	 * it is used to set(change) a value. These methods
	 * are also called setters, or mutators. Recall that
	 * mutate means to change.
	 * 
	 * The methods for accessing (getting) a value from a
	 * private data field is called a get method.
	 * This is also called a getter or accessor  method.
	 */
	
	/*
	 * The following getter method return a name.
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * The following getter method returns a rating
	 */
	public double getRating() {
		return rating;
	}
	
	/*
	 * The following getter method returns an address.
	 */
	public String getAddress() {
		return address;
	}
	
	
	/* The following setter method is used to
	 * change a name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/* The following setter method is used to set
	 * a rating. rating does not allow negative values.
	 * If the parameter is a negative value, set rating to
	 * 0.0
	 */
	public void setRating(double rating) {
		if(rating < 0) {
			this.rating = 0.0;
		}else {
			this.rating = rating;
		}
	}
	
	/*
	 * The following setter method is used to set address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	 * We want to create a set method for the static
	 * variable industryCategory. 
	 * 
	 * Remember that industryCategory is static. Static
	 * variables below to the class not to individual
	 * objects. As as result static variables are accessed
	 * using Class Names
	 * ClassName.StaticVariableName.
	 * 
	 * How do we access(call) static methods?
	 * If you are outside of the class where the method is 
	 * defined, you use the following syntax:
	 * ClassName.staticMethodName(actual parameter list);
	 * 
	 * Static methods just like static variables belong to
	 * the class. They do not belong to individual objects.
	 */
	public static String getIndustryCategory() {
		return industryCategory;
	}
	
	public static void setIndustryCategory(String industryCategory1) {
		industryCategory = industryCategory1;
	}
	
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Rating: " + this.rating);
		System.out.println("Address: " + this.address);
	}
	
	/* To compare objects for equality, we need to compare
	 * their values.
	 * 
	 * In Java, we define a method called equals method
	 * The equals method takes a parameter and return true
	 * if the parameter object is the same as the calling object
	 * They have the same values in their instance variables.
	 * 
	 */
	public boolean equals(Object obj) {
		
		/* 1. If the two objects that we are comparing
		 * have the same address, then we can just 
		 * return true.
		 */
		if(this == obj) {
			return true;
		}		
		
		
		/*
		 *  2. A null check for the parameter
		 *  If the parameter is null return false
		 */
		
		if(obj == null){
			return false;
		}
		

		
		/*
		 * 3. We need to convert obj which Object to
		 * Restaraunt.
		 */
		if(! (obj instanceof Restaraunt)) {
			return false;
		}
		
		Restaraunt otherObject = (Restaraunt)obj;
		// Now we can compare individual values
		if(this.rating != otherObject.rating) {
			return false;
		}else if(!this.name.equalsIgnoreCase(otherObject.name)) {
			return false;
		}else if (!this.address.equalsIgnoreCase(otherObject.address)) {
			return false;
		}
		
		return true;
	}
	
	
	public String toString() {
		return "Restaraunt [ Name: " + this.name 
				+ ", Address: " + this.address 
				+ ", Rating: " + this.rating +"]" ;
	}
}
