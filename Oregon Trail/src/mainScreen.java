
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

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

        javax.swing.GroupLayout mapLayout = new javax.swing.GroupLayout(map);
        map.setLayout(mapLayout);
        mapLayout.setHorizontalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        mapLayout.setVerticalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        moneyText.setText("Money:");

        money.setText("0");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(distanceText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distanceTraveled, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foodText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentFood, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(moneyText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grueling)
                            .addComponent(steady)
                            .addComponent(leisurely)
                            .addComponent(paceText)
                            .addComponent(filling)
                            .addComponent(meager)
                            .addComponent(rationText)
                            .addComponent(barebones))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(takeTurn)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rationText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barebones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filling)
                        .addGap(18, 18, 18)
                        .addComponent(paceText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leisurely)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(steady)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grueling)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(distanceText)
                            .addComponent(distanceTraveled))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodText)
                            .addComponent(currentFood))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moneyText)
                            .addComponent(money))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(takeTurn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
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
