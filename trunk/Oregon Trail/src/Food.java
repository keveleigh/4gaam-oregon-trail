
/**
 * The Class Food.
 */
public class Food extends Item {
	
	/**
	 * Instantiates a new food.
	 */
	public Food() {
		price = 10;
		quantity = 1;
		name = "Food";
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
