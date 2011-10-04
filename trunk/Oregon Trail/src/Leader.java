public class Leader extends Person
{
	
	int money;
	private enum Profession {Farmer, Banker, Carpenter};
	private Profession myProfession;
	
	public Leader(String name, Profession p)
	{
		super(name);
		myProfession = p;
		setInitMoney();
	}

	public int getMoney() 
	{
		return money;
	}

	public void setInitMoney()
	{
		if (myProfession.equals(Profession.Farmer))
			money = 10; //decide real numbers
		else if (myProfession.equals(Profession.Carpenter))
			money = 20; //decide real numbers
		else
			money = 20; //decide real numbers
	}
	
	public void setMoney(int money) 
	{
		this.money = money;
	}
	
	public void addMoney(int toAdd)
	{
		money = money + toAdd;
	}
	
	public void subtractMoney(int toSubtract)
	{
		money = money - toSubtract;
	}

	public Profession getMyProfession() 
	{
		return myProfession;
	}

	public void setMyProfession(Profession myProfession) 
	{
		this.myProfession = myProfession;
	}

}
