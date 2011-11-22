
import java.util.*;

/**
 * The Class Inventory.
 * 
 * @author Four Guys and a Mann
 * @version v1.15 11/9/11
 */
public class Inventory {

    /** The items. */
    ArrayList<Item> items;
    /** The current weight. */
    int currentWeight;
    /** The max weight. */
    //the max weight may be changed, still need to decide on this
    static int MAX_WEIGHT = 1000;

    /**
     * Instantiates a new inventory.
     */
    public Inventory() {
        this.items = new ArrayList<Item>();
        items.add(new Axle());
        items.add(new Bullets());
        items.add(new Clothes());
        items.add(new Food());
        items.add(new Oxen());
        items.add(new Tongue());
        items.add(new Wheels());
        currentWeight = 0;
    }

	/**
	 * Adds an item.
	 *
	 * @param item The item to be added
	 */
	public void add(Item item){
		if (currentWeight + item.getTotalWeight() > MAX_WEIGHT)
		{
			System.out.println("Your inventory is full.");
		}
		else
		{
			for (int index = 0; index < items.size(); index++)
			{
				//checks to see if item is already in inventory
				Item current = items.get(index);
				if ((current.name).equals(item.name))
				{
					current.quantity += item.getQuantity();
					currentWeight = currentWeight + item.getTotalWeight();
				}
			}
		}
	}
    /**
     * Removes an item.
     *
     * @param item The item to be removed
     */
    public void remove(Item item) {
        if (currentWeight == 0) {
            System.out.println("Your inventory is empty.");
        } else {
            for (int index = 0; index < items.size(); index++) {
                Item current = items.get(index);
                if ((current.name).equals(item.name)) {
                	if (current.getQuantity() == 0) {
                		System.out.println("You don't have any " + item.name + "."); //This should probably be replaced at some point!
                	}
                	else if (current.getQuantity() < item.getQuantity()) {
                    	current.quantity = 0;
                        currentWeight = 0;
                        System.out.println("You have run out of " + item.name + "."); //This should probably be replaced at some point!
                    } else {
                        current.quantity -= item.getQuantity();
                        currentWeight = currentWeight - item.getTotalWeight();
                    }
                }
            }
        }
    }

    /**
     * Checks how many of an item are stored.
     * 0 = axle
     * 1 = bullets
     * 2 = clothes
     * 3 = food
     * 4 = oxen
     * 5 = tongue
     * 6 = wheels
     *
     * @param int i The amount of the item stored.
     * @return The amount of the specified item currently in the inventory.
     */
    public int getQuantity(int i) {
        Item currentItem = items.get(i);
        return currentItem.quantity;
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
}
