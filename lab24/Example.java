/**
 * An example of how you can use the Robot class to demonstrate an algorithm.
 */
public class Example {
    public static void main(String[] args) {
        Robot robot;
        robot = new Robot(3, 3);
        
        robot.move('E');
        if (robot.check('N')) {
            robot.move('N');
        }
        
        robot.move('W');
        robot.say("2 rooms");
        robot.move('W');
    }
}
