import java.util.*;

public class randomEvent {
	private int event;

	private Random random = new Random();
	public randomEvent(){};

	public boolean Event(){
		double yesOrNo = random.nextInt(4);
		if (yesOrNo ==1){
			return true;
		} else {
			return false;
		}
	}

	public int generateEvent(){
		/*
		 * 0 is getSick, 1 is getWell, 2 is weather, 3 is oxDead, 4 is foundItem, 
		 * 5 loseItem, 6 is wagonDamage, 7 is oxStolen, 8 is getEmotional, 
		 * 9 is newMember, 10 is tribeEncounter, 11 nothing happens
		 */
		if (Event()){
			return random.nextInt(12);
		} else {
			return 4;
		}
	}

	public String getSick() {
		/*
		 * 0 is a broken arm, 1 is a case of the flu, 2 is severe diarrhea
		 */
		return getSick(random.nextInt(4), random.nextInt(4));
	}

	public String getSick(int sicknessType, int person){
		if (sicknessType == 0){
			Wagon.getMembers().get(person).getMyHealth().decrease(45);
			return Wagon.getMembers().get(person).getName() + " has a broken arm.";
		} else if (sicknessType == 1){
			Wagon.getMembers().get(person).getMyHealth().decrease();
			return Wagon.getMembers().get(person).getName() + " has contracted the flu.";
		} else if (sicknessType == 2){
			Wagon.getMembers().get(person).getMyHealth().decrease(30);
			return Wagon.getMembers().get(person).getName() + " has a case of severe diarrhea.";
		} else {
			return "Your members have just survived a terrible storm.  Nobody got sick.";
		}
	}

	public String getWell(){
		return getWell(random.nextInt(3), random.nextInt(4));
	}

	public String getWell(int wellType, int person){
		if (wellType == 0){
			Wagon.getMembers().get(person).getMyHealth().increase(100);
			return "You have just come into contact with a Shaman.  He heals one of your group members.";
		} else {
			Wagon.getMembers().get(person).getMyHealth().increase(20);
			return "You have just found a healing herb and give it to one of your group members.";
		}
	}

	public String weather() {
		/*
		 * 0 is thunderstorm, 1 is a sandstorm, 2 is hail, 3 is safe
		 */
		return weather(random.nextInt(4));
	}

	public String weather(int weather){
		if (weather ==0){
			getSick();
			return "You have made it through the thunderstorm.  Hopefully all your members are still alive.";
		} else if (weather ==1) {
			//TODO implement when time is ready
			return "You and your members have gotten stuck in a sandstorm and lose 5 days";
		} else if (weather ==2){
			for (int i = 0; i < Wagon.getMembers().size(); i++){
				Wagon.getMembers().get(i).getMyHealth().decrease(30);
			}
			return "You and your members have been struck by hail.";
		} else {
			return "You have made it past a terrible storm but made it through safely.";
		}
	}

	public String oxDead(){
		Oxen ox = new Oxen();
		Wagon.getWagonLoad().items.get(4).decrement();
		return "A snake has bitten one of your oxen and killed it.";
	}

	public String foundItem(){
		int itemType = random.nextInt(5);
		if (itemType == 0){
			int presQuant = Wagon.getWagonLoad().items.get(4).quantity; 
			Wagon.getWagonLoad().items.get(4).setQuantity(presQuant+1);
			return "You have just found an ox in the middle of nowhere!";
		} else if (itemType ==1){
			int numFound = random.nextInt(50);
			Bullets bullets = new Bullets(numFound);
			Wagon.getWagonLoad().add(bullets);
			return "You have just found " + numFound + " bullets!";
		} else if (itemType ==2){
			int numFound = random.nextInt(10);
			Clothes clothes = new Clothes(numFound);
			Wagon.getWagonLoad().add(clothes);
			return "You have found a tribe who has just been attacked by wolves.  You take their clothes and gain " + numFound + " pairs of clothing.";
		} else if (itemType ==3){
			int numFound = random.nextInt(100);
			Food food = new Food(numFound);
			Wagon.getWagonLoad().add(food);
			return "You have stumbled upon " + numFound + " pounds of berries!";
		} else {
			return "You have found an ox, but it ran away before you could control it.";
		}
	}

	public String loseItem(){
		return loseItem(random.nextInt(5), random.nextInt(2));
	}

	public String loseItem(int itemType, int loseType){ //needs work
		Inventory inventory = Wagon.getWagonLoad();
		if (loseType ==0){
			inventory.items.get(itemType).decrement();
			return "Your wagon has went through a huge ditch and you lost some" + inventory.getItems().get(itemType).name + ".";
		} else {
			inventory.items.get(itemType).decrement();
			return "A thief has robbed " + inventory.getItems().get(itemType).name + " during your sleep.";
		}
	}

	public String wagonDamage(){
		int part = random.nextInt(4);
		if (part == 0){
			Wagon.getWagonLoad().items.get(0).decrement();
			return "Your wagon has just went through a massive pothole.  Unfortunately, your axle has broken."; 
		} else if (part == 1){
			Wagon.getWagonLoad().items.get(5).decrement();
			return "Your wagon has just went through a massive pothole.  Unfortunately, your tounge has broken.";
		} else if (part == 2){
			Wagon.getWagonLoad().items.get(6).decrement();
			return "Your wagon has just went through a massive pothole.  Unfortunately, you lose a wheel.";
		} else {
			return "You have just went through a massive pothole.  You are lucky that your wagon's still fine.";
		}
	}

	public String oxStolen(){
		int chance = random.nextInt(8);
		if (chance == 0){			
			if (Wagon.getWagonLoad().getQuantity(4) == 0){
				return "A mischevious bandit was about to rob your oxen but realized you don't have one.";
			} else {
				Wagon.getWagonLoad().items.get(4).decrement();
				return "A mischevious bandit just stole one of your oxen.";
			}
		} else {
			return "You wake up in the middle of the night to a bandit trying to steal your oxen and stop him.";
		}
	}

	public String getEmotional(){
		int chance = random.nextInt(5);
		if (chance ==0){
			return "You start to wonder if this trip is actually worth all the hard work and effort.";
		} else if (chance ==1){
			return "You begin to daydream what Oregon is like.";
		} else if (chance ==2){
			return "You get scared of the thought that you might die at any second.";
		} else if (chance ==3){
			return "You start to cry over the fact that you're still not at Oregon.";
		} else {
			return "You are about to cry but tell yourself that you're not going to cry no matter what.";
		}
	}

	public String newMember(){
		if (Wagon.getMembers().size() < 4){
			Member newMember = new Member("Jorge");
			Wagon.getMembers().add(newMember);
			return "You have just met Jorge, a wandering soul in search of adventure.  He joins your group!  Unfortunately he doesn't have any special skills.";
		} else {
			return "You have just met Jorge, a wandering soul in search of adventure.  He wants to join your group but your party is full at the moment.";
		}
	}
	
	public String tribeEncounter(){
		return tribeEncounter(random.nextInt(3), random.nextInt(4));
	}
	public String tribeEncounter(int type, int person){
		if (type ==0){
			Wagon.getMembers().remove(person);
			return "You have just met a tribe.  They turn out to be cannibals, and you lose " + Wagon.getMembers().get(person) + " to them."; 
		} else if (type ==1){
			Food food = new Food(100);
			Wagon.getWagonLoad().add(food);
			return "You have just met a tribe.  They turn out to be very welcoming and give you 100 pounds of food.";
		} else {
			return "You have just met a tribe.  They turn out to be very friendly but you said an inappropriate joke, so they shun you away.";
		}
	}
}
