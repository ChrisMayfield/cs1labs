// Does not conform to style guide!

public class Houses {

   public static void main(String[] args) 
 {
    drawDoor(.2, .5);
   }
  
   public static void drawDoor(double x, double y) 
   {
      final double WIDTH = .05;
      final double HEIGHT = .1;
      final double KNOB_RADIUS = .005;
      final double KNOB_OFFSET = -.01;
      
      StdDraw.rectangle(x, y, WIDTH / 2, HEIGHT / 2);
      StdDraw.filledCircle(x - KNOB_OFFSET, y, KNOB_RADIUS);
      
   }
}
