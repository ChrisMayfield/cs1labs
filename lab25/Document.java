/**
 * The Document class represents a text document as an ArrayList of Strings,
 * where each entry in the ArrayList stores a single line of text.
 * 
 * @author ???
 * @version ???
 */
public class Document {
    
    // DECLARE ARRAYLIST HERE
    
    /**
     * Initialize a document containing no text.
     */
    public Document() {
        
    }
    
    /**
     * Copy constructor. Create a document that is identical to the provided
     * document.
     * 
     * @param other The document to copy
     */
    public Document(Document other) {
        
    }
    
    /**
     * Add a single line of text to the end of the document. The line is stored
     * "as-is". I.e. no newline characters are added.
     * 
     * @param line The line of text to add
     */
    public void appendLine(String line) {
        
    }
    
    /**
     * Delete the indicate line of text. This method uses 0-based indexing. This
     * method performs no error checking. It may raise an exception if an invalid
     * line number is provided.
     * 
     * @param lineNumber The index of the line to delete
     */
    public void deleteLine(int lineNumber) {
        
    }
    
    /**
     * This method returns the single longest line of text in the document. The
     * line is returned without a trailing newline character. If the document is
     * empty, the return value should be an empty string ("").
     * 
     * @return The longest line
     */
    public String longestLine() {
        return "";
    }
    
    /**
     * This method returns the entire document as a single string. Each line
     * (including the last) will be terminated with a single newline character.
     * If the document is empty, then return value will be an empty string.
     * 
     * @return The entire document as a single string
     */
    public String toString() {
        return "";
    }
    
    /**
     * Return true if this document is equal to another document. Two documents
     * are considered equal if each line of text they contain is exactly the
     * same. (HINT: the ArrayList class provides an equals method that returns
     * true if all entries in the two ArrayLists are equal.)
     * 
     * @param other The other document
     * @return true if the two documents are the same, false otherwise.
     */
    public boolean equals(Document other) {
        return false;
    }
    
}
