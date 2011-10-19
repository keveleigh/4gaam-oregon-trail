
/**
 * The Class Item.
 */
public abstract class Item {
	
	/** The quantity. */
	int quantity;
	
	/** The price. */
	int price;
	
	/** The name. */
	String name;
	
	/** The weight. */
	int weight;
	
	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Gets the total price.
	 *
	 * @return the total price
	 */
	public int getTotalPrice(){
		return quantity*price;
	}
	
	/**
	 * Gets the indiv weight.
	 *
	 * @return the indiv weight
	 */
	public int getIndivWeight() {
		return weight;
	}
	
	/**
	 * Gets the total weight.
	 *
	 * @return the total weight
	 */
	public int getTotalWeight() {
		return quantity*weight;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the quantity.
	 *
	 * @param newQuan the new quantity
	 */
	public void setQuantity(int newQuan) {
		quantity = newQuan;
	}
	
	/**
	 * Decrement.
	 */
	public void decrement() {
		if (quantity > 0)
			quantity--;
	}
	
	/**
	 * Use.
	 */
	public abstract void use();
}