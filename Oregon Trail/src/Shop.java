/**
 * The Class Shop.
 */
public class Shop 
{
	
	/** The my leader. */
	Leader myLeader;
	
	/** The player inventory. */
	Inventory playerInventory;
	
	/** The a. */
	Axle a;
	
	/** The b. */
	Bullets b;
	
	/** The c. */
	Clothes c;
	
	/** The f. */
	Food f;
	
	/** The o. */
	Oxen o;
	
	/** The t. */
	Tongue t;
	
	/** The w. */
	Wheels w;
	
	/**
	 * Instantiates a new shop.
	 */
	public Shop(Leader l, Inventory in)
	{
		myLeader = l;
		playerInventory = in;
		a = new Axle();
		b = new Bullets();
		c = new Clothes();
		f = new Food();
		o = new Oxen();
		t = new Tongue();
		w = new Wheels();
		
	}
	
	/**
	 * Buy.
	 *
	 * @param i the item
	 * @param quant the quantity
	 * @return true, if successful
	 */
	public void buy(Item i, int quant)
	{
		//adds the quantity of items to the players inventory
		
		if (tryBuy(i, quant) == true)
		{
			for (int j = 1; j <= quant; j++)
				playerInventory.add(i);
			
			//subtracts the amount of money the item cost
			myLeader.subtractMoney(i.getTotalPrice());
			
			//changes the players inventory weight
			playerInventory.currentWeight = playerInventory.currentWeight + i.getTotalWeight();
			
		}
	}
	
	public boolean tryBuy(Item i, int quant)
	{
		if (checkWeight(i, quant) == true && checkMoney(i, quant) == true)
			return true;
		else
			return false;
	}
	
	/**
	 * Check money.
	 *
	 * @param i the item
	 * @param quant the quantity
	 * @return true, if successful
	 */
	public boolean checkMoney(Item i, int quant)
	{
		boolean hasMoney = true;
		i.quantity = quant;
		
		//checks to see if the Player has enough money to buy the quantity of items
		if (myLeader.getMoney() >= i.getTotalPrice())
			hasMoney = true;
		else
			hasMoney = false;
		
		return hasMoney;
	}
	
	/**
	 * Check weight.
	 *
	 * @param i the i
	 * @param quant the quant
	 * @return true, if successful
	 */
	public boolean checkWeight(Item i, int quant)
	{
		boolean hasRoom = true;
		i.quantity = quant;
		
		//checks to see if the weight would be too much
		if ((playerInventory.currentWeight + i.getTotalWeight()) > playerInventory.MAX_WEIGHT)
			hasRoom = false;
		else
			hasRoom = true;
		
		return hasRoom;
	}
}
