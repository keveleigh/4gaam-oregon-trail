
import java.util.ArrayList;

/**
 * The Class Wagon, which controls the pace and the rations of the game.
 * This is one of the main classes of the game
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public class Wagon {

    /** The current pace. */
    private Pace currPace;
    /** The current rations. */
    private Rations currRations;
    /**The wagon's Inventory. */
    private Inventory wagonLoad;
    /**The party leader. */
    private Leader leader;
    /**List of party members */
    private ArrayList<Member> members;


    /**
     * Instantiates a new wagon.
     */
    public Wagon(Leader leader, ArrayList<Member> members) {
        this.leader = leader;
        currPace = Pace.Steady;
        currRations = Rations.Filling;
        wagonLoad = new Inventory();
        this.members = members;
    }

    /**
     * @return the currPace
     */
    public Pace getCurrPace() {
        return currPace;
    }

    /**
     * @param currPace the currPace to set
     */
    public void setCurrPace(Pace currPace) {
        this.currPace = currPace;
    }

    /**
     * @return the currRations
     */
    public Rations getCurrRations() {
        return currRations;
    }

    /**
     * @param currRations the currRations to set
     */
    public void setCurrRations(Rations currRations) {
        this.currRations = currRations;
    }

    /**
     * @return the wagonLoad
     */
    public Inventory getWagonLoad() {
        return wagonLoad;
    }

    /**
     * @param wagonLoad the wagonLoad to set
     */
    public void setWagonLoad(Inventory wagonLoad) {
        this.wagonLoad = wagonLoad;
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
