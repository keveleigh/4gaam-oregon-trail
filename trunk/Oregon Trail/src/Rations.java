
/**
 * The Enumerated type Rations, which represents the Rations of the game
 * 
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public enum Rations {

    /** The Filling ration */
    //decrements food by 3 lbs
    Filling (3),
    /** The Meager ration */
    //decrements food by 2 lbs
    Meager (2),
    /** The Bare bones ration */
    //decrements food by 1 lbs
    BareBones (1);
    
    private int rations;
    
    Rations(int rations){
        this.rations = rations;
    }
    
    public int getRations(){
        return rations;
    }
}