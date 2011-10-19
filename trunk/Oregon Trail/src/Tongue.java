
/**
 * The Class Tongue.
 */
public class Tongue extends Item {
	
	/**
	 * Instantiates a new tongue.
	 */
	public Tongue() {
		price = 10;
		quantity = 1;
		name = "Tongue";
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
