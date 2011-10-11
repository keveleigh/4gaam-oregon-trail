
/**
 * The Class Person, which represents either a Leader or a Member
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public abstract class Person 
{
	
	/** The name of the person */
	private String name;
	
	/** The my health of the person */
	Health myHealth;
	
	/**
	 * Instantiates a new person.
	 *
	 * @param n the n
	 */
	public Person(String n)
	{
		name = n;
		myHealth = Health.Excellent; 
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param newName the new name
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Gets the my health.
	 *
	 * @return the my health
	 */
	public Health getMyHealth() 
	{
		return myHealth;
	}

	/**
	 * Sets the my health.
	 *
	 * @param myHealth the new my health
	 */
	public void setMyHealth(Health myHealth) 
	{
		this.myHealth = myHealth;
	}

}
