import java.util.Scanner;

/**
 * This class will explore problems with invalid user input.
 *
 * @author Nancy Harris
 * @version 02/20/2014
 */
public class BadInput {
    
    /**
     * Prompts for two values and performs various operations on those operands.
     *
     * @param args unused in this program
     */
    public static void main(String args[]) {
        int operand1;
        int operand2;
        int result;
        String badValue;
        Scanner keyboard;
        
        keyboard = new Scanner(System.in);
        
        System.out.print("Enter two integers separated by a space: ");
        operand1 = keyboard.nextInt();
        operand2 = keyboard.nextInt();
        System.out.print("\n");
        
        result = operand1 + operand2;
        System.out.println(operand1 + " + " + operand2 + " = " + result);
        
        result = operand1 - operand2;
        System.out.println(operand1 + " - " + operand2 + " = " + result);
        
        result = operand1 * operand2;
        System.out.println(operand1 + " * " + operand2 + " = " + result);
        
        result = operand1 / operand2;
        System.out.println(operand1 + " / " + operand2 + " = " + result);
        
        result = operand1 % operand2;
        System.out.println(operand1 + " % " + operand2 + " = " + result);
    }
    
}
