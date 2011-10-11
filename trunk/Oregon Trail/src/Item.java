
public abstract class Item {
	int quantity;
	int price;
	String name;
	int weight;
	
	public int getQuantity() {
		return quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getIndivWeight() {
		return weight;
	}
	
	public int getTotalWeight() {
		return quantity*weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setQuantity(int newQuan) {
		quantity = newQuan;
	}
	
	public abstract void use();
}