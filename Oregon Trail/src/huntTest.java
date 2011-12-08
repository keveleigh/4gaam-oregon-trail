import javax.swing.*;

public class huntTest {
	
	/**
     * Launch the application.
     */
    public static void main(String[] args) {
    	Wagon w = new Wagon(null, null);
    	Wagon.wagonLoad.add(new Bullets(25));
    	JFrame frame = new JFrame();
        huntScreen hs = new huntScreen(new GameInterface());
        huntingOptions ho = new huntingOptions(hs);
    	frame.getContentPane().add(ho);
    	frame.pack();
        frame.setVisible(true);
    }
}
