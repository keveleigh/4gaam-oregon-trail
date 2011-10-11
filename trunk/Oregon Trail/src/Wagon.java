
/**
 * The Class Wagon, which controls the pace and the rations of the game.
 * This is one of the main classes of the game
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public class Wagon 
{

	/** The current pace. */
	private Pace currPace;
	
	/** The current rations. */
	private Rations currRations;
	
	/**
	 * Instantiates a new wagon.
	 */
	public Wagon()
	{
		currPace = Pace.Steady;
		currRations = Rations.Filling;
		System.out.println("Wagon created");
	}

	/**
	 * Gets the current pace.
	 *
	 * @return the current pace
	 */
	public Pace getCurrPace() 
	{
		return currPace;
	}

	/**
	 * Sets the current pace.
	 *
	 * @param currPace the new current pace
	 */
	public void setCurrPace(Pace currPace) 
	{
		this.currPace = currPace;
		System.out.println("Pace set to " + getCurrPace());
	}

	/**
	 * Gets the current rations.
	 *
	 * @return the current rations
	 */
	public Rations getCurrRations() 
	{
		return currRations;
	}

	/**
	 * Sets the current rations.
	 *
	 * @param currRations the new current rations
	 */
	public void setCurrRations(Rations currRations) 
	{
		this.currRations = currRations;
		System.out.println("Rations set to " + getCurrRations());
	}


	
}
