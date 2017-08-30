import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * Lab16: Recursive 2D graphics.
 * 
 * @author YOUR NAME
 * @version TODAY'S DATE
 */
public class Lab12 extends Canvas {
    
    /** Scaling factor of the Vee. */
    private static final int SIZE = 50;
    
    /**
     * Prints a random greeting.
     */
    public static void hello() {
        System.out.println("Hello, world!");
    }
    
    /**
     * Generates a random number between x and y, inclusive.
     * 
     * @param x lower bound
     * @param y upper bound
     * @return random integer
     */
    public static int randInt(int x, int y) {
        return 0;
    }
    
    /**
     * Creates the main window.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        hello();
        Canvas canvas = new Lab12();
        canvas.setSize(800, 400);
        canvas.setBackground(Color.white);
        JFrame frame = new JFrame("Lab12 Drawing");
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Paints the window whenever it changes.
     * 
     * @param g graphics context
     */
    public void paint(Graphics g) {
        System.out.println("==== paint ====");
        vee(g, 400, 350, 1);
    }
    
    /**
     * Draws an upside-down diamond.
     * 
     * @param g graphics context
     * @param x bottom x location
     * @param y bottom y location
     * @param size length of each side
     */
    public void diamond(Graphics g, int x, int y, int size) {
        System.out.printf("diamond(%d, %d, %d)\n", x, y, size);
        int half = size / 2;
        int left = x - half;
        int right = x + half;
        int mid = y - half;
        int top = y - size;
        g.setColor(Color.green);
        g.drawLine(x, y, left, mid);
        g.drawLine(left, mid, x, top);
        g.drawLine(x, top, right, mid);
        g.drawLine(right, mid, x, y);
    }
    
    /**
     * Draws an upside-down triangle.
     * 
     * @param g graphics context
     * @param x bottom x location
     * @param y bottom y location
     * @param size length of each side
     */
    public void triangle(Graphics g, int x, int y, int size) {
        System.out.printf("triangle(%d, %d, %d)\n", x, y, size);
        int half = size / 2;
        int left = x - half;
        int right = x + half;
        int top = y - size;
        g.setColor(Color.red);
        g.drawLine(x, y, left, top);
        g.drawLine(left, top, right, top);
        g.drawLine(right, top, x, y);
    }
    
    /**
     * Draws a nifty pattern inspired by the letter V.
     * 
     * @param g graphics context
     * @param x bottom x location
     * @param y bottom y location
     * @param size length of branch
     * @param depth recursive count
     */
    public void vee(Graphics g, int x, int y, int depth) {
        System.out.printf("vee(%d, %d, %d)\n", x, y, depth);
        
        // left branch
        int x2 = x - SIZE * 3 / depth;
        int y2 = y - SIZE;
        g.setColor(Color.magenta);
        g.drawLine(x, y, x2, y2);
        
        // right branch
        int x3 = x + SIZE * 3 / depth;
        int y3 = y - SIZE;
        g.setColor(Color.blue);
        g.drawLine(x, y, x3, y3);
    }
    
}
