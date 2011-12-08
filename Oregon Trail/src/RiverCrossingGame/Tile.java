package RiverCrossingGame;

import java.awt.*;
import javax.swing.*;
/**
 * Abstract class from which all tiles in the game extend
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public abstract class Tile 
{
     private int xLoc, yLoc;
     /**
      * Constructs a new tile at the specified location
      * 
      * @param row The x coordinate
      * @param col The y coordinate
      */
     public Tile(int row, int col)
     {
          xLoc = row;
          yLoc = col;
     }
     
     public abstract boolean isPassable();
     public abstract void draw(Graphics g);
     public abstract boolean hasItem();
     public abstract Gem getItem();
     public abstract void removeItem();
     
     public int getX()
     {
          return xLoc;
     }
     
     public int getY()
     {
          return yLoc;
     }
     
}