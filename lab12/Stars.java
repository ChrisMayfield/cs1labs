import java.util.Scanner;

/**
 * Produce star patterns demonstrating nested for loops.
 * Adapted from Lewis and Loftus by Nancy and Arch Harris.
 * 
 * @author YOUR NAME
 * @version TODAY'S DATE
 */
public class Stars {
    
    public static void main(String[] args) {
        int maxRows;  // maximum number of rows
        int starCnt;  // number of stars per row
        int blnkCnt;  // blanks preceding stars
        
        Scanner stdIn;
        stdIn = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for the number of rows: ");
        maxRows = stdIn.nextInt();
        while (maxRows <= 0) {
            System.out.print("\nYou did not enter a POSITIVE number.");
            System.out.printf(" You entered %d!\n", maxRows);
            System.out.print("Enter a positive number for the number of rows: ");
            maxRows = stdIn.nextInt();
        }
        
        // first example: stars per row goes from 1 to maxRows
        System.out.println();
        System.out.println("First Example");
        System.out.println();
        for (int row = 1; row <= maxRows; row++) {
            starCnt = row;
            for (int col = 1; col <= starCnt; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // insert code for Patterns A, B, C, and D below
        
    }
    
}
