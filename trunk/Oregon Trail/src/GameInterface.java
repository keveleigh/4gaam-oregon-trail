
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameInterface extends JFrame {

    private JPanel display;
    private Leader leader;
    private Wagon wagon;
    private ArrayList<Member> members;

    public GameInterface() {
        display = new configScreen(this);
        display.setSize(609, 311);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, display.getWidth() + 40, display.getHeight() + 20);
        setTitle("Oregon Trail");
        setResizable(false);
        
        add(display);
    }
    
    public void changeDisplay(JPanel panel){
        remove(display);
        display = panel;
        add(display);
        validate();
    }
    
    public void updateBounds(int width, int height){
        setBounds(100, 100, width + 60, height + 20);
    }

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
     * @return the leader
     */
    public Leader getLeader() {
        return leader;
    }

    /**
     * @param leader the leader to set
     */
    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    /**
     * @return the wagon
     */
    public Wagon getWagon() {
        return wagon;
    }

    /**
     * @param wagon the wagon to set
     */
    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    /**
     * @return the members
     */
    public ArrayList<Member> getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
