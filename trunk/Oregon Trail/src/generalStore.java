
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * The Class generalStore, which displays the store.
 * This screen allows the user to purchase items from a store.
 * 
 * @author Four Guys and a Mann
 * @version v0.6 10/20/11
 */
public class generalStore extends JPanel {

    private int cartCost = 0;
    private int cartWeight = 0;
    private JTextField axleBuy;
    private JTextField bulletsBuy;
    private JTextField clothesBuy;
    private JTextField foodBuy;
    private JTextField oxenBuy;
    private JTextField tongueBuy;
    private JTextField wheelsBuy;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    Axle a = new Axle();
    Bullets b = new Bullets();
    Clothes c = new Clothes();
    Food f = new Food();
    Oxen o = new Oxen();
    Tongue t = new Tongue();
    Wheels w = new Wheels();
    Shop myShop;
    Inventory inventory;
    Leader lead;
    GameInterface game;

    /**
     * Create the panel.
     */
    public generalStore(Shop shop, GameInterface game) {
        myShop = shop;
        inventory = shop.playerWagon.getWagonLoad();
        lead = shop.myLeader;
        this.game = game;

        setLayout(null);
        setBounds(100, 100, 450, 300);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(null);
        setBackground(Color.yellow);
        
        JLabel lblNewLabel = new JLabel("General Store");
        lblNewLabel.setBounds(5, 5, 432, 14);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblNewLabel);

        axleBuy = new JTextField();
        axleBuy.setBounds(10, 52, 43, 20);
        add(axleBuy);
        axleBuy.setColumns(10);

        bulletsBuy = new JTextField();
        bulletsBuy.setBounds(10, 73, 43, 20);
        add(bulletsBuy);
        bulletsBuy.setColumns(10);

        clothesBuy = new JTextField();
        clothesBuy.setColumns(10);
        clothesBuy.setBounds(10, 94, 43, 20);
        add(clothesBuy);

        foodBuy = new JTextField();
        foodBuy.setBounds(10, 115, 43, 20);
        add(foodBuy);
        foodBuy.setColumns(10);

        oxenBuy = new JTextField();
        oxenBuy.setBounds(10, 136, 43, 20);
        add(oxenBuy);
        oxenBuy.setColumns(10);

        tongueBuy = new JTextField();
        tongueBuy.setColumns(10);
        tongueBuy.setBounds(10, 157, 43, 20);
        add(tongueBuy);

        wheelsBuy = new JTextField();
        wheelsBuy.setColumns(10);
        wheelsBuy.setBounds(10, 178, 43, 20);
        add(wheelsBuy);

        JLabel lblAxles = new JLabel("Axles");
        lblAxles.setBounds(63, 58, 46, 14);
        add(lblAxles);

        JLabel lblBullets = new JLabel("Bullets");
        lblBullets.setBounds(63, 79, 46, 14);
        add(lblBullets);

        JLabel lblClothes = new JLabel("Clothes");
        lblClothes.setBounds(63, 100, 46, 14);
        add(lblClothes);

        JLabel lblFood = new JLabel("Food");
        lblFood.setBounds(63, 121, 46, 14);
        add(lblFood);

        JLabel lblOxen = new JLabel("Oxen");
        lblOxen.setBounds(63, 142, 46, 14);
        add(lblOxen);

        JLabel lblTongues = new JLabel("Tongues");
        lblTongues.setBounds(63, 163, 57, 14);
        add(lblTongues);

        JLabel lblWheels = new JLabel("Wheels");
        lblWheels.setBounds(63, 184, 46, 14);
        add(lblWheels);

        JLabel lblNewLabel_8 = new JLabel("Have:");
        lblNewLabel_8.setBounds(200, 58, 46, 14);
        add(lblNewLabel_8);

        JLabel label = new JLabel("Have:");
        label.setBounds(200, 79, 46, 14);
        add(label);

        JLabel label_1 = new JLabel("Have:");
        label_1.setBounds(200, 100, 46, 14);
        add(label_1);

        JLabel label_2 = new JLabel("Have:");
        label_2.setBounds(200, 121, 46, 14);
        add(label_2);

        JLabel label_3 = new JLabel("Have:");
        label_3.setBounds(200, 142, 46, 14);
        add(label_3);

        JLabel label_4 = new JLabel("Have:");
        label_4.setBounds(200, 163, 46, 14);
        add(label_4);

        JLabel label_5 = new JLabel("Have:");
        label_5.setBounds(200, 184, 46, 14);
        add(label_5);

        JLabel lblNewLabel_9 = new JLabel(Integer.toString(inventory.getQuantity(0)));
        lblNewLabel_9.setBounds(240, 58, 46, 14);
        add(lblNewLabel_9);

        JLabel label_6 = new JLabel(Integer.toString(inventory.getQuantity(1)));
        label_6.setBounds(240, 79, 46, 14);
        add(label_6);

        JLabel label_7 = new JLabel(Integer.toString(inventory.getQuantity(2)));
        label_7.setBounds(240, 100, 46, 14);
        add(label_7);

        JLabel label_8 = new JLabel(Integer.toString(inventory.getQuantity(3)));
        label_8.setBounds(240, 121, 46, 14);
        add(label_8);

        JLabel label_9 = new JLabel(Integer.toString(inventory.getQuantity(4)));
        label_9.setBounds(240, 142, 46, 14);
        add(label_9);

        JLabel label_10 = new JLabel(Integer.toString(inventory.getQuantity(5)));
        label_10.setBounds(240, 163, 46, 14);
        add(label_10);

        JLabel label_11 = new JLabel(Integer.toString(inventory.getQuantity(6)));
        label_11.setBounds(240, 184, 46, 14);
        add(label_11);

        JLabel lblPrice = new JLabel("Price:");
        lblPrice.setBounds(119, 58, 34, 14);
        add(lblPrice);

        JLabel label_12 = new JLabel("Price:");
        label_12.setBounds(119, 79, 34, 14);
        add(label_12);

        JLabel label_13 = new JLabel("Price:");
        label_13.setBounds(119, 100, 34, 14);
        add(label_13);

        JLabel label_14 = new JLabel("Price:");
        label_14.setBounds(119, 121, 34, 14);
        add(label_14);

        JLabel label_15 = new JLabel("Price:");
        label_15.setBounds(119, 142, 34, 14);
        add(label_15);

        JLabel label_16 = new JLabel("Price:");
        label_16.setBounds(119, 163, 34, 14);
        add(label_16);

        JLabel label_17 = new JLabel("Price:");
        label_17.setBounds(119, 184, 34, 14);
        add(label_17);

        JLabel lblNewLabel_1 = new JLabel(Integer.toString(a.price));
        lblNewLabel_1.setBounds(154, 58, 46, 14);
        add(lblNewLabel_1);

        JLabel label_18 = new JLabel(Integer.toString(b.price));
        label_18.setBounds(154, 79, 46, 14);
        add(label_18);

        JLabel label_19 = new JLabel(Integer.toString(c.price));
        label_19.setBounds(154, 100, 46, 14);
        add(label_19);

        JLabel label_20 = new JLabel(Integer.toString(f.price));
        label_20.setBounds(154, 121, 46, 14);
        add(label_20);

        JLabel label_21 = new JLabel(Integer.toString(o.price));
        label_21.setBounds(154, 142, 46, 14);
        add(label_21);

        JLabel label_22 = new JLabel(Integer.toString(t.price));
        label_22.setBounds(154, 163, 46, 14);
        add(label_22);

        JLabel label_23 = new JLabel(Integer.toString(w.price));
        label_23.setBounds(154, 184, 46, 14);
        add(label_23);

        JLabel lblCurrentCost = new JLabel("Current Cost:");
        lblCurrentCost.setBounds(60, 219, 77, 14);
        add(lblCurrentCost);

        JLabel lblMoney = new JLabel("Money:");
        lblMoney.setBounds(93, 235, 46, 14);
        add(lblMoney);

        lblNewLabel_2 = new JLabel(Integer.toString(cartCost));
        lblNewLabel_2.setBounds(139, 219, 46, 14);
        add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel(Integer.toString(lead.money));
        lblNewLabel_3.setBounds(139, 235, 46, 14);
        add(lblNewLabel_3);

        JLabel lblCurrentWeight = new JLabel("Current Weight:");
        lblCurrentWeight.setBounds(203, 219, 97, 14);
        add(lblCurrentWeight);

        JLabel lblAvailableWeight = new JLabel("Free Space:");
        lblAvailableWeight.setBounds(223, 235, 77, 14);
        add(lblAvailableWeight);

        lblNewLabel_4 = new JLabel(Integer.toString(cartWeight));
        lblNewLabel_4.setBounds(300, 219, 46, 14);
        add(lblNewLabel_4);

        lblNewLabel_5 = new JLabel(Integer.toString(inventory.MAX_WEIGHT - inventory.currentWeight));
        lblNewLabel_5.setBounds(300, 235, 46, 14);
        add(lblNewLabel_5);

        JButton btnUpdateCart = new JButton("Update Cart");
        btnUpdateCart.setBounds(315, 94, 117, 23);
        btnUpdateCart.addActionListener(new updateButtonListener());
        add(btnUpdateCart);

        JButton btnBuyItems = new JButton("Buy Items");
        btnBuyItems.setBounds(315, 126, 117, 23);
        btnBuyItems.addActionListener(new buyButtonListener());
        add(btnBuyItems);

        JButton btnLeaveStore = new JButton("Leave Store");
        btnLeaveStore.setBounds(315, 157, 117, 23);
        btnLeaveStore.addActionListener(new leaveButtonListener());
        add(btnLeaveStore);

        JLabel lblWelcome = new JLabel("Welcome");
        lblWelcome.setBounds(166, 22, 66, 14);
        add(lblWelcome);

        JLabel lblNewLabel_6 = new JLabel(shop.myLeader.getName());
        lblNewLabel_6.setBounds(227, 22, 123, 14);
        add(lblNewLabel_6);
    }

    /**
     * Allows the user to check the price and weight of their chosen items
     * The information is updated and displayed on the storefront.
     */
    private class updateButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            try {
                Integer.parseInt(axleBuy.getText());
            } catch (NumberFormatException e) {
                axleBuy.setText("0");
            }
            try {
                Integer.parseInt(bulletsBuy.getText());
            } catch (NumberFormatException e) {
                bulletsBuy.setText("0");
            }
            try {
                Integer.parseInt(clothesBuy.getText());
            } catch (NumberFormatException e) {
                clothesBuy.setText("0");
            }
            try {
                Integer.parseInt(foodBuy.getText());
            } catch (NumberFormatException e) {
                foodBuy.setText("0");
            }
            try {
                Integer.parseInt(oxenBuy.getText());
            } catch (NumberFormatException e) {
                oxenBuy.setText("0");
            }
            try {
                Integer.parseInt(tongueBuy.getText());
            } catch (NumberFormatException e) {
                tongueBuy.setText("0");
            }
            try {
                Integer.parseInt(wheelsBuy.getText());
            } catch (NumberFormatException e) {
                wheelsBuy.setText("0");
            }
            cartWeight = Integer.parseInt(axleBuy.getText()) * a.weight + Integer.parseInt(bulletsBuy.getText()) * b.weight + Integer.parseInt(clothesBuy.getText()) * c.weight + Integer.parseInt(foodBuy.getText()) * f.weight + Integer.parseInt(oxenBuy.getText()) * o.weight + Integer.parseInt(tongueBuy.getText()) * t.weight + Integer.parseInt(wheelsBuy.getText()) * w.weight;
            cartCost = Integer.parseInt(axleBuy.getText()) * a.price + Integer.parseInt(bulletsBuy.getText()) * b.price + Integer.parseInt(clothesBuy.getText()) * c.price + Integer.parseInt(foodBuy.getText()) * f.price + Integer.parseInt(oxenBuy.getText()) * o.price + Integer.parseInt(tongueBuy.getText()) * t.price + Integer.parseInt(wheelsBuy.getText()) * w.price;
            lblNewLabel_2.setText(Integer.toString(cartCost));
            lblNewLabel_4.setText(Integer.toString(cartWeight));
        }
    }

    /**
     * Allows the user to buy items from the store.
     * This updates the user's inventory and money, and updates the storefront.
     */
    private class buyButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            try {
                int num = Integer.parseInt(axleBuy.getText());
                if (num > 0) {
                    myShop.buy(new Axle(num));
                }
            } catch (NumberFormatException e) {
                axleBuy.setText("0");
            }
            try {
                int num = Integer.parseInt(bulletsBuy.getText());
                if (num > 0) {
                    myShop.buy(new Bullets(num));
                }
            } catch (NumberFormatException e) {
                bulletsBuy.setText("0");
            }
            try {
                int num = Integer.parseInt(clothesBuy.getText());
                if (num > 0) {
                    myShop.buy(new Clothes(num));
                }
            } catch (NumberFormatException e) {
                clothesBuy.setText("0");
            }
            try {
                int num = Integer.parseInt(foodBuy.getText());
                if (num > 0) {
                    myShop.buy(new Food(num));
                }
            } catch (NumberFormatException e) {
                foodBuy.setText("0");
            }
            try {
                int num = Integer.parseInt(oxenBuy.getText());
                if (num > 0) {
                    myShop.buy(new Oxen(num));
                }
            } catch (NumberFormatException e) {
                oxenBuy.setText("0");
            }
            try {
                int num = Integer.parseInt(tongueBuy.getText());
                if (num > 0) {
                    myShop.buy(new Tongue(num));
                }
            } catch (NumberFormatException e) {
                tongueBuy.setText("0");
            }
            try {
                int num = Integer.parseInt(wheelsBuy.getText());
                if (num > 0) {
                    myShop.buy(new Wheels(num));
                }
            } catch (NumberFormatException e) {
                wheelsBuy.setText("0");
            }
            lblNewLabel_3.setText(Integer.toString(lead.money));
            lblNewLabel_5.setText(Integer.toString(inventory.MAX_WEIGHT - inventory.currentWeight));
        }
    }

    /**
     * Allows the user to leave the store. Currently, this quits the program. 
     * Upon further development, this will allow the user to enter the town.
     */
    private class leaveButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JPanel panel = new mainScreen(game);
            panel.setSize(new Dimension(672, 323));
            game.updateBounds(panel.getWidth(), panel.getHeight());
            game.changeDisplay(panel);
        }
    }
}
