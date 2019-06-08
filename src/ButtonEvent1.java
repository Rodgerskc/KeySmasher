
import java.awt.Robot;
import java.awt.event.KeyEvent;


/**
 *
 * @author X
 */
public class ButtonEvent1 implements Runnable{
   static int js1;
   @Override
    public void run(){
        
        try{
        Robot r = new Robot();
        while (DMacro.on){
           
        Thread.sleep(js1);
        r.keyPress(KeyEvent.VK_1);
        r.keyRelease(KeyEvent.VK_1);
        
        }
        }
        catch(Exception e){
            Thread.currentThread().interrupt();}
        
        
    
    }
}