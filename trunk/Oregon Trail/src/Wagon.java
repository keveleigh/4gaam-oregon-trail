
import java.util.ArrayList;
import java.util.Date;

/**
 * The Class Wagon, which controls the pace and the rations of the game.
 * This is one of the main classes of the game
 * 
 * @author Four Guys and a Mann
 * @version v1.0 10/10/11
 */
public class Wagon {

    /** The current pace. */
    private Pace currPace;
    /** The current rations. */
    private Rations currRations;
    /**The wagon's Inventory. */
    static Inventory wagonLoad;
    /**The party leader. */
    private Leader leader;
    /**List of party members */
    private static ArrayList<Member> members;
    /** Current date */
    private Date date;

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
     * Gets the date
     * @return date
     */
    
    public Date getDate() {
    	return date;
    }
    
    /**
     * Gets the date as a string
     * @return Date as a string
     */
    
    public String getDateString() {
    	return Integer.toString(date.getMonth()) + "/" + Integer.toString(date.getDate()) + "/" + Integer.toString(date.getYear());
    }
    
    /**
     * Sets date
     * @param date the date
     */
    
    
    public void setDate(Date date) {
    	this.date = date;
    }
    
    /**
     * Advances a day
     */
    
    public void nextDay() {
    	date.setDate(date.getDate()+1);
    }

    /**
     * @return the wagonLoad
     */
    public static Inventory getWagonLoad() {
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
    public static ArrayList<Member> getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
