/* READ FIRST
 * The following rules are used to find the next term in the 
 * hailstone sequence.
 * If n is 1, the sequence terminates
 * If n is even, then the next term is n/2
 * If n is odd, then the next term is 3n + 1
 * 
 * Ex. if n = 5
 * first term is 5, so the second term is (5x3)+1 = 16
 * the second term is 16, so the third term is 16/2 = 8
 * the third term is 8, so the fourth term is 8/2 = 4
 * the fourth term is 4, so the fifth term is 4/2 = 2
 * the fifth term is 2, so the sixth term is 2/2 = 1
 * since the sixth term is 1, the sequence terminates.
 * Therefore, the hailstone sequence will be 5, 16, 8, 4, 2, 1
 */

public class Hailstone {

    /** COMPLETE THIS METHOD
     * Precondition: n > 0
     * Returns the length of a hailstone sequence that starts with n,
     * the length of a hailstone sequence is the number of terms it contains.
     * Given the example above the length would be 6.
     */
    public static int hailstoneLength(int n) { 
        
        return 0;
    }

    /** COMPLETE THIS METHOD
     * Precondition: n > 0
     * Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise. A hailstone sequence is considered long if its length 
     * is greater than its starting value. 
     * Given the example above the starting term was 5 and the length was 6, 
     * therfore, the hailstone sequence is considered long.
     */
    public static boolean isLongSeq(int n) { 
        
        return false;
    }

    /** COMPLETE THIS METHOD
     * Precondition: n > 0
     * Returns the proportion of long hailstone ssequences with starting values 
     * between 1 and n, inclusive.
     * For the first ten sequences 5 of them are considered long, therfore, 
     * propLong(10) should return 0.5
     * NOTE: isLongSeq() is required to work properly for accuate results.
     */
    public static double propLong(int n) {
        
        return 0.0;
    }
}
