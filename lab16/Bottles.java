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
        System.out.println();
    }
    
    /**
     * Sing each verse of the entire song (using a loop).
     * 
     * @param first the first verse of the song
     */
    public static void iterative(int first) {
        while (first > 0) {
            sing(first);
            first = first - 1;
        }
    }
    
    /**
     * Sing each verse of the entire song (using a loop).
     * 
     * @param first the first verse of the song
     */
    public static void recursive(int first) {
        if (first <= 0) {
            return; // base case
        }
        sing(first);
        recursive(first - 1);
    }
    
    /**
     * Calls the sing method for each verse.
     * 
     * @args command line arguments (optional starting verse)
     */
    public static void main(String[] args) {
        int start;
        
        // read the optional command line argument
        if (args.length > 0) {
            start = Integer.parseInt(args[0]);
        } else {
            start = 10;  // default value
        }
        
        // sing the song
        iterative(start);
    }
    
}
