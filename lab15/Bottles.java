/**
 * Bottles of Pop example to practice debugging and tracing code.
 * 
 * @author YOUR NAME HERE
 * @version TODAY'S DATE HERE
 */
public class Bottles {
    
    /**
     * Prints the words for the given verse.
     * 
     * @param verse the verse to display
     */
    public static void sing(int verse) {
        if (verse > 1) {
            System.out.printf("%d bottles of pop on the wall\n", verse);
        }
        if (verse == 1) {
            System.out.println("1 bottle of pop on the wall");
        }
    }
    
    /**
     * Calls the sing method for each verse.
     * 
     * @args command line arguments (optional starting verse)
     */
    public static void main(String[] args) {
        int verse;
        
        // read the optional command line argument
        if (args.length > 0) {
            verse = Integer.parseInt(args[0]);
        } else {
            verse = 10;  // default value
        }
        
        // sing each verse of the entire song
        while (verse > 0) {
            sing(verse);
            System.out.println();
            verse--;
        }
    }
    
}
