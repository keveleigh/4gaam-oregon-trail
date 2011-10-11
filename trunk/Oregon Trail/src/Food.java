
public class Food extends Item {
	
	public Food() {
		price = 10;
		quantity = 0;
		name = "Food";
		weight = 20;
	}

	@Override
	public void use() {
		// Check to make sure quantity is greater than 0
		if (quantity > 0) {
			
			// Decrease quantity
			decrement();
		}
	}

}
