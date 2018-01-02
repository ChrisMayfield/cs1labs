/**
 * CodingBat AP-1 problems.
 *
 * @author YOUR NAME
 * @version DUE DATE
 */
public class CodingBatAP1 {
    
    /**
     * Given an array of scores, return true if each score is equal or greater
     * than the one before. The array will be length 2 or more.
     * 
     * scoresIncreasing([1, 3, 4]) -> true
     * scoresIncreasing([1, 3, 2]) -> false
     * scoresIncreasing([1, 1, 4]) -> true
     */
    public static boolean scoresIncreasing(int[] scores) {
        return true;
    }
    
    /**
     * Given an array of scores, return true if there are scores of 100 next
     * to each other in the array. The array length will be at least 2.
     * 
     * scores100([1, 100, 100]) -> true
     * scores100([1, 100, 99, 100]) -> false
     * scores100([100, 1, 100, 100]) -> true
     */
    public static boolean scores100(int[] scores) {
        return true;
    }
    
    /**
     * Given an array of scores sorted in increasing order, return true if
     * the array contains 3 adjacent scores that differ from each other by
     * at most 2, such as with {3, 4, 5} or {3, 5, 5}.
     * 
     * scoresClump([3, 4, 5]) -> true
     * scoresClump([3, 4, 6]) -> false
     * scoresClump([1, 3, 5, 5]) -> true
     */
    public static boolean scoresClump(int[] scores) {
        return true;
    }
    
    /**
     * Given an array of scores, compute the int average of the first half
     * and the second half, and return whichever is larger. We'll say that
     * the second half begins at index length/2. The array length will be at
     * least 2.
     * 
     * To practice decomposition, write a separate helper method
     * int average(int[] scores, int start, int end) which computes the
     * average of the elements between indexes start..end. Call your
     * helper method twice to implement scoresAverage(). Write your
     * helper method after your scoresAverage() method in the CodingBat
     * text area.
     * 
     * Normally you would compute averages with doubles,
     * but here we use ints so the expected results are exact.
     * 
     * scoresAverage([2, 2, 4, 4]) -> 4
     * scoresAverage([4, 4, 4, 2, 2, 2]) -> 4
     * scoresAverage([3, 4, 5, 1, 2, 3]) -> 4
     */
    public static int scoresAverage(int[] scores) {
        return 999;
    }
    
    /**
     * Given an array of strings, return the count of the number of
     * strings with the given length.
     * 
     * wordsCount(["a", "bb", "b", "ccc"], 1) -> 2
     * wordsCount(["a", "bb", "b", "ccc"], 3) -> 1
     * wordsCount(["a", "bb", "b", "ccc"], 4) -> 0
     */
    public static int wordsCount(String[] words, int len) {
        return 999;
    }
    
    /**
     * Given an array of strings, return a new array containing the
     * first N strings. N will be in the range 1..length.
     * 
     * wordsFront(["a", "b", "c", "d"], 1) -> ["a"]
     * wordsFront(["a", "b", "c", "d"], 2) -> ["a", "b"]
     * wordsFront(["a", "b", "c", "d"], 3) -> ["a", "b", "c"]
     */
    public static String[] wordsFront(String[] words, int n) {
        return words;
    }
    
}
