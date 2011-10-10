public class Leader extends Person
{
	
	int money;
	private Profession myProfession;
	
	public Leader(String name, Profession p)
	{
		super(name);
		myProfession = p;
		setInitMoney();
		
		System.out.println("Leader profession: " + getMyProfession());
		System.out.println("Initial money : " + getMoney());
	}
	
	public Leader (String name)
	{
		super(name);
		System.out.println("Leader name : "+ getName());
	}

	public int getMoney() 
	{
		return money;
	}

	public void setInitMoney()
	{
		if (myProfession.equals(Profession.Farmer))
			money = 700; //decide real numbers
		else if (myProfession.equals(Profession.Carpenter))
			money = 1000; //decide real numbers
		else
			money = 1300; //decide real numbers
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
