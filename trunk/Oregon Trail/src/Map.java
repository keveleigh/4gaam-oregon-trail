import java.util.ArrayList;


// TODO: Auto-generated Javadoc
/**
 * The Class Map.
 *
 * @param <T> the generic type
 */
public class Map<T> {
	
	/** The locations. */
	Location[] locations = new Location[18];
	
	/** The current location. */
	int distanceToNextTown, currentLocation;
	
	/** The na. */
	public static Location na = new Location("N/A", 0, null);
	
	/** The on the trail. */
	public static Location onTheTrail = new Location("On the trail", 0, null);
	
	/** The turn. */
	Turn turn;
	
	/**
	 * Instantiates a new map.
	 *
	 * @param turnReference the turn reference
	 */
	public Map(Turn turnReference){
		turn = turnReference;
		createLocations();
	}
	
	/**
	 * Creates the locations.
	 */
	private void createLocations() {
		locations[0]  = new Location("Independence, MO", 0);
		locations[1]  = new Location("Kansas River Crossing", 100);
		locations[2]  = new Location("Big Blue River Crossing", 225);
		locations[3]  = new Location("Fort Kearney", 340, new Shop());
		locations[4]  = new Location("Chimney Rock", 590);
		locations[5]  = new Location("Fort Laramie", 675, new Shop());
		locations[6]  = new Location("Independence Rock", 865);
		locations[7]  = new Location("South Pass", 970);
		locations[8]  = new Location("Green River", 1025);
		locations[9]  = new Location("Soda Springs", 1170);
		locations[10] = new Location("Fort Hall", 1225, new Shop());
		locations[11] = new Location("Snake River Crossing", 1410);
		locations[12] = new Location("Fort Boise", 1520, new Shop());
		locations[13] = new Location("Blue Mountains", 1680);
		locations[14] = new Location("Fort Walla Walla", 1740, new Shop());
		locations[15] = new Location("The Dalles", 1860);
		locations[16] = new Location("Barlow Toll Road", 1960);
		locations[17] = new Location("Oregon", 2100, true);
	}
	
	/**
	 * Gets the last loc.
	 *
	 * @return the last loc
	 */
	public Location getLastLoc() {
		int totalDistTraveled = turn.getDistanceMoved();
		Location toReturn = na;
		
		if (totalDistTraveled != 0) {
			for (int i = locations.length-1; i >= 0; i--) {
				if (totalDistTraveled >= locations[i].getDistance()) {
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
		int totalDistTraveled = turn.getDistanceMoved();
		int toReturn = 0;
		
		boolean checkedOregon = false;
		for (int i = locations.length-1; i >= 0; i--) {
			if (totalDistTraveled >= locations[i].getDistance()) {
				if (checkedOregon == false)
					return 0;
				else {
					toReturn = locations[i+1].getDistance()-totalDistTraveled;
					break;
				}
			}
			checkedOregon = true;
		}
		
		return toReturn;
	}
	
	/**
	 * Gets the curr location.
	 *
	 * @return the curr location
	 */
	public Location getCurrLocation() {
		int totalDistTraveled = turn.getDistanceMoved();
		Location toReturn = onTheTrail;
		
		for (int i = locations.length-1; i >= 0; i--) {
			if (totalDistTraveled == locations[i].getDistance()) {
				toReturn = locations[i];
			}
		}
		
		return toReturn;
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
}
