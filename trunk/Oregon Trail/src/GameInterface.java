
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The Game Interface, which displays the screen while
 * the user is taking a turn and updates accordingly
 * 
 * @author Four Guys and a Mann
 * @version v1.1 11/9/11
 */
public class GameInterface extends JFrame {

    /** The display. */
    private JPanel display;
    
    /** The wagon. */
    private Wagon wagon;
    
    /** The map. */
    private Map map;

    /**
     * Instantiates a new game interface.
     */
    public GameInterface() {
        display = new configScreen(this);
        display.setSize(565, 407);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, display.getWidth() + 40, display.getHeight() + 20);
        setTitle("Oregon Trail");
        setResizable(false);
        
        add(display);
    }
    
    /**
     * Change display.
     *
     * @param panel the panel
     */
    public void changeDisplay(JPanel panel){
        remove(display);
        display = panel;
        updateBounds(panel.getWidth(), panel.getHeight());
        add(display);
        validate();
    }
    
    /**
     * Update bounds.
     *
     * @param width the width
     * @param height the height
     */
    public void updateBounds(int width, int height){
        setBounds(100, 100, width + 60, height + 20);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    GameInterface frame = new GameInterface();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Gets the wagon.
     *
     * @return the wagon
     */
    public Wagon getWagon() {
        return wagon;
    }

    /**
     * Sets the wagon.
     *
     * @param wagon the wagon to set
     */
    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }
    
    /**
     * Gets the map.
     *
     * @return The map
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the map.
     *
     * @param map The map to set
     */
    public void setMap(Map map) {
        this.map = map;
    }
}

