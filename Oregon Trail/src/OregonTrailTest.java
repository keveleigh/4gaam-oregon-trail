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
		Leader leader = new Leader("Kurtis",Profession.Banker);
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
	public void buyTest() {
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
}
