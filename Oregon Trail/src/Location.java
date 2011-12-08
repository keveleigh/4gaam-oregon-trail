// TODO: Auto-generated Javadoc
/**
 * The location class.
 * This class represents the various locations in the game.
 * 
 * @author Four Guys and a Mann
 * @version v1.5 11/9/11
 */
public class Location {
	
	/** The name. */
	String name;
	
	/** The distance. */
	int distance; //distance from beginning
	
	/** If this location is special it's stored here. */
	String special;
	
        /** The shop of the location if it has one. */
	Shop myShop;
	
	/**
	 * Instantiates a new location. The default constructor.
	 *
	 * @param name The name of the location
	 * @param distance The distance from the start
	 */
	public Location(String name, int distance){
		this.name = name;
		this.distance = distance;
		myShop = null;
		special = "";
	}
	
	/**
	 * Instantiates a new location.
	 *
	 * @param name The name of the location
	 * @param distance The distance from the start
	 * @param myShop The location's shop
	 */
	public Location(String name, int distance, Shop myShop){
		this(name, distance);
		this.myShop = myShop;
		special = "";
	}
	
	/**
	 * Instantiates a new location.
	 *
	 * @param name The name of the location
	 * @param distance The distance from the start
	 * @param myShop the my shop
	 * @param special Any special information about the location
	 */
	public Location(String name, int distance, Shop myShop, String special) {
		this(name, distance);
		this.myShop = myShop;
		this.special = special;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}
	
	/**
	 * Checks for fork.
	 *
	 * @return true, if successful
	 */
	public boolean hasFork() {
		if (special.equals("forked")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if is last.
	 *
	 * @return true, if is last
	 */
	
	public boolean isLast() {
		if (special.equals("last")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if is river.
	 *
	 * @return true, if is river
	 */
	public boolean isRiver() {
		if (special.equals("river")) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Changes the distance if the fork was taken
	 */
	
	public void tookFork() {
		distance = distance + 100;
	}
	
	/**
	 * Equals.
	 *
	 * @param loc2 the loc2
	 * @return true, if successful
	 */
	public boolean equals(Location loc2) {
		if (name == loc2.getName() && distance == loc2.getDistance())
			return true;
		else
			return false;
	}
}
