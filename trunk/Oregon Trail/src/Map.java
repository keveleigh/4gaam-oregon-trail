import java.util.ArrayList;


public class Map<T> {
	Location[] locations = new Location[18];
	int distanceToNextTown, currentLocation;
	
	Turn turn;
	
	public Map(Turn turnReference){
		turn = turnReference;
		createLocations();
	}
	
	private void createLocations() {
		locations[0]  = new Location("Independence, MO", 0);
		locations[1]  = new Location("Kansas River Crossing", 102);
		locations[2]  = new Location("Big Blue River Crossing", 221);
		locations[3]  = new Location("Fort Kearney", 340);
		locations[4]  = new Location("Chimney Rock", 590);
		locations[5]  = new Location("Fort Laramie", 676);
		locations[6]  = new Location("Independence Rock", 866);
		locations[7]  = new Location("South Pass", 968);
		locations[8]  = new Location("Green River", 1025);
		locations[9]  = new Location("Soda Springs", 1169);
		locations[10] = new Location("Fort Hall", 1226);
		locations[11] = new Location("Snake River Crossing", 1408);
		locations[12] = new Location("Fort Boise", 1522);
		locations[13] = new Location("Blue Mountains", 1682);
		locations[14] = new Location("Fort Walla Walla", 1737);
		locations[15] = new Location("The Dalles", 1857);
		locations[16] = new Location("Barlow Toll Road", 1957);
		locations[17] = new Location("Oregon", 2100);
	}
	
	public String getLastTown() {
		int totalDistTraveled = turn.getDistanceMoved();
		String toReturn = "Unknown";
		
		for (int i = locations.length-1; i >= 0; i--) {
			if (totalDistTraveled > locations[i].getDistance()) {
				toReturn = locations[i].getName();
				break;
			}
		}
		
		return toReturn;
	}
}
