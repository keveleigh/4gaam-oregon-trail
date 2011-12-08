import java.awt.*;
import javax.swing.*;

public class huntTile extends JButton {
	ImageIcon rabbit = new ImageIcon(getClass().getResource("/huntTile/resources/rabbit.png")); //The rabbit image.
	ImageIcon bison = new ImageIcon(getClass().getResource("huntTile/resources/bison.png")); //The bison image.
	private int state; //The current state, either 0 for blank, 1 for rabbit, or 2 for bison, of the tile.
	private int row; //The row the tile is located in.
	private int col; //The column the tile is located in.
	private Animal a;
		
	public huntTile(int row, int col)
	{
		this.state = 0; //Defaults the tile to blank.
		this.row = row;
		this.col = col;
		setBackground(Color.yellow);
		a = null;
	}
		
	public boolean hasAnimal() //Returns true if there is an animal in the spot, false if not.
	{
		if (state == 1 || state == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	public void addAnimal(int input)
	{
		setState(input);
	}
		
	public void removeAnimal()
	{
		setState(0);
	}
		
	public int getState() 
	{
		return state;
	}
		
	public void setState(int state) 
	{
		this.state = state;
		if (this.state == 1)
		{
			a = new Rabbit(row, col);
			setIcon(rabbit); //Sets the tile to the rabbit.
		}
		else if (this.state == 2)
		{
			a = new Bison(row, col);
			setIcon(bison); //Sets the tile to the bison.
		}
		else
		{
			a = null;
			setIcon(null); //Sets the tile to blank.
		}
	}
		
	public static void switchState(huntTile input) //Is static so other methods can change any tile.
	{
		if (input.getState() == 1) //Checks the current state of the tile.
		{
			input.setState(2);
		}
		else if(input.getState() == 2)
		{
			input.setState(0);
		}
		else
		{
			input.setState(1);
		}
	}
		
	/**
	 * Allows the user to check the column location of a tile.
     * @return The column location of the tile.
	 */
		
	public int getCol() 
	{
		return col;
	}

	/**
	 * Allows the user to check the row location of a tile.
	 * @return The row location of the tile.
	 */
		
	public int getRow() 
	{
		return row;
	}
	
	public Animal getAnimal()
	{
		return a;
	}
}
