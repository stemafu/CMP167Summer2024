
public class Franchise {
	private String name;
	private Restaraunt []  restaraunts;
	private static int numRestaraunts;
	

	public Franchise() {
		this.name = "some name";
		this.restaraunts = new Restaraunt[10];
		numRestaraunts = 0;
	}
	
	public Franchise(String name) {
		this.name = name;
		this.restaraunts = new Restaraunt[10];
		numRestaraunts = 0;
	}	
	
	/* This method adds a restaraut to a 
	 * franchise
	 */
	public void add(Restaraunt restaraunt) {
		/*
		 * Notice this may need to be resized because
		 * the array will get full as you add more items
		 */
		if(numRestaraunts == this.restaraunts.length) {
			// the array is full and must be resized.
			this.resizeRestarauntsArray();
		}
		this.restaraunts[numRestaraunts] = restaraunt;
		numRestaraunts++;
	}
	
	private void resizeRestarauntsArray() {
		/*
		 *  To resize an array, we first create a
		 *  new array that is larger that the old 
		 *  array that is full
		 */
		
		Restaraunt [] newArray	= new Restaraunt[this.restaraunts.length * 2];
		
		/* Once we have created the new array, 
		 * we need to copy the values from the old array
		 * into the new array
		 */
		for(int i = 0; i <this.restaraunts.length; i++) {
			newArray[i] = this.restaraunts[i];
		}
		
		/*
		 * Now we update the address of the old array
		 * to be the address of the new array
		 */
		 this.restaraunts = newArray;
	}
	
	
}
