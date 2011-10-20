import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * This is a temporary class used only to demo the storefront.
 * 
 * @author Four Guys and a Mann
 * @version v1 10/20/11
 */

public class storeViewer extends JFrame {

	private JPanel contentPane;
	Shop thisShop = new Shop(new Leader("Kurtis", Profession.Carpenter), new Inventory());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					storeViewer frame = new storeViewer();
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
	public storeViewer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		generalStore gs = new generalStore(thisShop);
		this.add(gs);
	}

}
