
// TODO: Auto-generated Javadoc
/**
 * The Class Location.
 */
public class Location {
	
	/** The name. */
	String name;
	
	/** The distance. */
	int distance; //distance from beginning
	
	/** If this location is special it's stored here */
	String special;
	
	Shop myShop;
	
	/**
	 * Instantiates a new location.
	 *
	 * @param name the name
	 * @param distance the distance
	 */
	public Location(String name, int distance, Shop myShop){
		this.name = name;
		this.distance = distance;
		this.myShop = myShop;
		special = "";
	}
	
	public Location(String name, int distance){
		this.name = name;
		this.distance = distance;
		myShop = null;
		special = "";
	}
	
	/**
	 * Instantiates a new location.
	 *
	 * @param name the name
	 * @param distance the distance
	 * @param lastOne the last one
	 */
	public Location(String name, int distance, Shop myShop, String special) {
		this(name, distance, myShop);
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
	
	public boolean isRiver() {
		if (special.equals("river")) {
			return true;
		} else {
			return false;
		}
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
