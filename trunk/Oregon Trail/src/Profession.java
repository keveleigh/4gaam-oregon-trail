
/**
 * The Enumerated type Profession, which represents the Profession of the Leader
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public enum Profession {

    /** The Carpenter profession */
    Carpenter (1200),
    /** The Banker profession */
    Banker (1500),
    /** The Farmer profession */
    Farmer (1000);
    
    private int startingCash;
    
    Profession(int cash){
        startingCash = cash;
    }
    
    public int getCash(){
        return startingCash;
    }
}
