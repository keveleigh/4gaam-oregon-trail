package RiverCrossingGame;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
/**
 * The level in the game
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public class Level
{
     private static Tile[][] level;
     private int itemsLeft;
     private static int width, height;
     private BufferedReader in;
     private Random rand;
     private Player player;
     private Game game;
     private ArrayList<Monster> monsters;
     /**
      * Constructs a new level with the specified size. Reads a level file or randomly generates a level
      * if no level file exists
      * 
      * @param game The game the level interacts with
      * @param row The number of rows in the level
      * @param col The number of columns in the level
      */
     public Level(Game game, int rows, int cols)
     {
          width = rows;
          height = cols;
          this.game = game;
          monsters = new ArrayList<Monster>();
          level = new Tile[width][height];
          rand = new Random();
          player = game.getPlayer();

          try
          {
               in = new BufferedReader(new FileReader("level.txt"));
               int j;
               double monsterChance; 
               for(int i = 0; i<width; i++)
               {
                    j=0;
                    String tempS = in.readLine();
                    for(int k = 0; k<height; k++)
                    {
                         char tempC = tempS.charAt(j);
                         monsterChance  = rand.nextDouble();
                         if(i == 0 && k == 0)
                              level[k][i] = new Floor(k, i);
                         
                         if(tempC != -1)
                         {
                              if(tempC == 'o')
                              {
                                   level[k][i] = new Floor(k, i);
                                   if(monsterChance <= 0.05)
                                        monsters.add(new Monster(game, k, i));
                              }
                              else if (tempC == 'x')
                                   level[k][i] = new Wall(k, i);
                              
                              else if(tempC == 'g')
                              {
                                   level[k][i] = new Floor(k, i);
                                   itemsLeft++;
                              }
                         }
                         j++;
                    }
               }
          }
          catch(IOException e)
          { 
               for(int i = 0; i<width; i++)
               {
                    for(int k = 0; k<height; k++)
                    {
                         double wallOrFloor = rand.nextDouble();
                         //double itemChance = rand.nextDouble();
                         double monsterChance = rand.nextDouble();
                         
                         if(i == 0 && k == 0)
                              level[i][k] = new Floor(i, k);
                         
                         else if(wallOrFloor < 0.85)
                         {
                              //if(itemChance < 0.10)
                              //{
                              //     level[i][k] = new Floor(i, k, new Gem());
                              //     itemsLeft++;
                              //}
                              
                              //else
                              //{
                                   level[i][k] = new Floor(i, k);
                                   if(monsterChance <= 0.05)
                                        monsters.add(new Monster(game, i, k));        
                              //}
                         }
                         
                         else
                              level[i][k] = new Wall(i, k);
                         
                    }
               }      
          }
     }
     /**
      * Draws the level
      * 
      * @param g The graphics object to draw to
      */
     public void draw(Graphics g)
     {
          for(int i = 0; i<width; i++)
          {
               for(int k = 0; k<height; k++)
               {
                    if(level[i][k] != null)
                         level[i][k].draw(g);
               }
          }
          
          if(player != null)
               player.draw(g);
          
          for(int i = 0; i<monsters.size(); i++)
          {
               monsters.get(i).draw(g);
          }
     }
     /**
      * Checks to see if the square can be moved to 
      * 
      * @param row The x coordinate of the checked square
      * @param col The y coordinate of the checked square
      * @return true or false 
      */
     public static boolean canMoveToSquare(int row, int col)
     {
          if(row < width && col< height && row >=0  && col >= 0 )
          {
               if(level[row][col].isPassable())
               {
                    return true;
               }
          }
          
          return false;
     }
     /**
      * Collects the gem on the current square
      * 
      * @param row The x coordinate of the square to collect the gem from
      * @param col The y coordinate of the square to collect the gem from
      * @return The collected gem
      */
     public Gem collectItem(int row, int col)
     {
          Gem temp = null;
          
          if(level[row][col].hasItem())
          {
               temp = level[row][col].getItem();
               level[row][col].removeItem();
               itemsLeft--;
          }
         
          return temp;
     }
    /**
     * returns how many gems are left in the level
     */
     public int itemsLeft()
     {
          return itemsLeft;
     }
     /**
      * returns all the monsters in the level
      */
     public ArrayList<Monster> getMonsters()
     {
          return monsters;
     }
     /**
      * returns the player of the level
      */
     public Player getPlayer()
     {
          return player;
     }
     /**
      * Removes the player from the level
      */
     public void removePlayer()
     {
          player = null;
     }
}
     