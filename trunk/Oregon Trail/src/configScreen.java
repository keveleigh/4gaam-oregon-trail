
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * configScreen.java
 *
 * Created on Nov 21, 2011, 10:45:04 PM
 */
/**
 *
 * @author Thomas
 */
public class configScreen extends javax.swing.JPanel {

    /** Creates new form configScreen */
    public configScreen(GameInterface face) {
        initComponents();

        begin.addActionListener(new ButtonListener(face));
        load.addActionListener(new LoadListener(face));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profession = new javax.swing.ButtonGroup();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        member1 = new javax.swing.JTextField();
        member3 = new javax.swing.JTextField();
        partyMembersLabel = new javax.swing.JLabel();
        banker = new javax.swing.JRadioButton();
        leaderName = new javax.swing.JTextField();
        leader = new javax.swing.JLabel();
        member2 = new javax.swing.JTextField();
        professionText1 = new javax.swing.JLabel();
        farmer = new javax.swing.JRadioButton();
        begin = new javax.swing.JToggleButton();
        carpenter = new javax.swing.JRadioButton();
        member4 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        load = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 407));

        member1.setBounds(210, 150, 120, 20);
        jLayeredPane2.add(member1, javax.swing.JLayeredPane.PALETTE_LAYER);
        member3.setBounds(210, 210, 120, 20);
        jLayeredPane2.add(member3, javax.swing.JLayeredPane.PALETTE_LAYER);

        partyMembersLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
        partyMembersLabel.setForeground(new java.awt.Color(255, 255, 255));
        partyMembersLabel.setText("Party Members:");
        partyMembersLabel.setBounds(120, 150, 90, 17);
        jLayeredPane2.add(partyMembersLabel, javax.swing.JLayeredPane.PALETTE_LAYER);

        profession.add(banker);
        banker.setFont(new java.awt.Font("Times New Roman", 0, 14));
        banker.setForeground(new java.awt.Color(255, 255, 255));
        banker.setText("Banker");
        banker.setOpaque(false);
        banker.setBounds(460, 150, 120, 25);
        jLayeredPane2.add(banker, javax.swing.JLayeredPane.PALETTE_LAYER);
        leaderName.setBounds(210, 110, 120, 20);
        jLayeredPane2.add(leaderName, javax.swing.JLayeredPane.PALETTE_LAYER);

        leader.setFont(new java.awt.Font("Times New Roman", 0, 14));
        leader.setForeground(new java.awt.Color(255, 255, 255));
        leader.setText("Leader Name:");
        leader.setBounds(130, 110, 80, 17);
        jLayeredPane2.add(leader, javax.swing.JLayeredPane.PALETTE_LAYER);
        member2.setBounds(210, 180, 120, 20);
        jLayeredPane2.add(member2, javax.swing.JLayeredPane.PALETTE_LAYER);

        professionText1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        professionText1.setForeground(new java.awt.Color(255, 255, 255));
        professionText1.setText("Profession:");
        professionText1.setBounds(390, 110, 70, 17);
        jLayeredPane2.add(professionText1, javax.swing.JLayeredPane.PALETTE_LAYER);

        profession.add(farmer);
        farmer.setFont(new java.awt.Font("Times New Roman", 0, 14));
        farmer.setForeground(new java.awt.Color(255, 255, 255));
        farmer.setText("Farmer");
        farmer.setOpaque(false);
        farmer.setBounds(460, 130, 120, 23);
        jLayeredPane2.add(farmer, javax.swing.JLayeredPane.PALETTE_LAYER);

        begin.setText("Begin Journey!");
        begin.setBounds(450, 360, 130, 23);
        jLayeredPane2.add(begin, javax.swing.JLayeredPane.PALETTE_LAYER);

        profession.add(carpenter);
        carpenter.setFont(new java.awt.Font("Times New Roman", 0, 14));
        carpenter.setForeground(new java.awt.Color(255, 255, 255));
        carpenter.setText("Carpenter");
        carpenter.setOpaque(false);
        carpenter.setBounds(460, 110, 110, 25);
        jLayeredPane2.add(carpenter, javax.swing.JLayeredPane.PALETTE_LAYER);
        member4.setBounds(210, 240, 120, 20);
        jLayeredPane2.add(member4, javax.swing.JLayeredPane.PALETTE_LAYER);

        background.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurationScreen/resources/OregonTrailPainting.jpg"))); // NOI18N
        background.setBounds(0, 0, 600, 400);
        jLayeredPane2.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        load.setText("Load");
        load.setBounds(10, 360, 100, 23);
        jLayeredPane2.add(load, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JRadioButton banker;
    private javax.swing.JToggleButton begin;
    private javax.swing.JRadioButton carpenter;
    private javax.swing.JRadioButton farmer;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel leader;
    private javax.swing.JTextField leaderName;
    private javax.swing.JButton load;
    private javax.swing.JTextField member1;
    private javax.swing.JTextField member2;
    private javax.swing.JTextField member3;
    private javax.swing.JTextField member4;
    private javax.swing.JLabel partyMembersLabel;
    private javax.swing.ButtonGroup profession;
    private javax.swing.JLabel professionText1;
    // End of variables declaration//GEN-END:variables

    public static JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e = group.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }

    private class ButtonListener implements ActionListener {

        GameInterface game;
        Wagon wagon;
        Leader leader;

        public ButtonListener(GameInterface face) {
            this.game = face;
        }

        public void actionPerformed(ActionEvent event) {

            boolean changeScreen = true;
            boolean alreadyError = false;

            if (alreadyError == true) {
            } else if (leaderName.getText().equals("")) {
                JOptionPane.showMessageDialog(game, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
                changeScreen = false;
                alreadyError = true;
            }
            if (alreadyError == true) {
            } else if (member1.getText().equals("") || member2.getText().equals("") || member3.getText().equals("") || member4.getText().equals("")) {
                JOptionPane.showMessageDialog(game, "You must have four other people traveling with you", "Error", JOptionPane.ERROR_MESSAGE);
                changeScreen = false;
                alreadyError = true;
            }
            if (alreadyError == true) {
            } else if (getSelection(profession) == (null)) {
                JOptionPane.showMessageDialog(game, "Please select a profession", "Error", JOptionPane.ERROR_MESSAGE);
                changeScreen = false;
                alreadyError = true;
            } else {
                String p = getSelection(profession).getText();
                if (p.equals("Banker")) {
                    leader = new Leader(leaderName.getText(), Profession.Banker);
                } else if (p.equals("Carpenter")) {
                    leader = new Leader(leaderName.getText(), Profession.Carpenter);
                } else {
                    leader = new Leader(leaderName.getText(), Profession.Farmer);
                }
            }

            ArrayList<Member> members = new ArrayList<Member>();
            members.add(new Member(member1.getText()));
            members.add(new Member(member2.getText()));
            members.add(new Member(member3.getText()));
            members.add(new Member(member4.getText()));
            wagon = new Wagon(leader, members);

            wagon.setCurrPace(Pace.Steady);
            wagon.setCurrRations(Rations.Meager);
            
            game.setWagon(wagon);
            game.setMap(new Map(wagon));

            if (changeScreen == true) {
                Shop shop = new Shop();
                JPanel panel = new generalStore(shop, game);
                panel.setSize(new Dimension(450, 300));
                game.updateBounds(panel.getWidth(), panel.getHeight());
                game.changeDisplay(panel);
            }
        }
    }

    private class LoadListener implements ActionListener {

        GameInterface game;
        Wagon wagon;
        Leader leader;

        public LoadListener(GameInterface face) {
            this.game = face;
        }

        public void actionPerformed(ActionEvent e) {
            String[] data = new String[17];

            try {
                FileInputStream fstream = new FileInputStream("OregonTrailSave.txt");
                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine;

                int i = 0;
                while ((strLine = br.readLine()) != null) {
                    data[i] = strLine;
                    i++;
                }

                in.close();
            } catch (Exception d) {
                System.err.println("Error: " + d.getMessage());
            }

            Leader leader;

            String pace = data[0];
            String ration = data[1];
            String leaderName = data[2];
            String profession = data[3];
            int money = Integer.parseInt(data[4]);

            String member1 = data[5];
            String member2 = data[6];
            String member3 = data[7];
            String member4 = data[8];

            int distanceMoved = Integer.parseInt(data[9]);
            
            Axle axle = new Axle(Integer.parseInt(data[10]));
            Bullets bullets = new Bullets(Integer.parseInt(data[11]));
            Clothes clothes = new Clothes(Integer.parseInt(data[12]));
            Food food = new Food(Integer.parseInt(data[13]));
            Oxen oxen = new Oxen(Integer.parseInt(data[14]));
            Tongue tongue = new Tongue(Integer.parseInt(data[15]));
            Wheels wheels = new Wheels(Integer.parseInt(data[16]));
            
            Inventory inv = new Inventory();
            inv.add(axle);
            inv.add(bullets);
            inv.add(clothes);
            inv.add(food);
            inv.add(oxen);
            inv.add(tongue);
            inv.add(wheels);
            
            String p = profession;
            if (p.equals("Banker")) {
                leader = new Leader(leaderName, Profession.Banker);
            } else if (p.equals("Carpenter")) {
                leader = new Leader(leaderName, Profession.Carpenter);
            } else {
                leader = new Leader(leaderName, Profession.Farmer);
            }
            
            leader.setMoney(money);
            
            ArrayList<Member> members = new ArrayList<Member>();
            members.add(new Member(member1));
            members.add(new Member(member2));
            members.add(new Member(member3));
            members.add(new Member(member4));
            
            wagon = new Wagon(leader, members);
            wagon.setWagonLoad(inv);
            
            p = pace;
            if (p.equals("Leisurely")) {
                wagon.setCurrPace(Pace.Leisurely);
            } else if (p.equals("Steady")) {
                wagon.setCurrPace(Pace.Steady);
            } else {
                wagon.setCurrPace(Pace.Grueling);
            }
            
            p = ration;
            if (p.equals("BareBones")) {
                wagon.setCurrRations(Rations.BareBones);
            } else if (p.equals("Meager")) {
                wagon.setCurrRations(Rations.Meager);
            } else {
                wagon.setCurrRations(Rations.Filling);
            }
            
            Map map = new Map(wagon);
            map.setDistanceMoved(distanceMoved);
            
            game.setWagon(wagon);
            game.setMap(map);
            
            JPanel panel = new mainScreen(game);
            panel.setSize(new Dimension(679, 410));
            game.changeDisplay(panel);
        }
    }
}