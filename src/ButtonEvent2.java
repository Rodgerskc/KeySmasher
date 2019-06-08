
import java.awt.Robot;
import java.awt.event.KeyEvent;


/**
 *
 * @author X
 */
public class ButtonEvent2 implements Runnable{
   static int js2;
   @Override
    public void run(){
        
        try{
        Robot r = new Robot();
        while (DMacro.on){
        Thread.sleep(js2);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_2);
        
        }
        }
        catch(Exception e){
            Thread.currentThread().interrupt();}
        
        
    
    }
}