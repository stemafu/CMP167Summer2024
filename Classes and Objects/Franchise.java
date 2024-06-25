
public class Franchise {
	private String name;
	private Restaraunt []  restaraunts;
	private int numRestaraunts;
	

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
	
	/*
	 * This method is used to remove
	 * a restaraunt that is end of the
	 * franchise. This is the most recently
	 * added restaraunt
	 */
	public void remove() {
		if(this.numRestaraunts <= 0) {
			return;
		}else {
			this.restaraunts[this.numRestaraunts - 1] = null;
			this.numRestaraunts--;
		}
	}
	
	/* This method removes and returns
	 * a restaraunt at the specified index.
	 */
	public Restaraunt remove(int index) {
		if(index < 0) {
			return null;
		}else if (index >= this.numRestaraunts) {
			return null;
		}else {
			Restaraunt removedRes = this.restaraunts[index];
			
			for(int i = index; i < this.numRestaraunts; i++ ) {
				this.restaraunts[i] = this.restaraunts[i + 1];
				
			}
			this.numRestaraunts--;
			
			return removedRes;
		}
		
	}	
	
	
	
	
	/* Let us create an equals method
	 * that return true if two franchises 
	 * are the same. Otherwise, the method will
	 * return false.
	 */
	public boolean equals(Object obj) {
		/*
		 * Compare their addresses and if they are
		 * the same return true.
		 */
		if(this == obj) {
			return true;
		}
		
		/*
		 * If the above test fails, then do a null
		 * check on the parameter.
		 */
		if(obj == null) {
			return false;
		}
		
		/*
		 * we have to convert obj into Franchise.
		 * Before we do that, we have to check to
		 * see if obj is an instance of Franchise.
		 */
		if(!(obj instanceof Franchise)) {
			return false;
		}
		
		// Now convert obj into an object of Franchise
		Franchise otherFranchise = (Franchise)obj;
		
		
		if(!this.name.equalsIgnoreCase(otherFranchise.name)) {
			return false;
		}else {
			
			if(this.numRestaraunts != otherFranchise.numRestaraunts) {
				return false;
			}
			
			for(int i = 0; i < numRestaraunts; i++) {
				if(!this.restaraunts[i].equals(otherFranchise.restaraunts[i])) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public String toString() {
	
		String res = "";
		
		for(int i = 0; i < numRestaraunts; i++) {
	
			res = res + this.restaraunts[i];
		}
		
		return "Franchise [ Name: " + this.name
				+ ", Number of Restataunts: " + this.numRestaraunts
				+ ", Restataunts: " + res;
		
	}
	
}
