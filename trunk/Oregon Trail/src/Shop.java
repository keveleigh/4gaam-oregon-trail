/**
 * The Class Shop.
 *
 * @author Four Guys and a Mann
 * @version v1.2 11/9/11
 */
public class Shop 
{
	
	/** The my leader. */
	Leader myLeader;
	
	/** The players wagon. */
	Wagon playerWagon;
	
	/**
	 * Instantiates a new shop.
	 */
	public Shop()
	{
	}
	
	/**
	 * Buy.
	 *
	 * @param i the item
	 * @return true, if successful
	 */
	public String buy(Item i)
	{
		//adds the quantity of items to the players inventory
		
		if (tryBuy(i) == true)
		{
			playerWagon.getWagonLoad().add(i);
			
			//subtracts the amount of money the item cost
			myLeader.subtractMoney(i.getTotalPrice());
			
			return "Successful purchase!";
		}
		else
		{
			return "Unable to buy. Check weight and money.";
		}
	}
	
	public boolean tryBuy(Item i)
	{
		if (checkWeight(i) == true && checkMoney(i) == true)
			return true;
		else
			return false;
	}
	
	/**
	 * Check money.
	 *
	 * @param i the item
	 * @return true, if successful
	 */
	public boolean checkMoney(Item i)
	{
		boolean hasMoney = true;
		
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
	 * @param i The item(s) to be purchased
	 * @return true, if the purchase is successful
	 */
	public boolean checkWeight(Item i)
	{
		boolean hasRoom = true;
		
		//checks to see if the weight would be too much
		if ((playerWagon.getWagonLoad().currentWeight + i.getTotalWeight()) > playerWagon.getWagonLoad().MAX_WEIGHT)
			hasRoom = false;
		else
			hasRoom = true;
		
		return hasRoom;
	}
	
	/**
	 * Updates the shop with the player's current game state.
	 *
	 * @param w The current wagon
	 */
	public void enter(Wagon w)
	{
		myLeader = w.getLeader();
		playerWagon = w;
	}
}
