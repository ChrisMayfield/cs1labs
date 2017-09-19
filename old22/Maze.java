import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Maze {
    
    public static void main(final String[] args) {
        
        // keep running until the beak is up
        Finch finch = new Finch();
        while (!finch.isBeakUp()) {
            
            // if there's an obstacle, back up with red light
            if (finch.isObstacleLeftSide()) {
                finch.setLED(255, 0, 0);
                finch.setWheelVelocities(-255, -255, 500);
            }
            
            // otherwise, move forward with green light
            else {
                finch.setLED(0, 255, 0);
                finch.setWheelVelocities(255, 255);
            }
            
        }
        
        // the beak is now up, so terminate the program
        finch.quit();
    }
    
}
