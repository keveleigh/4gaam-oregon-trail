import java.util.*;

/**
 * The Class Inventory.
 */
public class Inventory {

	/** The items. */
	ArrayList<Item> items;

	/** The current weight. */
	int currentWeight;

	/**
	 * Instantiates a new inventory.
	 *
	 * @param items the items list
	 * @param currentWeight the current weight
	 */
	public Inventory(ArrayList<Item> items, int currentWeight){
		this.items = items;
		this.currentWeight = currentWeight;
	}

	/**
	 * Adds an item
	 *
	 * @param item the item
	 */
	public void add(Item item){
		for (int index = 0; index <= items.size(); index++){
			//checks to see if item is already in inventory
			if (items.get(index) == item){
				item.quantity++;
			}
			//if item isn't in inventory yet
			else if (items.size()+1 == index){
				items.add(item);
			}
		}
	}

	/**
	 * Removes an item
	 *
	 * @param item the item
	 */
	public void remove(Item item){
		for (int index = 0; index <= items.size(); index++){
			if (items.get(index) == item){
				item.quantity--;
			}
			else if (items.size()+1 == index){
				items.remove(item);
			}
		}
	}
}
