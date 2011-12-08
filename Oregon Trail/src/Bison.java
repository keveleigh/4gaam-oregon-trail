public class Bison extends Animal
{
	/**
	 * The constructor for the bison.
	 * @param row The row where the bison is located.
	 * @param col The column where the bison is located.
	 */
	
	public Bison(int row, int col)
	{
		this.row = row;
		this.col = col;
		this.personalID = 2; //Allows for identification of the animal as a bison.
		health = 2;
		f = 50;
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