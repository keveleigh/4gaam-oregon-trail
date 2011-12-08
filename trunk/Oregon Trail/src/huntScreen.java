import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class huntScreen extends JPanel {
	
	Random rand = new Random();
	public Food hunted;
	public Inventory inven;
	int delay = 2000;
	private huntTile[][] tiles; //A 2D array containing all of the tiles.
	private GameInterface game;
	
	public huntScreen(GameInterface game) {
		this.game = game;
		inven = Wagon.getWagonLoad();
		hunted = new Food(0);

        setPreferredSize(new Dimension(750, 750)); //Sets the panel to be a certain size based on the number of rows and columns.
		this.tiles = new huntTile[10][10];
		this.setLayout(new GridLayout(10,10)); //Sets the panel's layout to a GridLayout.
		for (int i=0;i<10;i++) //For every row.
		{
			for (int j=0;j<10;j++) //For every column.
			{
				tiles[i][j] = new huntTile(i,j); //Create a new tile.
				tiles[i][j].addActionListener(new ClickListener()); //Add the ClickListener to each tile.
				add(tiles[i][j]); //Add each tile to the panel.
			}
		}
	}
	
	public void step()
	{
		resetGrid();
		int temp = rand.nextInt(4);
		if (temp > 0)
		{
			for (int i=0;i<temp;i++)
			{
				tiles[rand.nextInt(10)][rand.nextInt(10)].addAnimal(rand.nextInt(2)+1);
			}
		}
	}
	
	public void resetGrid()
	{
		for (int i=0;i<10;i++) //For every row.
		{
			for (int j=0;j<10;j++) //For every column.
			{
				tiles[i][j].setState(0); //Reset to blank.
			}
		}
	}
	
	public int updateFood()
	{
		inven.add(hunted);
		Wagon.wagonLoad = inven;
		return hunted.quantity;
	}
	
	private class ClickListener implements ActionListener //Watches for the user to click a tile.
	{
		public void actionPerformed(ActionEvent e)
		{
			if (inven.getQuantity(1) <= 0)
			{
				JOptionPane.showMessageDialog(null, "You don't have any bullets.", "Alert!", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				inven.remove(new Bullets(1));
				huntTile current = (huntTile) e.getSource();
				if (current.getState() == 1 || current.getState() == 2)
				{
					Animal currAnim = tiles[current.getRow()][current.getCol()].getAnimal();
					currAnim.loseHealth();
					if (currAnim.health == 0)
					{
						hunted.setQuantity(hunted.getQuantity() + currAnim.f);
						current.setState(0);
					}
				}
			}
		}
	}
	
	public void leave()
	{
        JPanel panel = new mainScreen(game);
        panel.setSize(new Dimension(679, 410));
        game.changeDisplay(panel);
    }
}


