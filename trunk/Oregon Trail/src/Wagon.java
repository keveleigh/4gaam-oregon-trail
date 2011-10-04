public class Wagon 
{
	private enum Pace {Leisurely, Steady, Grueling};
	private enum Rations {Filling, Meager, BareBones};
	private Pace currPace;
	private Rations currRations;
	
	public Wagon()
	{
		currPace = Pace.Steady;
		currRations = Rations.Filling;
		
	}

	public Pace getCurrPace() 
	{
		return currPace;
	}

	public void setCurrPace(Pace currPace) 
	{
		this.currPace = currPace;
	}

	public Rations getCurrRations() 
	{
		return currRations;
	}

	public void setCurrRations(Rations currRations) 
	{
		this.currRations = currRations;
	}


	
}
