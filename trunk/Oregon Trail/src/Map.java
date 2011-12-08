

/**
 * The Map class.
 * This class keeps track of the player's location.
 * 
 * @author Four Guys and a Mann
 * @version v1.5 11/9/11
 */
public class Map {

    /** The locations. */
    Location[] locations = new Location[18];
    /** The current location. */
    int distanceMoved;
    
    /** The N/A location. */
    public static Location na = new Location("N/A", 0);
    /** The on the trail. */
    public static Location onTheTrail = new Location("On the trail", 0);
    /** If we took the fork in the road at Fort Bridger */
    public boolean tookFork;
    /** The fork location */
    public Location fork;
    
    /** String of the event outcome. */
    public static String eventOutcome;
    /** The wagon. */
    Wagon wagon;

    /**
     * Instantiates a new map.
     *
     * @param wagon The current wagon.
     */
    public Map(Wagon wagon) {
        this.wagon = wagon;
        distanceMoved = 0;
        createLocations();
    }

    /**
     * Creates the locations.
     */
    private void createLocations() {
        locations[0] = new Location("Independence, MO", 0);
        locations[1] = new River("Kansas River Crossing", 100, 3, 100);
        locations[2] = new River("Big Blue River Crossing", 225, 5, 120);
        locations[3] = new Location("Fort Kearney", 340, new Shop());
        locations[4] = new Location("Chimney Rock", 590);
        locations[5] = new Location("Fort Laramie", 675, new Shop());
        locations[6] = new Location("Independence Rock", 865);
        locations[7] = new Location("South Pass", 970, null, "forked");
        locations[8] = new River("Green River", 1025, 2, 135);
        locations[9] = new Location("Soda Springs", 1170);
        locations[10] = new Location("Fort Hall", 1225, new Shop());
        locations[11] = new River("Snake River Crossing", 1410, 8, 100);
        locations[12] = new Location("Fort Boise", 1520, new Shop());
        locations[13] = new Location("Blue Mountains", 1680);
        locations[14] = new Location("Fort Walla Walla", 1740, new Shop());
        locations[15] = new Location("The Dalles", 1860);
        locations[16] = new Location("Barlow Toll Road", 1960);
        locations[17] = new Location("Oregon", 2100, null, "last");
        
        // Extra Location for the fork and Fort Bridger
        fork = new Location("Fort Bridger", 1090, new Shop());
    }
    
    public void takeTurn(Wagon wagon) {
    	randomEvent randEvent = new randomEvent();
    	// Do takeTurn with Random events
    	takeTurn(wagon, randEvent.Event());
    }

    public void takeTurn(Wagon wagon, boolean doRandom) {
        Inventory wagonLoad = wagon.getWagonLoad();
        int currentFood = wagonLoad.getQuantity(3);
        Location lastTown = getLastLoc();
        distanceMoved += wagon.getCurrPace().getPace();
        Location lastTown2 = getLastLoc();
        int consumedFood = (wagon.getCurrRations().getRations()) * (wagon.getMembers().size() + 1);

        if (lastTown != Map.na && !lastTown.equals(lastTown2)) {
            // The two towns aren't the same, so you advanced a town
            distanceMoved = getLastLoc().getDistance();
        }

        //Random events
        if (doRandom) {
	        randomEvent randEvent = new randomEvent();
	        int eventType = randEvent.generateEvent();
			if (eventType == 0) {
				eventOutcome = randEvent.getSick();
				mainScreen.randEventPopup(eventOutcome);
			} else if (eventType == 1) {
				eventOutcome = randEvent.getWell();
				mainScreen.randEventPopup(eventOutcome);
			} else if (eventType == 2) {
				eventOutcome = randEvent.weather();
				mainScreen.randEventPopup(eventOutcome);
			} else if (eventType == 3) {
				eventOutcome = randEvent.oxDead();
				mainScreen.randEventPopup(eventOutcome);
			} else if (eventType == 4) {
				eventOutcome = randEvent.foundItem();
				mainScreen.randEventPopup(eventOutcome);
			} else if (eventType == 5) {
				eventOutcome = randEvent.loseItem();
				mainScreen.randEventPopup(eventOutcome);
			} else if (eventType == 6) {
				eventOutcome = randEvent.wagonDamage();
				mainScreen.randEventPopup(eventOutcome);	
			} else if (eventType == 7) {
				eventOutcome = randEvent.oxStolen();
				mainScreen.randEventPopup(eventOutcome);
			} else if (eventType == 8) {
				eventOutcome = randEvent.getEmotional();
				mainScreen.randEventPopup(eventOutcome);
			}
        }

        if (currentFood > 0) {
            wagonLoad.remove(new Food(consumedFood));
        }
        this.wagon = wagon;
    }

    /**
     * Gets the last location.
     *
     * @return the last location
     */
    public Location getLastLoc() {
        Location toReturn = na;

        if (distanceMoved != 0) {
            for (int i = locations.length - 1; i >= 0; i--) {
                if (distanceMoved >= locations[i].getDistance()) {
                    toReturn = locations[i];
                    break;
                }
            }
        }
        return toReturn;
    }

    /**
     * Gets the distance to next.
     *
     * @return the distance to next
     */
    public int getDistanceToNext() {
        int toReturn = 0;

        boolean checkedOregon = false;
        for (int i = locations.length - 1; i >= 0; i--) {
            if (distanceMoved >= locations[i].getDistance()) {
                if (checkedOregon == false) {
                    return 0;
                } else {
                    toReturn = locations[i + 1].getDistance() - distanceMoved;
                    break;
                }
            }
            checkedOregon = true;
        }

        return toReturn;
    }

    /**
     * Gets the current location.
     *
     * @return the current location
     */
    public Location getCurrLocation() {
        Location toReturn = onTheTrail;

        for (int i = locations.length - 1; i >= 0; i--) {
            if (distanceMoved == locations[i].getDistance()) {
                toReturn = locations[i];
            }
        }

        return toReturn;
    }
    
    private int getCurrLocationIndex() {
        Location toReturn = onTheTrail;
        
        int i = locations.length - 1;
        
        while (i >= 0) {
            if (distanceMoved == locations[i].getDistance()) {
                toReturn = locations[i];
                break;
            }
            
            i--;
        }
        
        if (toReturn != onTheTrail) {
        	return i;
        } else {
        	return -1;
        }
    }

    /**
     * Gets the location.
     *
     * @param index the index
     * @return the location
     */
    public Location getLocation(int index) {
        return locations[index];
    }

    public River getRiver() {
        return (River) getCurrLocation();
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
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
     * Does everything neccessary for taking the fork.
     */
    
    public void takeFork() {
    	locations[getCurrLocationIndex()+1] = fork;
    	for (int i = getCurrLocationIndex()+2; i < locations.length; i++) {
    		locations[i].tookFork();
    	}
    }

    /**
     * Sets the distance moved.
     *
     * @param dist the new distance moved
     */
    public void setDistanceMoved(int dist) {
        distanceMoved = dist;
    }
}
