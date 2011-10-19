
/**
 * The Class Clothes.
 */
public class Clothes extends Item {
	
	/**
	 * Instantiates a new clothes.
	 */
	public Clothes() {
		price = 10;
		quantity = 1;
		name = "Clothes";
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
