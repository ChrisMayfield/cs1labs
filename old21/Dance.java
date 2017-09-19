import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Simple program to have the Finch do a dance.
 * Adapted from Tom Lauwers example 10/15/2010.
 *
 * @author YOUR NAME
 * @version TODAY'S DATE
 */
public class Dance {
    
    public static void main(String[] args) {
        Finch finch = new Finch();
        finch.saySomething("Time to do a little dance!");
        
        // set LED green and move forward for one second
        finch.setLED(0, 255, 0);
        finch.setWheelVelocities(255, 255, 1000);
        
        // set LED yellow and turn for a half second
        finch.setLED(255, 255, 0);
        finch.setWheelVelocities(-180, 180, 500);
        
        // set LED red and back up for a second
        finch.setLED(255, 0, 0);
        finch.setWheelVelocities(-255, -255, 1000);
        
        // set LED magenta and turn for a half second
        finch.setLED(255, 0, 255);
        finch.setWheelVelocities(180, -180, 500);
        
        // set LED blue and move forward for a second
        finch.setLED(0, 0, 255);
        finch.setWheelVelocities(255, 255, 1000);
        
        // disconnect from the finch
        finch.quit();
    }
    
}
