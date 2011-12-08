package RiverCrossingGame;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
/**
 * Abstract class Creature. The parent class for all creatures in the game
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public abstract class Creature
{
     private int xLoc, yLoc;
     private Random rand = new Random();
     /**
      * Creates a new creature at a random location
      */
     public Creature()
     {
          xLoc = rand.nextInt(10);
          yLoc = rand.nextInt(10);
     }
     /**
      * Creates a new creature at the specified location
      * 
      * @param row The x coordinate of the creature
      * @param col The y coordinate of the creature
      */
     public Creature(int row, int col)
     {
          xLoc = row;
          yLoc = col;
     }
     /**
      * Draws the creature
      * 
      * @param g The graphics object to draw to
      */
     public abstract void draw(Graphics g);
     /**
      * Moves the creature
      * 
      * @param dx How many rows to move
      * @param dy how many columns to move
      */
     public abstract void move(int dx, int dy);
     /**
      * Checks to see if the creature runs into the specified creature
      * 
      * @param c The creature to check if this creature ran into
      * @return true or false depending whether it did run into the creature or not
      */
     public boolean runsInto(Creature c)
     {
          if(c.getX() == this.xLoc && c.getY() == this.yLoc)
               return true;
          else
               return false;
     }
     
     public int getX()
     {
          return xLoc;
     }
     
     public int getY()
     {
          return yLoc;
     }
     
     public void setX(int row)
     {
          xLoc = row;
     }
     
     public void setY(int col)
     {
          yLoc = col;
     }
}