
public class Location {
	String name;
	int distance; //distance from beginning
	boolean lastOne;
	
	public Location(String name, int distance){
		this.name = name;
		this.distance = distance;
	}
	
	public Location(String name, int distance, boolean lastOne) {
		this(name, distance);
		this.lastOne = lastOne;
	}

	public String getName() {
		return name;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public boolean isLast() {
		if (lastOne == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(Location loc2) {
		if (name == loc2.getName() && distance == loc2.getDistance())
			return true;
		else
			return false;
	}
}
