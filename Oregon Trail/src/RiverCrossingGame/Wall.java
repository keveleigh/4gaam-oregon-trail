package RiverCrossingGame;

import java.awt.*;
import javax.swing.*;
/**
 * A wall in the game
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public class Wall extends Tile
{
     /**
      * Constructs a new wall at the specified location
      * 
      * @param row The x coordinate
      * @param col The y coordinate
      */
     public Wall(int row, int col)
     {
          super(row, col);
     }
     /**
      * Draws the wall
      * 
      * @param g The graphics object to draw to
      */
     public void draw(Graphics g)
     {
          ImageIcon wall = new ImageIcon("rock.png");
          g.drawImage(wall.getImage(), getX()*30, getY()*30, 30, 30, null);
     }
     /**
      * Checks to see if the tile is passable
      * 
      * returns false
      */
     public boolean isPassable()
     {
          return false;
     }
     
     public boolean hasItem() {return false;}
     public Gem getItem(){return null;}
     public void removeItem() {}

}
          