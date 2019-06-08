
import java.awt.Robot;
import java.awt.event.KeyEvent;


/**
 *
 * @author X
 */
public class ButtonEvent3 implements Runnable{
   static int js3;
   @Override
    public void run(){
        
        try{
        Robot r = new Robot();
        while (DMacro.on){
            
        Thread.sleep(js3);
        r.keyPress(KeyEvent.VK_3);
        r.keyRelease(KeyEvent.VK_3);
        
        }
        }
        catch(Exception e){
            Thread.currentThread().interrupt();}
        
        
    
    }
}