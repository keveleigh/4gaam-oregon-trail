
public class Wheels extends Item {
	
	public Wheels() {
		price = 10;
		quantity = 0;
		name = "Wheels";
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
