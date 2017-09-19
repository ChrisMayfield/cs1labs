import java.util.Scanner;

/**
 * A simple editor application designed to exercise the Document class.
 * 
 * @author Nathan Sprague
 * @version 4/6/2016
 */
public class Editor {
    
    private Document document;
    
    private Scanner scanner;
    
    /**
     * Initialize the scanner and document.
     */
    public Editor() {
        scanner = new Scanner(System.in);
        document = new Document();
    }
    
    /**
     * The run method handles the main user interaction loop.
     */
    private void run() {
        int lineNumber;
        String curLine;
        
        System.out.println("\nNanovimacs, the worlds greatest "
                               + "command-line text editor!\n");
        printPrompt();
        
        while (scanner.hasNextLine()) {
            curLine = scanner.nextLine();
            switch (curLine.trim().toLowerCase()) {
                case "a":
                    readText();
                    break;
                case "d":
                    System.out.println("Which line number should be deleted?");
                    if (scanner.hasNextInt()) {
                        lineNumber = scanner.nextInt();
                        document.deleteLine(lineNumber);
                    } else {
                        System.out.println("Bad line number.");
                    }
                    scanner.nextLine();
                    break;
                case "l":
                    System.out.println("\nThe longest line is:");
                    System.out.println("\n" + document.longestLine() + "\n");
                    break;
                case "p":
                    System.out.println("\n" + document);
                    break;
                default:
                    System.out.println("Unrecognized command.");
            }
            printPrompt();
            
        }
        System.out.println();
    }
    
    /**
     * Read lines of text until the user enters a empty line.
     */
    private void readText() {
        String curLine;
        System.out.println("Enter text. Enter a blank line to finish.");
        while (scanner.hasNextLine()) {
            curLine = scanner.nextLine();
            if (curLine.equals("")) {
                break;
            }
            document.appendLine(curLine);
        }
        
    }
    
    /**
     * Print the instruction prompt.
     */
    public static void printPrompt() {
        System.out.print("\"a\" to enter text\n"
                             + "\"d\" to delete a line\n"
                             + "\"l\" to print the longest line\n"
                             + "\"p\" to display the entire document\n"
                             + "CTRL-D to exit\n"
                             + "Command: ");
    }
    
    /**
     * Start the application.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.run();
    }
    
}
