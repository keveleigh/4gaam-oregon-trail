
/**
 * The Class Oxen.
 */
public class Oxen extends Item {
	
	/**
	 * Instantiates a new oxen.
	 */
	public Oxen() {
		price = 10;
		quantity = 1;
		name = "Oxen";
		weight = 20;
	}

	/* (non-Javadoc)
	 * @see Item#use()
	 */
	@Override
	public void use() {
		// Check to make sure quantity is greater than 0
		if (quantity > 0) {
			
			// Decrease quantity
			decrement();
		}
	}

}
