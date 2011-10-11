
public class Tongue extends Item {
	
	public Tongue() {
		price = 10;
		quantity = 0;
		name = "Tongue";
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
