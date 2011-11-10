
// TODO: Auto-generated Javadoc
/**
 * The Class River.
 */
public class River extends Location{

	/** The name. */
	private static String name;

	/** The distance. */
	private static int depth, width, distance;

	/**
	 * Instantiates a new river.
	 *
	 * @param name the name
	 * @param depth the depth
	 * @param width the width
	 * @param distance the distance
	 */
	public River(String name, int distance, int depth, int width){
		super(name, distance, null, "river");
		this.depth = depth;
		this.width = width;
	}

	/**
	 * Gets the depth.
	 *
	 * @return the depth
	 */
	public static int getDepth() {
		return depth;
	}

	/**
	 * Sets the depth.
	 *
	 * @param depth the new depth
	 */
	public static void setDepth(int depth) {
		River.depth = depth;
	} 

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public static int getWidth() {
		return width;
	}

	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public static void setWidth(int width) {
		River.width = width;
	}

	public boolean checkFloat(){
		if (depth >= 3){
			if (Math.random() > .75)
				return false;
		} else if (depth >= 6){
			if (Math.random() > .5)
				return false;
		} else if (depth >= 9){
			if (Math.random() > .25)
				return false;
		} 
		return true;
	}

	public boolean checkFerry(){
		return true;
	}
	
	public boolean checkFord(){
		if (depth >= 3){
			return false;
		} else if (Math.random() > .75){
			return false;
		}
		return true;
	}
	
	public boolean disaster(){
		return false;
	}
}
