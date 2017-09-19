/**
 * Simple test driver for the Document class.
 * 
 * @author Nathan Sprague
 * @version 4/6/2016
 */
public class DocumentTestDriver {
    
    /**
     * Start the application.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Document docEmpty = new Document();
        Document docFull = new Document();
        Document copy;
        
        docFull.appendLine("CS149 is");
        docFull.appendLine("super fun.");
        
        System.out.println("PRINTING A DOCUMENT WITH TWO LINES:");
        System.out.print(docFull.toString());
        
        System.out.println("\nPRINTING AN EMPTY DOCUMENT:");
        System.out.print(docEmpty.toString());
        
        System.out.println("\nREMOVING LINE 0:");
        docFull.deleteLine(0);
        System.out.print(docFull.toString());
        
        System.out.println("\nADDING TWO MORE LINES:");
        docFull.appendLine("sooooooper fun");
        docFull.appendLine("fun.");
        System.out.print(docFull.toString());
        
        System.out.println("\nLONGEST LINE:");
        System.out.println(docFull.longestLine());
        
        System.out.println("\nPRINTING A COPY OF THE DOCUMENT:");
        copy = new Document(docFull);
        System.out.print(copy.toString());
        
        System.out.println("\nTHE COPY IS EQUAL TO THE ORIGINAL?");
        System.out.println(copy.equals(docFull));
        
        System.out.println("\nTHE COPY IS EQUAL TO AN EMPTY DOCUMENT?");
        System.out.println(copy.equals(docEmpty));
    }
    
}
