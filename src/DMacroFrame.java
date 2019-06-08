import javax.swing.*;  

public class DMacroFrame {
    public JButton b1;
    public JCheckBox keyOne, keyTwo, keyThree, keyFour;
    public JSpinner tfOne, tfTwo, tfThree, tfFour;
        public DMacroFrame(){
        JFrame f = new JFrame("Key Smasher");
        JLabel delay = new JLabel("Delay in Milliseconds");
        delay.setBounds(200, 50, 150, 25);
        
        //Keypress Checkboxes & Spinners
        keyOne = new JCheckBox("Key One");
        keyOne.setBounds(100, 100, 100, 25);
        tfOne = new JSpinner();
        tfOne.setValue(150);
        tfOne.setBounds(200, 100, 125, 25);
        
        keyTwo = new JCheckBox("Key Two");
        keyTwo.setBounds(100, 150, 100, 25);
        tfTwo = new JSpinner();
        tfTwo.setValue(150);
        tfTwo.setBounds(200, 150, 125, 25);
        
        keyThree = new JCheckBox("Key Three");
        keyThree.setBounds(100, 200, 100, 25);
        tfThree = new JSpinner();
        tfThree.setValue(150);
        tfThree.setBounds(200, 200, 125, 25);
        
        keyFour = new JCheckBox("Key Four");
        keyFour.setBounds(100, 250, 100, 25);
        tfFour = new JSpinner();
        tfFour.setValue(150);
        tfFour.setBounds(200, 250, 125, 25);
        
        //Start button
        
        b1 = new JButton("Start");
        b1.setBounds(150, 325, 100, 40);
        
        //Jframe Options
        f.add(delay);
        f.add(keyOne);
        f.add(tfOne);
        f.add(keyTwo);
        f.add(tfTwo);
        f.add(keyThree);
        f.add(tfThree);
        f.add(keyFour);
        f.add(tfFour);
        f.add(b1);
        f.setSize(450,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
}
}
