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
		/*
		 * 0 is getSick, 1 is weather, 2 is oxDead, 3 is foundItem, 4 nothing happens
		 */
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
	
	public String weather(){
		int weather = random.nextInt(2);
		/*
		 * 0 is thunderstorm, 1 is a sandstorm, 2 is hail
		 */
		if (weather ==0){
			getSick();
			return "You have made it through the thunderstorm.  Hopefully all your members are still alive.";
		} else if (weather ==1){
			//TODO implement when time is ready
			return "You have lost 5 days through the sandstorm";
		} else if (weather ==2){
			for (int i = 0; i < wagon.getMembers().size(); i++){
				wagon.getMembers().get(i).getMyHealth().decrease(30);
			}
			return "You and your members have been struck by hail.";
		} else {
			return "You have made it past a terrible storm but made it through safely.";
		}
	}

	public String oxDead(){
		Oxen ox = new Oxen();
		wagon.getWagonLoad().items.get(4).decrement();
		return "A snake has bitten one of your oxen and killed it.";
	}
	
	public String foundItem(){
		int itemType = random.nextInt(3);
		if (itemType == 0){
			int presQuant = wagon.getWagonLoad().items.get(4).quantity; 
			wagon.getWagonLoad().items.get(4).setQuantity(presQuant+1);
			return "You have just found an ox in the middle of nowhere!";
		} else if (itemType ==1){
			int numFound = random.nextInt(50);
			Bullets bullets = new Bullets(numFound);
			wagon.getWagonLoad().add(bullets);
			return "You have just found " + numFound + " bullets!";
		} else if (itemType ==2){
			int numFound = random.nextInt(10);
			Clothes clothes = new Clothes(numFound);
			wagon.getWagonLoad().add(clothes);
			return "You have found a tribe who has just been attacked by wolves.  You take their clothes and gain " + numFound + " pairs of clothing.";
		} else if (itemType ==3){
			int numFound = random.nextInt(100);
			Food food = new Food(numFound);
			wagon.getWagonLoad().add(food);
			return "You have stumbled upon " + numFound + " pounds of berries!";
		} else {
			return "You have found an ox, but it ran away before you could control it.";
		}
	}
}
