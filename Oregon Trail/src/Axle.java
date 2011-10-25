
/**
 * The Class Axle.
 */
public class Axle extends Item {
	
	/**
	 * Instantiates a new axle.
	 */
	public Axle() {
		price = 10;
		quantity = 0;
		name = "Axle";
		weight = 10;
	}
	
	public Axle(int quan) {
		price = 10;
		quantity = quan;
		name = "Axle";
		weight = 10;
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
