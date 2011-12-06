import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

/**
 * Oregon Trail JUnit tests
 * @author Daryl, Stefan
 *
 */
public class OregonTrailTest {
	Random rand = new Random(9);


	/**
	 * This JUnit test tests the getSick method in the randomEvent class
	 */
	@Test
	public void testGetSick(){
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("Stefan"));
		members.add(new Member("Daryl"));
		members.add(new Member("Thomas"));
		members.add(new Member("Jesten"));
		Leader leader = new Leader("Kurtis", Profession.Banker);
		Wagon wagon = new Wagon(leader, members);
		Map map = new Map(wagon);
		String out = "";
		int randPerson = rand.nextInt(3);
		int randSickness = rand.nextInt(2);
		if (randPerson ==0 && randSickness ==0){
			out = "Stefan has a broken arm";
		} else if (randPerson ==1 && randSickness ==0){
			out = "Daryl has a broken arm";
		} else if (randPerson ==2 && randSickness ==0){
			out = "Thomas has a broken arm";
		} else if (randPerson ==3 && randSickness ==0){
		}
	}
	
	@Test
	public void testBuy() {
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("Stefan"));
		members.add(new Member("Daryl"));
		members.add(new Member("Thomas")); //Stefan, fix
		members.add(new Member("Jesten"));
		Leader leader = new Leader("Kurtis",Profession.Banker);
		Wagon wagon = new Wagon(leader, members);
		Map map = new Map(wagon);
		Shop shop = new Shop();
		shop.enter(wagon);
		Oxen oxen = new Oxen(3);
		Axle axle = new Axle(5);
		//inventory- 0 = axle 1 = bullets 2 = clothes 3 = food 4 = oxen 5 = tongue 6 = wheels
		assertEquals(0, wagon.getWagonLoad().getQuantity(0));
		assertEquals(0, wagon.getWagonLoad().getQuantity(1));
		assertEquals(0, wagon.getWagonLoad().getQuantity(2));
		assertEquals(0, wagon.getWagonLoad().getQuantity(3));
		assertEquals(0, wagon.getWagonLoad().getQuantity(4));
		assertEquals(0, wagon.getWagonLoad().getQuantity(5));
		assertEquals(0, wagon.getWagonLoad().getQuantity(6));
		leader.setMoney(1234567);
		shop.buy(oxen);
		assertEquals(3, wagon.getWagonLoad().getQuantity(4));
		shop.buy(axle);
		assertEquals(5, wagon.getWagonLoad().getQuantity(0));
	}
	
	/**
	 * This is to test the weather random events generator in the randomEvent class.  Created by Daryl Halima
	 */
	@Test
	public void testWeather(){
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("Stefan"));
		members.add(new Member("Daryl"));
		members.add(new Member("Thomas"));
		members.add(new Member("Jesten"));
		Leader leader = new Leader("Kurtis",Profession.Banker);
		Wagon wagon = new Wagon(leader, members);
		Map map = new Map(wagon);
		randomEvent event = new randomEvent();
		String out = "";
		int random = rand.nextInt(4);
		if (random == 0) {
			out = "You have made it through the thunderstorm.  Hopefully all your members are still alive.";;
		} else if (random == 1){
			out = "You and your members have gotten stuck in a sandstorm and lose 5 days";
		} else if (random == 2){
			out = "You and your members have been struck by hail.";
		} else {
			out = "You have made it past a terrible storm but made it through safely.";
		}
		assertEquals(event.weather(random), out);
	}
	
	@Test
	public void testHealth() {
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("Stefan"));
		members.add(new Member("Daryl"));
		members.add(new Member("Thomas"));
		members.add(new Member("Jesten"));
		Leader leader = new Leader("Kurtis",Profession.Banker);
		Wagon wagon = new Wagon(leader, members);
		Map map = new Map(wagon);
		
		assertEquals(members.get(0).getMyHealth().getHealth(), 100);
		assertEquals(members.get(1).getMyHealth().getHealth(), 100);
		assertEquals(members.get(2).getMyHealth().getHealth(), 100);
		assertEquals(members.get(3).getMyHealth().getHealth(), 100);
		
		randomEvent event = new randomEvent();
		
		// Flu to person at index 1
		event.getSick(1, 1);
		
		assertEquals(members.get(0).getMyHealth().getHealth(), 100);
		assertEquals(members.get(1).getMyHealth().getHealth(), 85);
		assertEquals(members.get(2).getMyHealth().getHealth(), 100);
		assertEquals(members.get(3).getMyHealth().getHealth(), 100);
		
		// Diarrhea to person at index 3
		event.getSick(2, 3);
		
		assertEquals(members.get(0).getMyHealth().getHealth(), 100);
		assertEquals(members.get(1).getMyHealth().getHealth(), 85);
		assertEquals(members.get(2).getMyHealth().getHealth(), 100);
		assertEquals(members.get(3).getMyHealth().getHealth(), 70);
		
		// Flu to person at index 0
		event.getSick(0, 0);
		
		assertEquals(members.get(0).getMyHealth().getHealth(), 55);
		assertEquals(members.get(1).getMyHealth().getHealth(), 85);
		assertEquals(members.get(2).getMyHealth().getHealth(), 100);
		assertEquals(members.get(3).getMyHealth().getHealth(), 70);
		
		// Kill person 2
		members.get(2).getMyHealth().decrease(200);
		
		// Check if alive
		assertEquals(members.get(0).getMyHealth().isAlive(), true);
		assertEquals(members.get(1).getMyHealth().isAlive(), true);
		assertEquals(members.get(2).getMyHealth().isAlive(), false);
		assertEquals(members.get(3).getMyHealth().isAlive(), true);
		
		assertEquals(members.get(0).getMyHealth().getHealth(), 55);
		assertEquals(members.get(1).getMyHealth().getHealth(), 85);
		assertEquals(members.get(2).getMyHealth().getHealth(), 0);
		assertEquals(members.get(3).getMyHealth().getHealth(), 70);
		
		// Set everyone's health back to 100 (revive person 2 as well)
		members.get(0).getMyHealth().increase(100);
		members.get(1).getMyHealth().increase(100);
		members.get(2).getMyHealth().increase(100);
		members.get(3).getMyHealth().increase(100);
		
		assertEquals(members.get(0).getMyHealth().getHealth(), 100);
		assertEquals(members.get(1).getMyHealth().getHealth(), 100);
		assertEquals(members.get(2).getMyHealth().getHealth(), 100);
		assertEquals(members.get(3).getMyHealth().getHealth(), 100);
	}
	
	@Test
	public void testTraveling() {
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("Stefan"));
		members.add(new Member("Daryl"));
		members.add(new Member("Thomas"));
		members.add(new Member("Jesten"));
		Leader leader = new Leader("Kurtis",Profession.Banker);
		Wagon wagon = new Wagon(leader, members);
		Map map = new Map(wagon);
		
		// Set the pace to grueling
		wagon.setCurrPace(Pace.Grueling);
		assertEquals(wagon.getCurrPace(), Pace.Grueling);
		
		// Check if we start at Independence
		assertEquals(map.getCurrLocation().getName(), "Independence, MO");
		assertEquals(map.getCurrLocation().isRiver(), false);
		assertEquals(map.getCurrLocation().isLast(), false);
		// Check last location
		assertEquals(map.getLastLoc().getName(), "N/A");
		
		// Distance moved should be 0
		assertEquals(map.getDistanceMoved(), 0);
		
		// Take a turn without random events
		map.takeTurn(wagon, false);
		
		// Distance moved should be equal to the pace
		assertEquals(map.getDistanceMoved(), wagon.getCurrPace().getPace());
		
		// Take a few more turns
		map.takeTurn(wagon, false);
		
		assertEquals(map.getCurrLocation().getName(), "On the trail");
		
		map.takeTurn(wagon, false);
		map.takeTurn(wagon, false);
		
		// Should have arrived at Kansas River Crossing
		assertEquals(map.getCurrLocation().getName(), "Kansas River Crossing");
		assertEquals(map.getCurrLocation().isRiver(), true);
		assertEquals(map.getCurrLocation().isLast(), false);
		assertEquals(map.getDistanceMoved(), 100);
		
		// Go to last location
		
		for (int i = 0; i < 68; i++) {
			map.takeTurn(wagon, false);
		}
		
		assertEquals(map.getCurrLocation().getName(), "Oregon");
		assertEquals(map.getCurrLocation().isRiver(), false);
		assertEquals(map.getCurrLocation().isLast(), true);
		
		assertEquals(map.getDistanceMoved(), 2100);
	}
}
