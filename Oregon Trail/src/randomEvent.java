import java.util.*;

public class randomEvent {
	private int event;
	private Wagon wagon;

	private Random random = new Random();
	public randomEvent(){};

	public boolean Event(){
		double yesOrNo = Math.random();
		if (yesOrNo >=.65){
			return true;
		} else {
			return false;
		}
	}

	public int generateEvent(){
		if (Event()){
			return random.nextInt(3);
		} else {
			return 4;
		}
	}

	public String getSick(){
		int sicknessType = random.nextInt(2);
		int person = random.nextInt(3);
		/*
		 * 0 is a broken arm, 1 is a case of the flu, 2 is severe diarrhea
		 */
		if (sicknessType == 0){
			wagon.getMembers().get(person).getMyHealth().decrease(45);
			return wagon.getMembers().get(person).getName() + " has a broken arm.";
		} else if (sicknessType == 1){
			wagon.getMembers().get(person).getMyHealth().decrease();
			return wagon.getMembers().get(person).getName() + " has contracted the flu.";
		} else if (sicknessType == 2){
			wagon.getMembers().get(person).getMyHealth().decrease(30);
			return wagon.getMembers().get(person).getName() + " has a case of severe diarrhea.";
		} else {
			return "Your members have just survived a terrible storm.  Nobody got sick.";
		}
	}

	public String oxDead(){
		Oxen ox = new Oxen();
		wagon.getWagonLoad().remove(ox);
		return "A snake has bitten one of your oxen and killed it.";
	}
	/* doing now!
	public String foundItem(){
		int itemType = random.nextInt(5);
		if ()
	}
	*/
}
