
/**
 * The Class Health, which represents the Health of a Person.
 *
 * @author Four Guys and a Mann
 * @version v1 10/10/11
 */
public class Health {
	
	/** The health. */
	private int health;
	
	/**
	 * Instantiates a new health object.
	 *
	 * @param initialHealth the initial health
	 */
	public Health(int initialHealth) {
		initialHealth = checkPercent(initialHealth);
		
		health = initialHealth;
	}
	
	/**
	 * Instantiates a new health object.
	 */
	public Health() {
		this(100);
	}
	
	/**
	 * Checks percent values to ensure they're between 0 and 100.
	 *
	 * @param a potential percent value
	 * @return the corrected percent (between 0 and 100)
	 */
	private int checkPercent(int percent) {
		if (percent > 100)
			percent = 100;
		if (percent < 0)
			percent = 0;
		
		return percent;
	}
	
	/**
	 * Increases health by a parameter
	 *
	 * @param incBy how much to increase health by
	 */
	public void increase(int incBy) {
		int tempHealth = health;
		tempHealth += incBy;
		health = checkPercent(tempHealth);
	}
	
	/**
	 * Increases health.
	 */
	public void increase() {
		increase(15);
	}
	
	/**
	 * Decreases health by a parameter
	 *
	 * @param decBy how much to decrease health by
	 */
	public void decrease(int decBy) {
		int tempHealth = health;
		tempHealth -= decBy;
		health = checkPercent(tempHealth);
	}
	
	/**
	 * Decreases health.
	 */
	public void decrease() {
		decrease(15);
	}
	
	/**
	 * Returns the string representation of health
	 * @return Health String (Excellent, Fair, Poor)
	 * 
	 */
	public String toString() {
		String toReturn = "";
		
		if (health <= 33) 
			toReturn = "Poor";
		else if (health <= 66)
			toReturn = "Fair";
		else if (health <= 100)
			toReturn = "Excellent";
		
		return toReturn;
	}
	
	/**
	 * Gets the health.
	 *
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * Checks if the person is alive.
	 *
	 * @return true, if is alive
	 */
	public boolean isAlive() {
		if (health > 0)
			return true;
		else
			return false;
	}
	
}
