package RiverCrossingGame;

import java.awt.*;
import javax.swing.*;
/**
 * The player in the game
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public class Player extends Creature
{
     private int score;
     private Game game;
     /**
      *Creates a new player at the specified location with a score of 0
      * 
      * @param game The game the player interacts with
      * @param row The x coordinate
      * @param col The y coordinate
      */
     public Player(Game game, int row, int col)
     {
          super(row, col);
          this.game = game;
          score = 0;
     }
     /**
      * Moves the player
      * 
      * @param dx How far to move the x coordinate
      * @param dy How far to move the y coordinate
      */
     public void move(int dx, int dy)
     {
          if(Level.canMoveToSquare(getX() + dx, getY() + dy))
          {
               setX(getX() + dx);
               setY(getY() + dy);
               Gem temp = game.getLevel().collectItem(getX(), getY());
               
               if(temp != null)
                    score += temp.getValue();
          }
     }
     /**
      * Draws the player
      * 
      * @param g The graphics object to draw to
      */
     public void draw(Graphics g)
     {
          ImageIcon hero = new ImageIcon("tempHero.png");
          g.drawImage(hero.getImage(), getX()*30, getY()*30, 30, 30, null);
     }
     
     public int getScore()
     {
          return score;
     }
}