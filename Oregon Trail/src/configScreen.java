
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class configScreen extends javax.swing.JPanel {

    private ButtonListener listen;
    private GameInterface game;

    /** Creates new form configScreen */
    public configScreen(GameInterface face) {
        initComponents();

        this.game = face;
        listen = new ButtonListener(face);
        begin.addActionListener(listen);

        this.setBackground(Color.yellow);
        banker.setBackground(Color.yellow);
        carpenter.setBackground(Color.yellow);
        farmer.setBackground(Color.yellow);

        leisurely.setBackground(Color.yellow);
        steady.setBackground(Color.yellow);
        grueling.setBackground(Color.yellow);

        barebones.setBackground(Color.yellow);
        meager.setBackground(Color.yellow);
        filling.setBackground(Color.yellow);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        professions = new javax.swing.ButtonGroup();
        pace = new javax.swing.ButtonGroup();
        rations = new javax.swing.ButtonGroup();
        leader = new javax.swing.JLabel();
        leaderName = new javax.swing.JTextField();
        professionText = new javax.swing.JLabel();
        banker = new javax.swing.JRadioButton();
        carpenter = new javax.swing.JRadioButton();
        farmer = new javax.swing.JRadioButton();
        paceText = new javax.swing.JLabel();
        leisurely = new javax.swing.JRadioButton();
        steady = new javax.swing.JRadioButton();
        grueling = new javax.swing.JRadioButton();
        rationText = new javax.swing.JLabel();
        barebones = new javax.swing.JRadioButton();
        meager = new javax.swing.JRadioButton();
        filling = new javax.swing.JRadioButton();
        oregonTrail = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        member1Label = new javax.swing.JLabel();
        member2Labe = new javax.swing.JLabel();
        member3Label = new javax.swing.JLabel();
        member4Label = new javax.swing.JLabel();
        member1 = new javax.swing.JTextField();
        member2 = new javax.swing.JTextField();
        member3 = new javax.swing.JTextField();
        member4 = new javax.swing.JTextField();
        partyMembersLabel = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        begin = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(672, 323));

        leader.setText("Leader Name:");

        professionText.setText("Profession:");

        professions.add(banker);
        banker.setText("Banker");

        professions.add(carpenter);
        carpenter.setText("Carpenter");

        professions.add(farmer);
        farmer.setText("Farmer");

        paceText.setText("Pace:");

        pace.add(leisurely);
        leisurely.setText("Leisurely");

        pace.add(steady);
        steady.setText("Steady");

        pace.add(grueling);
        grueling.setText("Grueling");

        rationText.setText("Rations:");

        rations.add(barebones);
        barebones.setText("Bare Bones");

        rations.add(meager);
        meager.setText("Meager");

        rations.add(filling);
        filling.setText("Filling");

        oregonTrail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oregonTrail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurationScreen/resources/oregon_trail_25 - Copy.gif"))); // NOI18N

        member1Label.setText("Member 1:");

        member2Labe.setText("Member 2:");

        member3Label.setText("Member 3:");

        member4Label.setText("Member 4:");

        partyMembersLabel.setText("Party Members:");

        begin.setText("Begin Journey!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(farmer)
                            .addComponent(carpenter)
                            .addComponent(banker)
                            .addComponent(professionText))
                        .addGap(108, 108, 108))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(leader)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(leaderName))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(member1Label)
                                .addComponent(member2Labe)
                                .addComponent(member3Label)
                                .addComponent(member4Label))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(member4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addComponent(member3)
                                .addComponent(member2)
                                .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(member1)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(partyMembersLabel))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(oregonTrail)
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leisurely)
                            .addComponent(steady)
                            .addComponent(grueling)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paceText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filling)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(begin)
                                .addGap(63, 63, 63))
                            .addComponent(meager)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barebones)
                                    .addComponent(rationText))
                                .addContainerGap(253, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leader)
                            .addComponent(leaderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(partyMembersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(member1Label)
                            .addComponent(member1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(member2Labe)
                            .addComponent(member2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(member3Label)
                            .addComponent(member3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(member4Label)
                            .addComponent(member4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(oregonTrail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(professionText)
                            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                            .addComponent(paceText)
                            .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(banker)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carpenter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(farmer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leisurely)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(steady)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grueling)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rationText)
                        .addComponent(barebones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filling)
                            .addComponent(begin))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton banker;
    private javax.swing.JRadioButton barebones;
    private javax.swing.JButton begin;
    private javax.swing.JRadioButton carpenter;
    private javax.swing.JRadioButton farmer;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JRadioButton filling;
    private javax.swing.JRadioButton grueling;
    private javax.swing.JLabel leader;
    private javax.swing.JTextField leaderName;
    private javax.swing.JRadioButton leisurely;
    private javax.swing.JRadioButton meager;
    private javax.swing.JTextField member1;
    private javax.swing.JLabel member1Label;
    private javax.swing.JTextField member2;
    private javax.swing.JLabel member2Labe;
    private javax.swing.JTextField member3;
    private javax.swing.JLabel member3Label;
    private javax.swing.JTextField member4;
    private javax.swing.JLabel member4Label;
    private javax.swing.JLabel oregonTrail;
    private javax.swing.ButtonGroup pace;
    private javax.swing.JLabel paceText;
    private javax.swing.JLabel partyMembersLabel;
    private javax.swing.JLabel professionText;
    private javax.swing.ButtonGroup professions;
    private javax.swing.JLabel rationText;
    private javax.swing.ButtonGroup rations;
    private javax.swing.JRadioButton steady;
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

    private class ButtonListener implements ActionListener {

        GameInterface game;

        public ButtonListener(GameInterface face) {
            this.game = face;
        }

        public void actionPerformed(ActionEvent event) {

        	boolean changeScreen = true;
        	boolean alreadyError = false;
        	
        	if (alreadyError == true)
        	{}
        	else if (leaderName.getText().equals(""))
        	{
        		JOptionPane.showMessageDialog(game, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
        		changeScreen = false;
        		alreadyError = true;
        	}
        	if (alreadyError == true)
        	{}
        	else if (member1.getText().equals("") || member2.getText().equals("") || member3.getText().equals("") || member4.getText().equals(""))
        	{
        		JOptionPane.showMessageDialog(game, "You must have four other people traveling with you", "Error", JOptionPane.ERROR_MESSAGE);
        		changeScreen = false;
        		alreadyError = true;
        	}
        	if (alreadyError == true)
        	{}
        	else if (getSelection(professions) == (null)){
            	JOptionPane.showMessageDialog(game, "Please select a profession", "Error", JOptionPane.ERROR_MESSAGE);
            	changeScreen = false;
            	alreadyError = true;
            }
            else{
        	String p = getSelection(professions).getText();
            if (p.equals("Banker")) {
                game.setLeader(new Leader(leaderName.getText(), Profession.Banker));
            } else if (p.equals("Carpenter")) {
                game.setLeader(new Leader(leaderName.getText(), Profession.Carpenter));
            } else {
                game.setLeader(new Leader(leaderName.getText(), Profession.Farmer));
            }
            }

            ArrayList<Member> members = new ArrayList<Member>();
            members.add(new Member(member1.getText()));
            members.add(new Member(member2.getText()));
            members.add(new Member(member3.getText()));
            members.add(new Member(member4.getText()));
            game.setMembers(members);

            game.setWagon(new Wagon(game.getLeader(), members));
            
            if (alreadyError == true)
        	{}
            else if (getSelection(pace) == (null)){
            	JOptionPane.showMessageDialog(game, "Please select a pace", "Error", JOptionPane.ERROR_MESSAGE);
            	changeScreen = false;
            	alreadyError = true;
            }
            else{
            
            String pa = getSelection(pace).getText();
            if (pa.equals("Leisurely")) {
                game.getWagon().setCurrPace(Pace.Leisurely);
            } else if (pa.equals("Steady")) {
                game.getWagon().setCurrPace(Pace.Steady);
            } else {
                game.getWagon().setCurrPace(Pace.Grueling);
            }
            }
            if (alreadyError == true)
        	{}
            else if (getSelection(rations) == (null)){
            	JOptionPane.showMessageDialog(game, "Please select a rations", "Error", JOptionPane.ERROR_MESSAGE);
            	changeScreen = false;
            	alreadyError = true;
            }
            else{
            
            String r = getSelection(rations).getText();
            if (r.equals("Bare Bones")) {
                game.getWagon().setCurrRations(Rations.BareBones);
            } else if (r.equals("Meager")) {
                game.getWagon().setCurrRations(Rations.Meager);
            } else {
                game.getWagon().setCurrRations(Rations.Filling);
            }
            }
            
            if (changeScreen == true)
            {
            Shop shop = new Shop(game.getWagon().getLeader(), game.getWagon());
            JPanel panel = new generalStore(shop, game);
            panel.setSize(new Dimension(450, 300));
            game.updateBounds(panel.getWidth(), panel.getHeight());
            game.changeDisplay(panel);
            }
        }
    }
}
