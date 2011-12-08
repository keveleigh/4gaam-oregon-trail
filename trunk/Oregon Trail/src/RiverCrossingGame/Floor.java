package RiverCrossingGame;

import java.awt.*;
import javax.swing.*;
/**
 * A floor tile
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public class Floor extends Tile
{
     private Gem itemHeld;
     /**
      * Constructs a new floor tile at the specified location that also has a Gem on it
      * 
      * @param row The x coordinate of the floor tile
      * @param col The y coordinate of the floor tile
      * @param i The Gem it has on it
      */
     public Floor(int row, int col, Gem i)
     {
          super(row, col);
          itemHeld = i;
     }
     /**
      * Constructs a new floor tile at the specified location that has no Gem on it
      * 
      * @param row The x coordinate of the floor tile
      * @param col The y coordinate of the floor tile
      */
     public Floor(int row, int col)
     {
          super(row, col);
          itemHeld = null;
     }
     /**
      * Checks to see if the floor tile is passable
      * 
      * returns true
      */
     public boolean isPassable()
     {
          return true;
     }
     /**
      * Draws the floor tile
      * 
      * @param g The graphics object to draw to
      */
     public void draw(Graphics g)
     {
          if(itemHeld == null)
          {
               ImageIcon ground = new ImageIcon("water.png");
               g.drawImage(ground.getImage(), getX()*30, getY()*30, 30, 30, null);
          }
          else
          {
               ImageIcon gem = new ImageIcon("Gem.png");
               g.drawImage(gem.getImage(), getX()*30, getY()*30, 30, 30, null);
          }
     }
     
     public boolean hasItem()
     {
          if(itemHeld != null)
               return true;
          
          return false;
     }
     /**
      * Removes the currently held Gem from the floor tile
      */
     public void removeItem()
     {
          itemHeld = null;
     }
     
     public Gem getItem()
     {
          return itemHeld;
     }
}
          