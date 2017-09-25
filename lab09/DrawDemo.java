/**
 * Simple StdDraw demo.
 *
 * @author Nathan Sprague
 * @version 2/2/16
 */
public class DrawDemo {

   /**
    * Draw several shapes.
    *
    * @param args Not used
    */ 
   public static void main(String[] args) {
      StdDraw.line(.2, .2, .3, .5);
      StdDraw.rectangle(.6, .6, .1, .3);
      StdDraw.filledCircle(.1, .9, .1);
   }
}