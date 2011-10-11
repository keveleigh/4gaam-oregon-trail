
/**
 * The Class Leader, which represents the main player of the game
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public class Leader extends Person
{
	
	/** The money the player has */
	int money;
	
	/** The my profession of the player */
	private Profession myProfession;
	
	/**
	 * Instantiates a new leader.
	 *
	 * @param name the name
	 * @param p the profession
	 */
	public Leader(String name, Profession p)
	{
		super(name);
		myProfession = p;
		setInitMoney();
		
		System.out.println("Leader profession: " + getMyProfession());
		System.out.println("Initial money : " + getMoney());
	}

	/**
	 * Gets the money.
	 *
	 * @return the money
	 */
	public int getMoney() 
	{
		return money;
	}

	/**
	 * Sets the initial money by setting a different amount of money depending
	 * on what profession the player is .
	 */
	public void setInitMoney()
	{
		if (myProfession.equals(Profession.Farmer))
			money = 1000; //decide real numbers
		else if (myProfession.equals(Profession.Carpenter))
			money = 1200; //decide real numbers
		else
			money = 1500; //decide real numbers
	}
	
	/**
	 * Sets the money.
	 *
	 * @param money the new money
	 */
	public void setMoney(int money) 
	{
		this.money = money;
	}
	
	/**
	 * Adds money to the money the player already has
	 *
	 * @param toAdd the to add
	 */
	public void addMoney(int toAdd)
	{
		money = money + toAdd;
	}
	
	/**
	 * Subtracts money from the players money
	 *
	 * @param toSubtract the to subtract
	 */
	public void subtractMoney(int toSubtract)
	{
		money = money - toSubtract;
	}

	/**
	 * Gets the profession.
	 *
	 * @return the profession
	 */
	public Profession getMyProfession() 
	{
		return myProfession;
	}

	/**
	 * Sets the profession.
	 *
	 * @param myProfession the new profession
	 */
	public void setMyProfession(Profession myProfession) 
	{
		this.myProfession = myProfession;
	}

}
