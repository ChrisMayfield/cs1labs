/**
 * This class contains methods that are to be tested as part of Lab10A.
 * 
 * Documentation for the first three methods has been omitted. They are to
 * be tested with "white-box" techniques, rather than by using documentation.
 * 
 * @author Chris Mayfield (adapted from Ralph Grove)
 * @version 03/25/2014
 */
public class Coverage {
    
    public static int ifMethod(int a, int b, int c) {
        int result = 0;
        if (a < 0) {
            result = 1;
        } else if (b + a == 3) {
            result = 2;
        } else if (a + b + c > 10) {
            result = 3;
        }
        return result;
    }
    
    public static String caseMethod(int code) {
        String message = "Unknown";
        switch (code) {
            case 100:
                message = "Information";
                break;
            case 200:
                message = "Success";
                break;
            case 404:
                message = "Unknown URL";
                break;
            case 505:
                message = "Server Error";
                break;
        }
        return message;
    }
    
    public static int loopMethod(int size) {
        int sum = 0;
        for (int i = 1; i < size; i++) {
            if (size % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    
    /**
     * This method returns the square root of non-negative value of x, to
     * a precision of 0.00001. For negative values, the method returns 0.
     * 
     * @param x number for which the square root is to be computed
     * @return square root of the parameter x
     */
    public static double squareRoot(double x) {
        double root;
        if (x < 0) {
            root = 0;
        } else {
            root = x / 2.0;
        }
        while (x >= 0 && Math.abs(root * root - x) > 0.00001) {
            root = (root + x / root) / 2.0;
        }
        return root;
    }
    
}
