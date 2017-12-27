import java.util.Scanner;

/**
 * DESCRIBE THIS CLASS HERE.
 * 
 * @author YOUR NAME HERE
 * @version TODAY'S DATE HERE
 */
public class CSCard {
    
    public static void main(String[] args) {
        Scanner input;
        double priorBalance;
        double addtlCharges;
        double interest;
        double newBalance;
        double minPayment;
        
        // initialize needed variables here
        input = new Scanner(System.in);
        
        // make sure that the number entered is a double and if so read it in.
        // if not, use a default value of zero. No error message to the user.
        System.out.print("Type the previous balance: ");
        if (input.hasNextDouble()) {
            priorBalance = input.nextDouble();
        } else {
            input.next();
            priorBalance = 0;
        }
        
        // make sure that the number entered is a double and if so read it in.
        // if not, use a default value of zero.  No error message to the user.
        System.out.print("Type the additional charges: ");
        
        // perform the calculation of interest, new balance and minimum payment
        
        // output the resulting statement (DO NOT CHANGE)
        System.out.println("\n");
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.printf("Previous balance:   $%,8.2f\n", priorBalance);
        System.out.printf("Additional charges: $%,8.2f\n", addtlCharges);
        System.out.printf("Interest:           $%,8.2f\n\n", interest);
        System.out.printf("New balance:        $%,8.2f\n\n", newBalance);
        System.out.printf("Minimum payment:    $%,8.2f\n", minPayment);
    }
    
    /**
     * This method will take in the previous balance and
     * additional charges and compute the amount of interest.
     * If the priorBalance is 0 or less, the interest is 0.
     * If there was a priorBalance, the interest is 2% of the
     * priorBalance plus the additional charges.
     * 
     * @param priorBalance balance before the new charges are added
     * @param addtlCharges charges added this month
     * @return amount of interest to charge
     */
    public static double calculateInterest(double priorBalance,
                                           double addtlCharges) {
        // first create a stub and get the input and output working
        // then replace the stub later on with the calculation
    }
    
    /**
     * This method will take in the previous balance and
     * additional charges and compute the minimum payment.
     *          $0.00          for new balance less than $0
     *      new balance        for new balance between $0 and $49.99 (inclusive)
     *         $50.00          for new balance between $50 and $300 (inclusive)
     * 20% of the new balance  for new balance over $300
     *
     * @param balance after interest and charges are added
     * @return minimum payment amount
     */
    public static double calculateMinPayment(double balance) {
        // first create a stub and get the input and output working
        // then replace the stub later on with the calculation
    }
    
}
