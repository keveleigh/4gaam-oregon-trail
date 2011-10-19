
/**
 * The Class Wheels.
 */
public class Wheels extends Item {
	
	/**
	 * Instantiates a new wheels.
	 */
	public Wheels() {
		price = 10;
		quantity = 1;
		name = "Wheels";
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
