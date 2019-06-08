import java.awt.event.*;
/**
 *
 * @author Kevin Rodgers
 */
public class DMacro {
    static boolean on = false;
    static Thread run1 = new Thread(new ButtonEvent1());
    static Thread run2 = new Thread(new ButtonEvent2());
    static Thread run3 = new Thread(new ButtonEvent3());
    static Thread run4 = new Thread(new ButtonEvent4());
    
    public static void main(String[] args) {
        //create the frame
        DMacroFrame dFrame = new DMacroFrame();
        //Start button for macros
        dFrame.b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent f){
                on = !on;
                System.out.println(on);
                if (on){dFrame.b1.setText("Stop");}
                else {dFrame.b1.setText("Start");}
                //case statement for checkboxes
                
                
                
                //Button threads
                if (on && !run1.isAlive() && !run2.isAlive() && !run3.isAlive() && !run4.isAlive()){
                    //Start Threads
                    for (int i = 0; i<4; i++){
                    if (dFrame.keyOne.isSelected() && !run1.isAlive()){
                        ButtonEvent1.js1 = (Integer)dFrame.tfOne.getValue();
                        run1.start();
                    }
                    
                    else if (dFrame.keyTwo.isSelected() && !run2.isAlive()){
                        ButtonEvent2.js2 = (Integer)dFrame.tfTwo.getValue();
                        run2.start();
                    }
                    
                    else if (dFrame.keyThree.isSelected() && !run3.isAlive()){
                        ButtonEvent3.js3 = (Integer)dFrame.tfThree.getValue();
                        run3.start();
                    }
                    
                    else if (dFrame.keyFour.isSelected() && !run4.isAlive()){
                        ButtonEvent4.js4 = (Integer)dFrame.tfFour.getValue();
                        run4.start();
                    }
                    
                    else {System.out.println("No Checkboxes detected");}
                    }
                }
                else {
                    for (int i = 0; i<4; i++){
                    if (run1.isAlive()){
                    run1.interrupt();
                    run1 = new Thread(new ButtonEvent1());
                    }
                    else if (run2.isAlive()){
                    run2.interrupt();
                    run2 = new Thread(new ButtonEvent2());
                    }
                    else if (run3.isAlive()){
                    run3.interrupt();
                    run3 = new Thread(new ButtonEvent3());
                    }
                    else if (run4.isAlive()){
                    run4.interrupt();
                    run4 = new Thread(new ButtonEvent4());
                    }
                    }
                    }
            }
        });
    }
}

