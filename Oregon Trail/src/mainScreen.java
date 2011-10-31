
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class mainScreen extends javax.swing.JPanel {

    private GameInterface game;
    private Leader leader;
    private Wagon wagon;
    private Pace currPace;
    private Rations currRation;
    private Turn turn;
    private Inventory wagonLoad;
    private TurnListener listen;

    public mainScreen(GameInterface face) {
        initComponents();
        setBackground(Color.yellow);
        barebones.setBackground(Color.yellow);
        meager.setBackground(Color.yellow);
        filling.setBackground(Color.yellow);
        leisurely.setBackground(Color.yellow);
        steady.setBackground(Color.yellow);
        grueling.setBackground(Color.yellow);


        game = face;
        leader = game.getLeader();
        wagon = game.getWagon();
        wagonLoad = wagon.getWagonLoad();
        currPace = wagon.getCurrPace();
        currRation = wagon.getCurrRations();
        turn = new Turn(wagon);
        listen = new TurnListener();

        takeTurn.addActionListener(listen);

        if (currPace == Pace.Leisurely) {
            leisurely.setSelected(true);
        } else if (currPace == Pace.Steady) {
            steady.setSelected(true);
        } else {
            grueling.setSelected(true);
        }

        if (currRation == Rations.BareBones) {
            barebones.setSelected(true);
        } else if (currRation == Rations.Meager) {
            meager.setSelected(true);
        } else {
            filling.setSelected(true);
        }

        currentFood.setText(Integer.toString(wagonLoad.getQuantity(3)));
        money.setText(Integer.toString(leader.getMoney()));

        map.setBackground(Color.BLACK);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rations = new javax.swing.ButtonGroup();
        pace = new javax.swing.ButtonGroup();
        distanceText = new javax.swing.JLabel();
        foodText = new javax.swing.JLabel();
        distanceTraveled = new javax.swing.JLabel();
        currentFood = new javax.swing.JLabel();
        rationText = new javax.swing.JLabel();
        barebones = new javax.swing.JRadioButton();
        meager = new javax.swing.JRadioButton();
        filling = new javax.swing.JRadioButton();
        paceText = new javax.swing.JLabel();
        leisurely = new javax.swing.JRadioButton();
        steady = new javax.swing.JRadioButton();
        grueling = new javax.swing.JRadioButton();
        takeTurn = new javax.swing.JButton();
        map = new javax.swing.JPanel();
        moneyText = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        distanceText.setText("Distance Traveled:");

        foodText.setText("Current Food:");

        distanceTraveled.setText("0");

        currentFood.setText("0");

        rationText.setText("Rations:");

        rations.add(barebones);
        barebones.setText("Bare Bones");

        rations.add(meager);
        meager.setText("Meager");

        rations.add(filling);
        filling.setText("Filling");

        paceText.setText("Pace:");

        pace.add(leisurely);
        leisurely.setText("Leisurely");

        pace.add(steady);
        steady.setText("Steady");

        pace.add(grueling);
        grueling.setText("Grueling");

        takeTurn.setText("Take Turn");

        javax.swing.GroupLayout gl_map = new javax.swing.GroupLayout(map);
        map.setLayout(gl_map);
        gl_map.setHorizontalGroup(
            gl_map.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        gl_map.setVerticalGroup(
            gl_map.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        moneyText.setText("Money:");

        money.setText("0");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        
        JLabel lastLocationText = new JLabel("Last Location:");
        
        JLabel lastLocation = new JLabel("Independence, MO");
        
        JLabel distanceToNextText = new JLabel("Distance to Next Location:");
        
        JLabel distanceToNext = new JLabel("000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(distanceText)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(distanceTraveled, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(foodText)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(currentFood, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(moneyText)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(money, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        				.addComponent(distanceToNextText)
        				.addComponent(lastLocationText)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(lastLocation)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(distanceToNext)
        			.addGap(19)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(map, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(grueling)
        						.addComponent(steady)
        						.addComponent(leisurely)
        						.addComponent(paceText)
        						.addComponent(filling)
        						.addComponent(meager)
        						.addComponent(rationText)
        						.addComponent(barebones))
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(takeTurn)
        					.addGap(24))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(map, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(rationText)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(barebones)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(meager)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(filling)
        							.addGap(18)
        							.addComponent(paceText)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(leisurely)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(steady)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(grueling)))
        					.addGap(18))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lastLocationText)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lastLocation)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(distanceToNextText)
        						.addComponent(distanceToNext))
        					.addGap(6)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(distanceText)
        						.addComponent(distanceTraveled))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(foodText)
        						.addComponent(currentFood))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(moneyText)
        						.addComponent(money))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(takeTurn))
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton barebones;
    private javax.swing.JLabel currentFood;
    private javax.swing.JLabel distanceText;
    private javax.swing.JLabel distanceTraveled;
    private javax.swing.JRadioButton filling;
    private javax.swing.JLabel foodText;
    private javax.swing.JRadioButton grueling;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton leisurely;
    private javax.swing.JPanel map;
    private javax.swing.JRadioButton meager;
    private javax.swing.JLabel money;
    private javax.swing.JLabel moneyText;
    private javax.swing.ButtonGroup pace;
    private javax.swing.JLabel paceText;
    private javax.swing.JLabel rationText;
    private javax.swing.ButtonGroup rations;
    private javax.swing.JRadioButton steady;
    private javax.swing.JButton takeTurn;
    // End of variables declaration//GEN-END:variables

    // This method returns the selected radio button in a button group
    public static JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e = group.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }

    private class TurnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String p = getSelection(pace).getText();
            if (p.equals("Leisurely")) {
                wagon.setCurrPace(Pace.Leisurely);
            } else if (p.equals("Steady")) {
                wagon.setCurrPace(Pace.Steady);
            } else {
                wagon.setCurrPace(Pace.Grueling);
            }

            p = getSelection(rations).getText();
            if (p.equals("Bare Bones")) {
                wagon.setCurrRations(Rations.BareBones);
            } else if (p.equals("Meager")) {
                wagon.setCurrRations(Rations.Meager);
            } else {
                wagon.setCurrRations(Rations.Filling);
            }

            money.setText(Integer.toString(leader.getMoney()));

            turn.takeTurn();
            currentFood.setText(Integer.toString(turn.getCurrentFood()));
            distanceTraveled.setText(Integer.toString(turn.getDistanceMoved()));
        }
    }
}
