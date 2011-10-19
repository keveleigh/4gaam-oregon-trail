
/**
 * The Class Bullets.
 */
public class Bullets extends Item {
	
	/**
	 * Instantiates a new bullets.
	 */
	public Bullets() {
		price = 10;
		quantity = 1;
		name = "Bullets";
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
