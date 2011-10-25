
/**
 * The Class Oxen.
 */
public class Oxen extends Item {
	
	/**
	 * Instantiates a new oxen.
	 */
	public Oxen() {
		price = 20;
		quantity = 0;
		name = "Oxen";
		weight = 50;
	}

	public Oxen(int quan) {
		price = 20;
		quantity = quan;
		name = "Oxen";
		weight = 50;
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
