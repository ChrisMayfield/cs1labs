import java.util.Scanner;

/**
 * Lab03: Input in Java, data types, and compatibility.
 * This program experiments with Scanner and assignment.
 *
 * @author YOUR NAME
 * @version TODAY'S DATE
 */
public class Types {
    
    /**
     * SUMMARIZE WHAT YOU HAVE LEARNED HERE.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        double val1;
        double val2;
        Scanner input;
        String text;
        
        // initialization
        num2 = 50;
        val2 = 172.5;
        input = new Scanner(System.in);
        
        // read and echo a number
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.println("The number you entered is " + num1);
    }
    
}
