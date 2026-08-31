/** READ FIRST
 * A hailstone sequence starts at a positive integer n and follows these rules
 * to find each next term:
 *      If n is 1, the sequence stops.
 *      If n is even, the next term is n / 2.
 *      If n is odd,  the next term is 3n + 1.
 *
 * Example, starting at n = 5:
 *      5 is odd,  so the next term is 5 * 3 + 1 = 16
 *      16 is even, so the next term is 16 / 2 = 8
 *      8 is even,  so the next term is 8 / 2 = 4
 *      4 is even,  so the next term is 4 / 2 = 2
 *      2 is even,  so the next term is 2 / 2 = 1
 *      1 -- stop.
 * The hailstone sequence for 5 is  5, 16, 8, 4, 2, 1  and its LENGTH is 6
 * (the number of terms, counting the starting value and the final 1).
 *
 * A hailstone sequence is called LONG if its length is greater than its
 * starting value. 5 has length 6, and 6 > 5, so 5 is long. 10 has length 7,
 * and 7 is not > 10, so 10 is not long.
 *
 * This is written in the style of an AP free-response question: three static
 * methods, each building on the one before it.
 */

public class Hailstone {

    public static void main(String[] args) {
        // Try your methods here. The autograder ignores main.
        System.out.println(hailstoneLength(5)); // 6
        System.out.println(isLongSeq(5));       // true
        System.out.println(propLong(10));       // 0.5
    }

    /** COMPLETE THIS METHOD
     * Precondition: n > 0
     * Returns the length of the hailstone sequence that starts with n. The
     * length is the number of terms it contains, including n itself and the
     * final 1.
     * Example: hailstoneLength(5) returns 6; hailstoneLength(1) returns 1.
     * Hint: a while loop that runs until n is 1, counting each term. Use
     *       n % 2 to test even/odd.
     */
    public static int hailstoneLength(int n) {
        // Insert your code below

        return 0;
    }

    /** COMPLETE THIS METHOD
     * Precondition: n > 0
     * Returns true if the hailstone sequence that starts with n is long, and
     * false otherwise. A sequence is long if its length is GREATER THAN its
     * starting value (strictly greater -- equal does not count).
     * Example: isLongSeq(5) returns true (length 6 > 5);
     *          isLongSeq(1) returns false (length 1 is not > 1).
     * Hint: call hailstoneLength. This method is one line.
     */
    public static boolean isLongSeq(int n) {
        // Insert your code below

        return false;
    }

    /** COMPLETE THIS METHOD
     * Precondition: n > 0
     * Returns the proportion of long hailstone sequences whose starting values
     * are between 1 and n, inclusive, as a double between 0.0 and 1.0.
     * Example: of the starting values 1..10, five (3, 5, 6, 7, 9) are long,
     *          so propLong(10) returns 0.5. propLong(1) returns 0.0.
     * Hint: count how many of 1..n are long with isLongSeq, then divide.
     *       Watch out for integer division -- count / n is 0 when both are int.
     * NOTE: isLongSeq must work correctly for this method to be right.
     */
    public static double propLong(int n) {
        // Insert your code below

        return 0.0;
    }
}
