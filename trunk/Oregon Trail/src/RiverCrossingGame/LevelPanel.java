package RiverCrossingGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Displays the level and the current status and score of the level
 * I worked with no one else on this assignment
 * 
 * @author Thomas Cornish
 * @version 1.0
 */
public class LevelPanel extends JPanel
{
     private Level level;
     private Game game;     
     private Player player;
     //private JLabel status, score;
     //private JPanel statusPane;
     private MovementListener listen = new MovementListener();
     /**
      * Creates a new LevelPanel 
      * 
      * @param game The game it displays
      */
     public LevelPanel(Game game)
     {
          this.game = game;
          this.level = game.getLevel();
          this.player = level.getPlayer();
          //status = new JLabel("Gems Left: " + level.itemsLeft());
          //score = new JLabel("Score: " + player.getScore());
          //JPanel statusPane = new JPanel();
          addKeyListener(listen);
          
          //statusPane.setLayout(new BoxLayout(statusPane, BoxLayout.X_AXIS));
          //this.setLayout(new BorderLayout());
          //statusPane.setMaximumSize(new Dimension(50, 30));
          //statusPane.add(Box.createRigidArea(new Dimension(25,0)));
          //statusPane.add(status);
          //statusPane.add(Box.createRigidArea(new Dimension(10, 0)));
          //statusPane.add(score);
          
          //this.add(statusPane, BorderLayout.SOUTH);
          setFocusable(true);
        
     }
     /**
      * Draws the level to the panel
      * 
      * @param g The graphics object to draw to
      */
     public void paintComponent(Graphics g)
     {
          level.draw(g);
     }
     /**
      * Listens for keyboard input to move the player
      */
     private class MovementListener implements KeyListener
     {  
          /**
           * Moves the player in the direction of the corresponding arrow key
           */
          public void keyPressed(KeyEvent e) 
          {
               if(e.getKeyCode() == KeyEvent.VK_LEFT)
               {
                    player.move(-1, 0);
                    repaint();
               }

               if(e.getKeyCode() == KeyEvent.VK_RIGHT)
               {
                    player.move(1, 0);
                    repaint();
               }
               
               if(e.getKeyCode() == KeyEvent.VK_UP)
               {
                    player.move(0, -1);
                    repaint();
               }
               
                if(e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                     player.move(0, 1);
                     repaint();
                }
                
                //score.setText("Score: " + player.getScore());
                //status.setText("Gems Left: " + level.itemsLeft());
                game.lose();
                game.win();
                
          }
          
          public void keyReleased(KeyEvent e){}
          
          public void keyTyped(KeyEvent e) {}
     }
}