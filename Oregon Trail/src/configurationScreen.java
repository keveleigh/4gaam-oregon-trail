import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;


public class configurationScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblMember_2;
	private JLabel lblMember;
	private JLabel lblMember_1;
	private JLabel lblNewLabel_2;
	private JLabel lblSetYourInitial;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnSteady;
	private JRadioButton rdbtnGrueling;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnMeager;
	private JRadioButton rdbtnFilling;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Leader Name:");
		lblNewLabel.setBounds(34, 24, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Member 4:");
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Banker");
		rdbtnNewRadioButton.setBounds(51, 84, 110, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Carpenter");
		rdbtnNewRadioButton_1.setBounds(51, 110, 110, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Farmer");
		rdbtnNewRadioButton_2.setBounds(51, 133, 110, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		lblMember_2 = new JLabel("Member 5:");
		lblMember_2.setBounds(38, 290, 117, 14);
		contentPane.add(lblMember_2);
		
		lblMember = new JLabel("Member 2:");
		lblMember.setBounds(38, 215, 117, 14);
		contentPane.add(lblMember);
		
		lblMember_1 = new JLabel("Member 3:");
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
		
		rdbtnNewRadioButton_4 = new JRadioButton("Bare Bones");
		rdbtnNewRadioButton_4.setBounds(420, 84, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		rdbtnMeager = new JRadioButton("Meager");
		rdbtnMeager.setBounds(420, 110, 109, 23);
		contentPane.add(rdbtnMeager);
		
		rdbtnFilling = new JRadioButton("Filling");
		rdbtnFilling.setBounds(420, 133, 109, 23);
		contentPane.add(rdbtnFilling);
		
		lblNewLabel_3 = new JLabel("Select names for other group members.");
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
		
	}
}
