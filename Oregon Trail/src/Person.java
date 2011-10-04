
public class Person 
{
	private String name;
	private enum Health {Excellent, Fair, Poor} //there will be more states
	Health myHealth;
	
	public Person(String n)
	{
		name = n;
		myHealth = Health.Excellent; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}

	public Health getMyHealth() 
	{
		return myHealth;
	}

	public void setMyHealth(Health myHealth) 
	{
		this.myHealth = myHealth;
	}

}
