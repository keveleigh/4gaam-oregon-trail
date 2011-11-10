
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * The main screen during the game.
 * 
 * @author Four Guys and a Mann
 * @version v1.25 11/9/11
 */
public class mainScreen extends JPanel {

	/** The game. */
	private GameInterface game;

	/** The leader. */
	private Leader leader;

	/** The wagon. */
	private Wagon wagon;

	/** The current pace. */
	private Pace currPace;

	/** The current ration. */
	private Rations currRation;

	/** The map class. */
	private Map mapClass;

	/** The wagon load. */
	private Inventory wagonLoad;

	// Variables declaration
	/** The barebones. */
	private JRadioButton barebones;

	/** The current food. */
	private JLabel currentFood;

	/** The distance text. */
	private JLabel distanceText;

	/** The distance traveled. */
	private JLabel distanceTraveled;

	/** The filling. */
	private JRadioButton filling;

	/** The food text. */
	private JLabel foodText;

	/** The grueling. */
	private JRadioButton grueling;

	/** The j scroll pane1. */
	private JScrollPane jScrollPane1;

	/** The j text area1. */
	private JTextArea jTextArea1;

	/** The leisurely. */
	private JRadioButton leisurely;

	/** The map. */
	private JPanel map;

	/** The meager. */
	private JRadioButton meager;

	/** The money. */
	private JLabel money;

	/** The money text. */
	private JLabel moneyText;

	/** The pace. */
	private ButtonGroup pace;

	/** The pace text. */
	private JLabel paceText;

	/** The ration text. */
	private JLabel rationText;

	/** The rations. */
	private ButtonGroup rations;

	/** The steady. */
	private JRadioButton steady;

	/** The take turn. */
	private JButton takeTurn;

	/** The distance to next. */
	private JLabel distanceToNext;

	/** The last location. */
	private JLabel lastLocation;

	/** The lbl current location. */
	private JLabel lblCurrentLocation;

	/** The curr location. */
	private JLabel currLocation;
	// End of variables declaration

	/**
	 * Instantiates a new main screen.
	 *
	 * @param face The GameInterface
	 */
	public mainScreen(GameInterface face) {
		game = face;
		wagon = game.getWagon();
		leader = wagon.getLeader();
		wagonLoad = wagon.getWagonLoad();
		currPace = wagon.getCurrPace();
		currRation = wagon.getCurrRations();
		mapClass = face.getMap();

		initComponents();
		setBackground(Color.yellow);
		barebones.setBackground(Color.yellow);
		meager.setBackground(Color.yellow);
		filling.setBackground(Color.yellow);
		leisurely.setBackground(Color.yellow);
		steady.setBackground(Color.yellow);
		grueling.setBackground(Color.yellow);

		//		enterShop.addActionListener(new EnterListener());
		takeTurn.addActionListener(new TurnListener());

		if (currPace == Pace.Leisurely) {
			leisurely.setSelected(true);
		} else if (currPace == Pace.Steady) {
			steady.setSelected(true);
		} else {
			grueling.setSelected(true);
		}

		if (currRation == Rations.BareBones) {
			barebones.setSelected(true);
		} else if (currRation == Rations.Meager) {
			meager.setSelected(true);
		} else {
			filling.setSelected(true);
		}

		map.setBackground(Color.BLACK);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents() {

		rations = new ButtonGroup();
		pace = new ButtonGroup();
		distanceText = new JLabel();
		foodText = new JLabel();
		distanceTraveled = new JLabel();
		currentFood = new JLabel();
		rationText = new JLabel();
		barebones = new JRadioButton();
		meager = new JRadioButton();
		filling = new JRadioButton();
		paceText = new JLabel();
		leisurely = new JRadioButton();
		steady = new JRadioButton();
		grueling = new JRadioButton();
		takeTurn = new JButton();
		map = new JPanel();
		moneyText = new JLabel();
		money = new JLabel();

		jScrollPane1 = new JScrollPane();
		jTextArea1 = new JTextArea();

		distanceText.setText("Distance Traveled:");

		foodText.setText("Current Food:");

		distanceTraveled.setText(Integer.toString(mapClass.getDistanceMoved()));

		currentFood.setText(Integer.toString(wagonLoad.getQuantity(3)));

		rationText.setText("Rations:");

		rations.add(barebones);
		barebones.setText("Bare Bones");

		rations.add(meager);
		meager.setText("Meager");

		rations.add(filling);
		filling.setText("Filling");

		paceText.setText("Pace:");

		pace.add(leisurely);
		leisurely.setText("Leisurely");

		pace.add(steady);
		steady.setText("Steady");

		pace.add(grueling);
		grueling.setText("Grueling");

		takeTurn.setText("Take Turn");

		GroupLayout gl_map = new GroupLayout(map);
		map.setLayout(gl_map);
		gl_map.setHorizontalGroup(
				gl_map.createParallelGroup(Alignment.LEADING)
				.addGap(0, 412, Short.MAX_VALUE)
		);
		gl_map.setVerticalGroup(
				gl_map.createParallelGroup(Alignment.LEADING)
				.addGap(0, 274, Short.MAX_VALUE)
		);

		moneyText.setText("Money:");

		money.setText("$"+Integer.toString(leader.getMoney()));

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		JLabel lastLocationText = new JLabel("Last Location:");

		JLabel distanceToNextText = new JLabel("Distance to Next:");

		distanceToNext = new JLabel(Integer.toString(mapClass.getDistanceToNext()));

		lastLocation = new JLabel(mapClass.getLastLoc().getName());

		lblCurrentLocation = new JLabel("Current Location:");

		currLocation = new JLabel(mapClass.getCurrLocation().getName());

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(distanceText)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(distanceTraveled, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(foodText)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(currentFood, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup()
														.addComponent(moneyText)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(money, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup()
																.addComponent(distanceToNextText)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(distanceToNext))
																.addComponent(lastLocationText)
																.addComponent(lastLocation)
																.addComponent(lblCurrentLocation)
																.addComponent(currLocation))
																.addGap(39)
																.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(map, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																		.addGroup(layout.createParallelGroup(Alignment.TRAILING)
																				.addGroup(layout.createSequentialGroup()
																						.addGap(18)
																						.addGroup(layout.createParallelGroup(Alignment.LEADING)
																								.addComponent(grueling)
																								.addComponent(steady)
																								.addComponent(leisurely)
																								.addComponent(paceText)
																								.addComponent(filling)
																								.addComponent(meager)
																								.addComponent(rationText)
																								.addComponent(barebones))
																								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																								.addGroup(layout.createSequentialGroup()
																										.addPreferredGap(ComponentPlacement.RELATED)
																										.addComponent(takeTurn)
																										.addGap(24))))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(map, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(rationText)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(barebones)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(meager)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(filling)
														.addGap(18)
														.addComponent(paceText)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(leisurely)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(steady)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(grueling)))
														.addGap(18))
														.addGroup(layout.createSequentialGroup()
																.addComponent(lblCurrentLocation)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(currLocation)
																.addGap(7)
																.addComponent(lastLocationText)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(lastLocation)
																.addGap(18)
																.addGroup(layout.createParallelGroup(Alignment.BASELINE)
																		.addComponent(distanceToNextText)
																		.addComponent(distanceToNext))
																		.addGap(6)))
																		.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
																				.addGroup(layout.createSequentialGroup()
																						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
																								.addComponent(distanceText)
																								.addComponent(distanceTraveled))
																								.addPreferredGap(ComponentPlacement.RELATED)
																								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
																										.addComponent(foodText)
																										.addComponent(currentFood))
																										.addPreferredGap(ComponentPlacement.RELATED)
																										.addGroup(layout.createParallelGroup(Alignment.BASELINE)
																												.addComponent(moneyText)
																												.addComponent(money))
																												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																												.addComponent(takeTurn))
																												.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																												.addContainerGap())
		);
		this.setLayout(layout);
	}

	// This method returns the selected radio button in a button group
	/**
	 * Gets the selection.
	 *
	 * @param group the group
	 * @return the selection
	 */
	public static JRadioButton getSelection(ButtonGroup group) {
		for (Enumeration e = group.getElements(); e.hasMoreElements();) {
			JRadioButton b = (JRadioButton) e.nextElement();
			if (b.getModel() == group.getSelection()) {
				return b;
			}
		}
		return null;
	}

	/**
	 * The listener interface for receiving turn events.
	 * The class that is interested in processing a turn
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addTurnListener<code> method. When
	 * the turn event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see TurnEvent
	 */
	private class TurnListener implements ActionListener {

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			//        	enterShop.setEnabled(false);

			String p = getSelection(pace).getText();
			if (p.equals("Leisurely")) {
				wagon.setCurrPace(Pace.Leisurely);
			} else if (p.equals("Steady")) {
				wagon.setCurrPace(Pace.Steady);
			} else {
				wagon.setCurrPace(Pace.Grueling);
			}

			p = getSelection(rations).getText();
			if (p.equals("Bare Bones")) {
				wagon.setCurrRations(Rations.BareBones);
			} else if (p.equals("Meager")) {
				wagon.setCurrRations(Rations.Meager);
			} else {
				wagon.setCurrRations(Rations.Filling);
			}

			money.setText("$"+Integer.toString(leader.getMoney()));

			mapClass.takeTurn(wagon);

			wagon = mapClass.getWagon();

			currLocation.setText(mapClass.getCurrLocation().getName());
			lastLocation.setText(mapClass.getLastLoc().getName());
			distanceToNext.setText(Integer.toString(mapClass.getDistanceToNext()));
			wagonLoad = wagon.getWagonLoad();
			currentFood.setText(Integer.toString(wagonLoad.getQuantity(3)));
			distanceTraveled.setText(Integer.toString(mapClass.getDistanceMoved()));

			if (mapClass.getCurrLocation() != Map.na && mapClass.getCurrLocation().myShop != null)
			{
				game.setWagon(wagon);
				game.setMap(mapClass);
				Object[] options = {"Enter shop",
				"Continue on the trail"};
				int n = JOptionPane.showOptionDialog(game,
						"You have arrived at " + mapClass.getCurrLocation().getName()
						+ "\nWhat would you like do?",
						"Town",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE,
						null,
						options,
						options[0]);

				if (n == 0 ) {
					JPanel panel = new generalStore(mapClass.getCurrLocation().myShop, game);
					panel.setSize(new Dimension(450, 300));
					game.changeDisplay(panel);					
				} else if (n == 1) {
				}
				//            	enterShop.setEnabled(true);
			}

			if (mapClass.getCurrLocation().isRiver()) {
				Object[] options = {"Caulk and Float",
						"Take Ferry ($200)",
				"Ford the River"};
				int n = JOptionPane.showOptionDialog(game,
						"You have approached the " + mapClass.getCurrLocation().getName()
						+ "\nWhat do you do?",
						"River Crossing",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[0]);

				// Handle choices, can use switch statement instead
				while (n == -1){
					if (n == -1){
						JOptionPane.showMessageDialog(game, "You must pick a choice!");
						n = JOptionPane.showOptionDialog(game,
								"You have approached the " + mapClass.getCurrLocation().getName()
								+ "\nWhat do you do?",
								"River Crossing",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								options,
								options[0]);
					}
				}

				if (n == 0 ) {
					if (mapClass.getRiver().checkFloat()){
						JOptionPane.showMessageDialog(game, "Congratulations!  " +
						"You have flirted with danger but still made it safely!");
					} else if (!mapClass.getRiver().checkFloat()){
						int lostItemCount = (int) ((Math.random()*40));
						if (wagonLoad.getQuantity(3) < lostItemCount){
							JOptionPane.showMessageDialog(game, "Your wagon has tipped over and " +
							"You have lost any food you had.");
						} else {
							JOptionPane.showMessageDialog(game, "Your wagon has tipped over and " +
									"you have lost " + lostItemCount + " pounds of food.");
						}
						wagonLoad.remove(new Food(lostItemCount));
						currentFood.setText(Integer.toString(wagonLoad.getQuantity(3)));
					}
				} else if (n == 1) {
					if (mapClass.getRiver().checkFerry()){
						leader.setMoney(leader.money-200); //ferry costs $200
						money.setText("$"+Integer.toString(leader.getMoney()));
						JOptionPane.showMessageDialog(game, "You have paid $200 to cross " +
						"the river safely.");
					}
				} else if (n == 2) {
					if (mapClass.getRiver().checkFord()){
						JOptionPane.showMessageDialog(game, "Congratulations!  " +
						"You have flirted with danger but still made it safely!");
					} else if (!mapClass.getRiver().checkFord()){
						int lostItemCount = (int) ((Math.random()*70)+30);
						if (wagonLoad.getQuantity(3) < lostItemCount){
							JOptionPane.showMessageDialog(game, "Your wagon has tipped over and " +
							"You have lost any food you had.");
						} else {
							JOptionPane.showMessageDialog(game, "Your wagon has tipped over and " +
									"you have lost " + lostItemCount + " pounds of food.");
						}
						wagonLoad.remove(new Food(lostItemCount));
						currentFood.setText(Integer.toString(wagonLoad.getQuantity(3)));
					}
				}
			}

			if (mapClass.getCurrLocation().isLast() == true) {
				JOptionPane.showMessageDialog(null,"You've reached Oregon!");
				takeTurn.setEnabled(false);
			}
		}
	}
	//    For future use:

	//    private class EnterListener implements ActionListener {
	//
	//        public void actionPerformed(ActionEvent e) {
	//        	game.setWagon(wagon);
	//        	game.setMap(mapClass);
	//        	JPanel panel = new generalStore(mapClass.getCurrLocation().myShop, game);
	//            panel.setSize(new Dimension(450, 300));
	//            game.changeDisplay(panel);
	//        }
	//    }
}
