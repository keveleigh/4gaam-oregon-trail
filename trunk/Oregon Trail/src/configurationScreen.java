import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

/**
 * The Class configurationScreen, which is the first screen of the game.
 * This screen allows the user to enter a Leader name and Member names as well
 * as set their profession and the initial pace and rations
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public class configurationScreen extends JFrame {

	/** The content pane. */
	private JPanel contentPane;
	
	/** The text field. */
	private JTextField textField;
	
	/** The text field_1. */
	private JTextField textField_1;
	
	/** The text field_2. */
	private JTextField textField_2;
	
	/** The text field_3. */
	private JTextField textField_3;
	
	/** The text field_4. */
	private JTextField textField_4;
	
	/** The lbl member_2. */
	private JLabel lblMember_2;
	
	/** The lbl member. */
	private JLabel lblMember;
	
	/** The lbl member_1. */
	private JLabel lblMember_1;
	
	/** The lbl new label_2. */
	private JLabel lblNewLabel_2;
	
	/** The lbl set your initial. */
	private JLabel lblSetYourInitial;
	
	/** The rdbtn new radio button_3. */
	private JRadioButton rdbtnNewRadioButton_3;
	
	/** The rdbtn steady. */
	private JRadioButton rdbtnSteady;
	
	/** The rdbtn grueling. */
	private JRadioButton rdbtnGrueling;
	
	/** The rdbtn new radio button_4. */
	private JRadioButton rdbtnNewRadioButton_4;
	
	/** The rdbtn meager. */
	private JRadioButton rdbtnMeager;
	
	/** The rdbtn filling. */
	private JRadioButton rdbtnFilling;
	
	/** The lbl new label_3. */
	private JLabel lblNewLabel_3;
	
	/** The lbl new label_4. */
	private JLabel lblNewLabel_4;
	
	/** The lbl new label_5. */
	private JLabel lblNewLabel_5;
	
	/** The go button. */
	private JButton goButton;
	
	/** The rdbtn new radio button. */
	private JRadioButton rdbtnNewRadioButton;
	
	/** The rdbtn new radio button_1. */
	private JRadioButton rdbtnNewRadioButton_1;
	
	/** The rdbtn new radio button_2. */
	private JRadioButton rdbtnNewRadioButton_2;
	
	/** The my leader. */
	private Leader myLeader;
	
	/** The mem1. */
	private Member mem1;
	
	/** The mem2. */
	private Member mem2;
	
	/** The mem3. */
	private Member mem3;
	
	/** The mem4. */
	private Member mem4;
	
	/** The my wagon. */
	private Wagon myWagon;
	
	/** The bare bones. */
	private boolean banker, farmer, carpenter, steady, leisurely, grueling, filling, meager, bareBones;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurationScreen frame = new configurationScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public configurationScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 403);
		setTitle("Oregon Trail");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		goButton = new JButton("Begin Journey on the Oregon Trail");
		goButton.setBounds(34, 325, 227, 20);
		contentPane.add(goButton);
		
		ButtonListener listener = new ButtonListener();
		goButton.addActionListener(listener);
		
		JLabel lblNewLabel = new JLabel("Leader Name:");
		lblNewLabel.setBounds(34, 24, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Member 3:");
		lblNewLabel_1.setBounds(38, 265, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(124, 24, 70, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 265, 70, 14);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 215, 70, 14);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(111, 290, 70, 14);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 240, 70, 14);
		contentPane.add(textField_4);
		
		rdbtnNewRadioButton = new JRadioButton("Banker");
		rdbtnNewRadioButton.setBounds(51, 84, 110, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Carpenter");
		rdbtnNewRadioButton_1.setBounds(51, 110, 110, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Farmer");
		rdbtnNewRadioButton_2.setBounds(51, 133, 110, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ProfButtonListener profListener = new ProfButtonListener();
		rdbtnNewRadioButton.addActionListener(profListener);
		rdbtnNewRadioButton_1.addActionListener(profListener);
		rdbtnNewRadioButton_2.addActionListener(profListener);
		
		lblMember_2 = new JLabel("Member 4:");
		lblMember_2.setBounds(38, 290, 117, 14);
		contentPane.add(lblMember_2);
		
		lblMember = new JLabel("Member 1:");
		lblMember.setBounds(38, 215, 117, 14);
		contentPane.add(lblMember);
		
		lblMember_1 = new JLabel("Member 2:");
		lblMember_1.setBounds(38, 240, 117, 14);
		contentPane.add(lblMember_1);
		
		lblNewLabel_2 = new JLabel("Set your Initial Pace:");
		lblNewLabel_2.setBounds(231, 63, 138, 14);
		contentPane.add(lblNewLabel_2);
		
		lblSetYourInitial = new JLabel("Set your Initial Rations:");
		lblSetYourInitial.setBounds(420, 63, 154, 14);
		contentPane.add(lblSetYourInitial);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Leisurely");
		rdbtnNewRadioButton_3.setBounds(231, 84, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		rdbtnSteady = new JRadioButton("Steady");
		rdbtnSteady.setBounds(231, 110, 109, 23);
		contentPane.add(rdbtnSteady);
		
		rdbtnGrueling = new JRadioButton("Grueling");
		rdbtnGrueling.setBounds(231, 133, 109, 23);
		contentPane.add(rdbtnGrueling);
		
		PaceButtonListener paceListener = new PaceButtonListener();
		rdbtnGrueling.addActionListener(paceListener);
		rdbtnSteady.addActionListener(paceListener);
		rdbtnNewRadioButton_3.addActionListener(paceListener);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Bare Bones");
		rdbtnNewRadioButton_4.setBounds(420, 84, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		rdbtnMeager = new JRadioButton("Meager");
		rdbtnMeager.setBounds(420, 110, 109, 23);
		contentPane.add(rdbtnMeager);
		
		rdbtnFilling = new JRadioButton("Filling");
		rdbtnFilling.setBounds(420, 133, 109, 23);
		contentPane.add(rdbtnFilling);
		
		RationsButtonListener rationListener = new RationsButtonListener();
		rdbtnMeager.addActionListener(rationListener);
		rdbtnFilling.addActionListener(rationListener);
		rdbtnNewRadioButton_4.addActionListener(rationListener);
		
		lblNewLabel_3 = new JLabel("Select names for other group members");
		lblNewLabel_3.setBounds(34, 190, 270, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Select your profession:");
		lblNewLabel_4.setBounds(51, 63, 143, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(configurationScreen.class.getResource("/configurationScreen/resources/oregon_trail_25 - Copy.gif")));
		lblNewLabel_5.setBounds(278, 175, 326, 164);
		contentPane.add(lblNewLabel_5);
		
		ButtonGroup rationGroup = new ButtonGroup();
		ButtonGroup paceGroup = new ButtonGroup();
		ButtonGroup professionGroup = new ButtonGroup();
		
		rationGroup.add(rdbtnNewRadioButton_4);
		rationGroup.add(rdbtnMeager);
		rationGroup.add(rdbtnFilling);
		
		paceGroup.add(rdbtnNewRadioButton_3);
		paceGroup.add(rdbtnSteady);
		paceGroup.add(rdbtnGrueling);
		
		professionGroup.add(rdbtnNewRadioButton);
		professionGroup.add(rdbtnNewRadioButton_1);
		professionGroup.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton.addActionListener(listener);
		rdbtnNewRadioButton_1.addActionListener(listener);
		rdbtnNewRadioButton_2.addActionListener(listener);
		
		//actionPerformed(goButton);
	}
	
	/**
	 * The listener interface for receiving profButton events.
	 * The class that is interested in processing a profButton
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addProfButtonListener<code> method. When
	 * the profButton event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ProfButtonEvent
	 */
	private class ProfButtonListener implements ActionListener
	{
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed (ActionEvent event)
		{
			
			if (event.getSource() == rdbtnNewRadioButton)
				banker = true;
			else if (event.getSource() == rdbtnNewRadioButton_1)
				carpenter = true;
			else if (event.getSource() == rdbtnNewRadioButton_2)
				farmer = true;
		}
	}
	
	/**
	 * The listener interface for receiving rationsButton events.
	 * The class that is interested in processing a rationsButton
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's actionPerformed method. When the rationsButton 
	 * event occurs, that object's appropriate method is invoked.
	 *
	 * @see RationsButtonEvent
	 */
	private class RationsButtonListener implements ActionListener
	{
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed (ActionEvent event)
		{
			if (event.getSource() == rdbtnFilling)
				filling = true;
			else if (event.getSource() == rdbtnMeager)
				meager = true;
			else if (event.getSource() == rdbtnNewRadioButton_4)
				bareBones = true;
		}
	}
	
	/**
	 * The listener interface for receiving paceButton events.
	 * The class that is interested in processing a paceButton
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's actionPerformed method. When
	 * the paceButton event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see PaceButtonEvent
	 */
	private class PaceButtonListener implements ActionListener
	{
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed (ActionEvent event)
		{
			if (event.getSource() == rdbtnSteady)
				steady = true;
			else if (event.getSource() == rdbtnGrueling)
				grueling = true;
			else if (event.getSource() == rdbtnNewRadioButton_3)
				leisurely = true;
		}
	}
	
	/**
	 * The listener interface for receiving button events.
	 * The class that is interested in processing a button
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's actionPerformed method. When
	 * the button event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ButtonEvent
	 */
	private class ButtonListener implements ActionListener
	{
			
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed (ActionEvent event)
		{
			if (event.getSource() == goButton)
			{
					
			myWagon = new Wagon();
					
			mem1 = new Member(textField_2.getText());
			mem2 = new Member(textField_4.getText());
			mem3 = new Member(textField_1.getText());
			mem4 = new Member(textField_3.getText());
				
			if (banker)
				myLeader = new Leader(textField.getText(), Profession.Banker);
			else if (carpenter)
				myLeader = new Leader(textField.getText(), Profession.Carpenter);
			else if (farmer)
				myLeader = new Leader(textField.getText(), Profession.Farmer);
			
			if (steady)
				myWagon.setCurrPace(Pace.Steady);
			else if(grueling)
				myWagon.setCurrPace(Pace.Grueling);
			else if (leisurely)
				myWagon.setCurrPace(Pace.Leisurely);
			
			if (bareBones)
				myWagon.setCurrRations(Rations.BareBones);
			else if(filling)
				myWagon.setCurrRations(Rations.Filling);
			else if (meager)
				myWagon.setCurrRations(Rations.Meager);
			}	
		}
	}
}

	

