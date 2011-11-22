
/**
 * The Enumerated type Pace, which represents the Pace of the Wagon
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public enum Pace {

    /** The Leisurely Pace*/
    //goes 20 miles per turn
    Leisurely(20),
    /** The Steady Pace */
    //goes 27 miles per turn
    Steady(27),
    /** The Grueling Pace */
    //goes 32 miles per turn
    Grueling(32);
    
    private int pace;

    Pace(int pace) {
        this.pace = pace;
    }

    public int getPace() {
        return pace;
    }
}
