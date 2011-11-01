import javax.swing.*;


// TODO: Auto-generated Javadoc
/**
 * The Class Turn, which allows the user to take a turn
 * and updates the rations, pace, and distance accordingly.
 *
 * @author Four Guys and a Mann
 * @version v0.6 10/20/11
 */

public class Turn {

    /** The wagon. */
    private Wagon wagon;
    
    /** The wagon load. */
    private Inventory wagonLoad;
    
    /** The distance moved. */
    private int distanceMoved;
    
    /** The current food. */
    private int currentFood;

    /**
     * Instantiates a new turn.
     *
     * @param wagon the wagon
     */
    public Turn(Wagon wagon) {
        this.wagon = wagon;
        wagonLoad = wagon.getWagonLoad();
        distanceMoved = 0;
        currentFood = wagonLoad.getQuantity(3);
    }

    /**
     * Take turn.
     *
     * @param mapClass the map class
     */
    public void takeTurn(Map mapClass) {
        Location lastTown = mapClass.getLastLoc();
        distanceMoved += wagon.getCurrPace().getPace();
        Location lastTown2 = mapClass.getLastLoc();
        
        if (lastTown != Map.na && !lastTown.equals(lastTown2)) {
        	// The two towns aren't the same, so you advanced a town
        	distanceMoved = mapClass.getLastLoc().getDistance();
        }
        
        if(currentFood > 0)
            currentFood -= (wagon.getCurrRations().getRations())*(wagon.getMembers().size() + 1);
    }

    /**
     * Gets the distance moved.
     *
     * @return the distanceMoved
     */
    public int getDistanceMoved() {
        return distanceMoved;
    }
    
    /**
     * Sets the distance moved.
     *
     * @param dist the new distance moved
     */
    public void setDistanceMoved(int dist) {
    	distanceMoved = dist;
    }

    /**
     * Gets the current food.
     *
     * @return the currentFood
     */
    public int getCurrentFood() {
        return currentFood;
    }
}
