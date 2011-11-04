
// TODO: Auto-generated Javadoc
/**
 * The Class Location.
 */
public class Location {
	
	/** The name. */
	String name;
	
	/** The distance. */
	int distance; //distance from beginning
	
	/** The last one. */
	boolean lastOne;
	
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
	}
	
	public Location(String name, int distance){
		this.name = name;
		this.distance = distance;
		myShop = null;
	}
	
	/**
	 * Instantiates a new location.
	 *
	 * @param name the name
	 * @param distance the distance
	 * @param lastOne the last one
	 */
	public Location(String name, int distance, boolean lastOne) {
		this(name, distance);
		this.lastOne = lastOne;
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
		if (lastOne == true) {
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
