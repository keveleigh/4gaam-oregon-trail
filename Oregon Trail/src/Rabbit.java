public class Rabbit extends Animal
{
	/**
	 * The constructor for the rabbit.
	 * @param row The row where the rabbit is located.
	 * @param col The column where the rabbit is located.
	 */
	
	public Rabbit(int row, int col)
	{
		this.row = row;
		this.col = col;
		this.personalID = 1; //Allows for identification of the animal as a rabbit.
		health = 1;
		f = 10;
	}
		
	@Override
	public int loseHealth() {
		health -= 1;
		return health;
	}

	@Override
	public int getFood() {
		return f;
	}

	@Override
	public int getPersonalID() {
		return personalID;
	}
	
	public void setRow(int row)
	{
		this.row = row;
	}
	
	public void setCol(int col)
	{
		this.col = col;
	}

	public int getRowLocation() 
	{
		return row;
	}

	public int getColLocation() 
	{
		return col;
	}
}
