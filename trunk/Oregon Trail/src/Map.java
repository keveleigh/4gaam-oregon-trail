import java.util.ArrayList;


public class Map<T> {
	Location[] locations = new Location[18];
	int distanceToNextTown, currentLocation;
	public static Location na = new Location("N/A", 0);
	public static Location onTheTrail = new Location("On the trail", 0);
	
	Turn turn;
	
	public Map(Turn turnReference){
		turn = turnReference;
		createLocations();
	}
	
	private void createLocations() {
		locations[0]  = new Location("Independence, MO", 0);
		locations[1]  = new Location("Kansas River Crossing", 100);
		locations[2]  = new Location("Big Blue River Crossing", 225);
		locations[3]  = new Location("Fort Kearney", 340);
		locations[4]  = new Location("Chimney Rock", 590);
		locations[5]  = new Location("Fort Laramie", 675);
		locations[6]  = new Location("Independence Rock", 865);
		locations[7]  = new Location("South Pass", 970);
		locations[8]  = new Location("Green River", 1025);
		locations[9]  = new Location("Soda Springs", 1170);
		locations[10] = new Location("Fort Hall", 1225);
		locations[11] = new Location("Snake River Crossing", 1410);
		locations[12] = new Location("Fort Boise", 1520);
		locations[13] = new Location("Blue Mountains", 1680);
		locations[14] = new Location("Fort Walla Walla", 1740);
		locations[15] = new Location("The Dalles", 1860);
		locations[16] = new Location("Barlow Toll Road", 1960);
		locations[17] = new Location("Oregon", 2100, true);
	}
	
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
	
	public Location getLocation(int index) {
		return locations[index];
	}
}
