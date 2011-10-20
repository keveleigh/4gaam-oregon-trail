
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The Game Interface, which displays the screen while
 * the user is taking a turn and updates accordingly
 * 
 * @author Four Guys and a Mann
 * @version v0.6 10/20/11
 */
public class GameInterface extends JFrame {

    /** The display. */
    private JPanel display;
    
    /** The leader. */
    private Leader leader;
    
    /** The wagon. */
    private Wagon wagon;
    
    /** The members. */
    private ArrayList<Member> members;

    /**
     * Instantiates a new game interface.
     */
    public GameInterface() {
        display = new configScreen(this);
        display.setSize(609, 311);

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
     * Gets the leader.
     *
     * @return the leader
     */
    public Leader getLeader() {
        return leader;
    }

    /**
     * Sets the leader.
     *
     * @param leader the leader to set
     */
    public void setLeader(Leader leader) {
        this.leader = leader;
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
     * Gets the members.
     *
     * @return the members
     */
    public ArrayList<Member> getMembers() {
        return members;
    }

    /**
     * Sets the members.
     *
     * @param members the members to set
     */
    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
