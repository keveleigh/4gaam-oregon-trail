package RiverCrossingGame;

import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 * The monsters in the game
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public class Monster extends Creature
{
     private int dx, dy;
     private Random rand = new Random();
     private Game game;
     /**
      * Creates a new monster at the specified location
      * 
      * @param game The game the monster interacts with
      * @param row The x coordinate
      * @param col The y coordinate
      */
     public Monster(Game game, int row, int col)
     {
          super(row, col);
          this.game = game;
     }
     /**
      * Creates a new monster at a random location
      */
     public Monster()
     {
          super();
     }
     /**
      * Moves the monster
      * 
      * @param dx How far to move the x coordinate
      * @param dy How far to move the y coordinate
      */
     public void move(int dx, int dy)
     {
          ArrayList<Point> possibleMoves = new ArrayList<Point>();
          
          possibleMoves.add(new Point(getX() + dx, getY()));
          possibleMoves.add(new Point(getX() - dx, getY()));
          possibleMoves.add(new Point(getX(), getY() + dy));
          possibleMoves.add(new Point(getX(), getY() - dy));
          
          possibleMoves.add(new Point(getX() + dx, getY() + dy));
          possibleMoves.add(new Point(getX() + dx, getY() - dy));
          possibleMoves.add(new Point(getX() - dx, getY() + dy));
          possibleMoves.add(new Point(getX() - dx, getY() - dy));
          
          Point moveTo = possibleMoves.get(rand.nextInt(possibleMoves.size()));
          int px = (int)(moveTo.getX());
          int py = (int)(moveTo.getY());
          while(game.getLevel().canMoveToSquare(px, py) == false)
          {
               moveTo = possibleMoves.get(rand.nextInt(possibleMoves.size()));
               px = (int)(moveTo.getX());
               py = (int)(moveTo.getY());
          }
          
          setX(px);
          setY(py);
          possibleMoves.clear();
     }
     /**
      *Draws the monster
      * 
      * @param g The graphics object to draw to
      */
     public void draw(Graphics g)
     {
          ImageIcon monster = new ImageIcon("piranha.png");
          g.drawImage(monster.getImage(), getX()*30, getY()*30, 30, 30, null);
     }
}
     
     
     