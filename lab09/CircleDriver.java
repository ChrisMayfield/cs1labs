/**
 * Test driver for the CirclePlay class.
 *
 * @author Nancy Harris
 * @version 09/23/2015
 */
public class CircleDriver {
    
    public static void main(String[] args) {
        
        int problem;
        double[] fVals = {1.0, 5.0, 10.5};
        
        if (args.length > 0) {
            problem = Integer.parseInt(args[0]);
        } else {
            problem = 0;
        }
        
        if (problem >= 0) {
            System.out.println("Testing Greeting\n");
            CirclePlay.printGreeting();
        }
        
        if (problem == 0 || problem >= 2) {
            System.out.println("Testing Input\n");
            for (int ii = 0; ii < fVals.length; ii++) {
                fVals[ii] = CirclePlay.enterRadius();
            }
            
            System.out.print("\nThe values you entered were: ");
            for (int ii = 0; ii < fVals.length; ii++) {
                System.out.print(fVals[ii] + "\t");
            }
            System.out.println();
        }
        
        if (problem == 0 || problem == 3) {
            for (int ii = 0; ii < fVals.length; ii++) {
                System.out.printf("A circle of radius %f has area of %f.\n",
                        fVals[ii], CirclePlay.calculateArea(fVals[ii]));
            }
        }
        
        if (problem == 0 || problem == 4) {
            for (int ii = 0; ii < fVals.length; ii++) {
                System.out.printf("A sphere of radius %f has volume of %f.\n",
                        fVals[ii], CirclePlay.calculateVolume(fVals[ii]));
            }
        }
        
    }
    
}
