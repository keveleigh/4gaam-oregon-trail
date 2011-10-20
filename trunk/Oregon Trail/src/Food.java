
/**
 * The Class Food.
 */
public class Food extends Item {

    /**
     * Instantiates a new food.
     */
    public Food() {
        price = 1;
        quantity = 0;
        name = "Food";
        weight = 1;
    }

    public Food(int quan) {
        price = 1;
        quantity = quan;
        name = "Food";
        weight = 1;
    }

    /* (non-Javadoc)
     * @see Item#use()
     */
    @Override
    public void use() {
        // Check to make sure quantity is greater than 0
        if (quantity > 0) {

            // Decrease quantity
            decrement();
        }
    }
}
