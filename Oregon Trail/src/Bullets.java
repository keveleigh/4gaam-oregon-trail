
/**
 * The Class Bullets.
 */
public class Bullets extends Item {
	
	/**
	 * Instantiates a new bullets.
	 */
	public Bullets() {
		price = 1;
		quantity = 0;
		name = "Bullets";
		weight = 1;
	}
	
	public Bullets(int quan) {
		price = 1;
		quantity = quan;
		name = "Bullets";
		weight = 1;
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
