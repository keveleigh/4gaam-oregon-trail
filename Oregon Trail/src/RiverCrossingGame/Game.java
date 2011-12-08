package RiverCrossingGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
/**
 * Controller class for the game
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public class Game
{
     private Level level;
     private Player player;
     private JLabel status, score;
     private LevelPanel panel;
     private ArrayList<Monster> monsters;
     private Timer timer;
     private MonsterListener listen;
     private static JFrame frame;
     /**
      * Constructs a new game
      */
     public Game()
     {
          player = new Player(this, 0, 0);
          level = new Level(this, 14, 14);
          monsters = level.getMonsters();
          panel = new LevelPanel(this);
          listen = new MonsterListener();
          timer = new Timer(500, null);
          timer.addActionListener(listen);
          timer.start();
          frame = new JFrame();
     }
     /**
      * Checks to see if the player won
      */
     public void win()
     {
          if(player.getX() == 13) 
          {
               timer.stop();
               panel.setFocusable(false);
               JOptionPane.showMessageDialog(panel, "You've crossed the river!");
          }
     }
     /**
      * Checks to see if the player lost
      */
     public void lose()
     {
          for(int i = 0; i<monsters.size(); i++)
          {
               if(player.runsInto(monsters.get(i)))
               {
                      timer.stop();
                      panel.setFocusable(false);
                      JOptionPane.showMessageDialog(panel, "Lost some of your food"); 
               }
          }   
     }
     
     public Level getLevel() {return level;}
     public Player getPlayer() {return player;}
     public ArrayList getMonsters() {return monsters;}
     public LevelPanel getLevelPanel() {return panel;}
     /**
      * Creates and runs the game
      */
     public static void main(String[] args)
     {       
          Game game = new Game();
 
          frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));  
          frame.setPreferredSize(new Dimension(425,445));
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.add(game.getLevelPanel());
          frame.setResizable(false);
          frame.pack();
          frame.setVisible(true);    
     }
     /**
      * ActionListener that moves the monsters in the game
      */
     private class MonsterListener implements ActionListener
     {
          private boolean ranInto = false;
          /**
           * Moves the monsters in the level and checks to see if they ran into the player. 
           * If they did, calls lose()
           * 
           * @param e The action event generated (caused every 500 milliseconds by the timer)
           */
          public void actionPerformed(ActionEvent e)
          {
               for(int i = 0; i<monsters.size(); i++)
               {
                    Monster temp = monsters.get(i);
                    temp.move(1, 1);
                    if(temp.runsInto(player))
                    {
                         ranInto = true;
                    }
               }
               
               if(ranInto)
               {
                    level.removePlayer();
                    panel.repaint();
                    lose();
               }
               panel.repaint();
          }
     }
}