public class Wagon 
{

	private Pace currPace;
	private Rations currRations;
	
	public Wagon()
	{
		currPace = Pace.Steady;
		currRations = Rations.Filling;
		System.out.println("Wagon created");
	}

	public Pace getCurrPace() 
	{
		return currPace;
	}

	public void setCurrPace(Pace currPace) 
	{
		this.currPace = currPace;
		System.out.println("Pace set to " + getCurrPace());
	}

	public Rations getCurrRations() 
	{
		return currRations;
	}

	public void setCurrRations(Rations currRations) 
	{
		this.currRations = currRations;
		System.out.println("Rations set to " + getCurrRations());
	}


	
}
