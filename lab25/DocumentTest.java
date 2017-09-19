import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the ArrayList Document Lab.
 * 
 * @author Nathan Sprague
 * @version 4/6/2016
 */
public class DocumentTest {
    
    private Document docEmpty;
    
    private Document docFull;
    
    @Before
    public void setUp() {
        docEmpty = new Document();
        docFull = new Document();
        
        docFull.appendLine("Hello There");
        docFull.appendLine("This is cool.");
    }
    
    @Test
    public void testCopyConstructorCreatesEqualDocuments() {
        Document copy = new Document(docFull);
        assertTrue(copy.equals(docFull));
        
        copy = new Document(docEmpty);
        assertTrue(copy.equals(docEmpty));
    }
    
    @Test
    public void testCopyConstructorAliasArrayList() {
        Document copy = new Document(docFull);
        copy.deleteLine(0);
        assertFalse(copy.equals(docFull));
    }
    
    @Test
    public void testToStringFull() {
        assertEquals("Hello There\nThis is cool.\n", docFull.toString());
    }
    
    @Test
    public void testToStringEmpty() {
        assertEquals("", docEmpty.toString());
    }
    
    @Test
    public void testDeleteLine() {
        docFull.deleteLine(0);
        assertEquals("This is cool.\n", docFull.toString());
    }
    
    @Test
    public void testLongestSingle() {
        docEmpty.appendLine("aaaa");
        assertEquals("aaaa", docEmpty.longestLine());
    }
    
    @Test
    public void testLongestFirst() {
        docEmpty.appendLine("aaaa");
        docEmpty.appendLine("aaa");
        docEmpty.appendLine("aa");
        assertEquals("aaaa", docEmpty.longestLine());
    }
    
    @Test
    public void testLongestMiddle() {
        docEmpty.appendLine("aaa");
        docEmpty.appendLine("aaaa");
        docEmpty.appendLine("aa");
        assertEquals("aaaa", docEmpty.longestLine());
    }
    
    @Test
    public void testLongestLast() {
        docEmpty.appendLine("aaa");
        docEmpty.appendLine("aa");
        docEmpty.appendLine("aaaa");
        assertEquals("aaaa", docEmpty.longestLine());
    }
    
    @Test
    public void testLongestEmptyDocument() {
        assertEquals("", docEmpty.longestLine());
    }
    
    @Test
    public void testEqualsNotEqual() {
        assertFalse(docEmpty.equals(docFull));
        assertFalse(docFull.equals(docEmpty));
    }
    
    @Test
    public void testEqualsSameDocument() {
        assertTrue(docEmpty.equals(docEmpty));
        assertTrue(docFull.equals(docFull));
    }
    
    @Test
    public void testEqualsDifferentButEqual() {
        Document docFullCopy = new Document();
        docFullCopy.appendLine("Hello There");
        docFullCopy.appendLine("This is cool.");
        assertTrue(docFull.equals(docFullCopy));
    }
    
}
