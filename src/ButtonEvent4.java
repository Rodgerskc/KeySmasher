
import java.awt.Robot;
import java.awt.event.KeyEvent;


/**
 *
 * @author X
 */
public class ButtonEvent4 implements Runnable{
   static int js4;
   @Override
    public void run(){
        
        try{
        Robot r = new Robot();
        while (DMacro.on){
            
        Thread.sleep(js4);
        r.keyPress(KeyEvent.VK_4);
        r.keyRelease(KeyEvent.VK_4);
        
        }
        }
        catch(Exception e){
            Thread.currentThread().interrupt();}
        
        
    
    }
}