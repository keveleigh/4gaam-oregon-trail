
/**
 * The Class Turn, which allows the user to take a turn
 * and updates the rations, pace, and distance accordingly
 * 
 * @author Four Guys and a Mann
 * @version v0.6 10/20/11
 */

public class Turn {

    private Wagon wagon;
    private Inventory wagonLoad;
    private int distanceMoved;
    private int currentFood;

    public Turn(Wagon wagon) {
        this.wagon = wagon;
        wagonLoad = wagon.getWagonLoad();
        distanceMoved = 0;
        currentFood = wagonLoad.getQuantity(3);
    }

    public void takeTurn() {
        distanceMoved += wagon.getCurrPace().getPace();
        if(currentFood > 0)
            currentFood -= (wagon.getCurrRations().getRations())*wagon.getMembers().size();
    }

    /**
     * @return the distanceMoved
     */
    public int getDistanceMoved() {
        return distanceMoved;
    }

    /**
     * @return the currentFood
     */
    public int getCurrentFood() {
        return currentFood;
    }
}
