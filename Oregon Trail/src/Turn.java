
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
