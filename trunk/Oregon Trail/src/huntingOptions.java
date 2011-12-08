import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class provides the user with options.
 *
 * @author Kurtis Eveleigh
 * @version 1.0
 */

public class huntingOptions extends JPanel
{
	int t = 10; //The time left.
	JLabel info = new JLabel("Click squirrels once and bison twice to hunt successfully.");
	JButton start = new JButton("Start");
	JButton leave = new JButton("Leave");
	JLabel turns = new JLabel("Time left: " + t);
	huntScreen panel;
	
	/**
	 * The constructor for the InputPanel.
	 * @param board The GridPanel created for the panel to contain.
	 */
	
	public huntingOptions(huntScreen input)
	{
		this.panel = input;
		start.addActionListener(new TimerListener()); //Allows the step button to step the panel.
		leave.addActionListener(new LeaveListener()); //Allows the leave button to leave the screen.
		add(info);
		add(start); //Adds the step button to the InputPanel.
		add(leave); //Adds the leave button to the InputPanel.
		add(turns);
		add(this.panel);
	}
	
	private class StartListener implements ActionListener //Allows the user to manually step the grid.
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.step(); //Advances the hunting game one step.
			t = t - 1; //Adds 1 to the number of turns.
			turns.setText("Time left: " + t); //Updates the turns display.
			info.setText("Bullets left: " + panel.inven.getQuantity(1));
			if (t == 0)
			{
				timer.stop();
				leave.setEnabled(true);
				panel.resetGrid();
				turns.setText("You hunted " + panel.updateFood() + " pounds of food."); //Updates the turns display.
			}
		}
	}
	
	Timer timer = new Timer(1000, new StartListener()); //Provides a timer set to step the game every second.
	
	private class TimerListener implements ActionListener //Starts the timer.
	{
		public void actionPerformed(ActionEvent e)
		{
			start.setEnabled(false);
			leave.setEnabled(false);
			timer.start();
		}
	}
	 
	private class LeaveListener implements ActionListener //Leaves the game.
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.leave();
		}
	}
}