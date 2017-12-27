import junit.framework.TestCase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Example test cases for CSCard.java.
 * 
 * @author Chris Mayfield
 * @version 10/09/2015
 */
public class CSCardTest extends TestCase {
    
    /**
     * Tests the calculateInterest method.
     */
    public static void testCalculateInterest() {
        double actual;
        
        actual = CSCard.calculateInterest(0, 125.25);
        assertEquals("Error in calculateInterest: ", 0.00, actual);
        
        actual = CSCard.calculateInterest(50, 50);
        assertEquals("Error in calculateInterest: ", 2.00, actual);
    }
    
    /**
     * Tests the calculateMinPayment method.
     */
    public static void testCalculateMinPayment() {
        double actual;
        
        actual = CSCard.calculateMinPayment(-1.00);
        assertEquals("Error in calculateMinPayment: ",  0.00, actual);
        
        actual = CSCard.calculateMinPayment(38.00);
        assertEquals("Error in calculateMinPayment: ", 38.00, actual);
        
        actual = CSCard.calculateMinPayment(128.00);
        assertEquals("Error in calculateMinPayment: ", 50.00, actual);
        
        actual = CSCard.calculateMinPayment(350.00);
        assertEquals("Error in calculateMinPayment: ", 70.00, actual);
    }
    
    /**
     * Tests the main method.
     */
    public static void testMain() {
        new CSCard(); // cover the class line
        simulateMain("50\n50\n");
        simulateMain("BAD\n50\n");
        simulateMain("50\nBAD\n");
    }
    
    /**
     * Run CSCard.main as if the user had typed in the given input.
     *
     * @param input the input to simulate
     */
    private static void simulateMain(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        CSCard.main(new String[] {});
    }
    
}
