/** READ FIRST
 * A CHECK DIGIT is one extra digit added to the end of a number so that a
 * typo can be detected. Barcodes, ISBNs, and credit-card numbers all use one.
 * You will implement one simple check-digit scheme.
 *
 * To compute the check digit of a number with one to six digits:
 *   1. Multiply the first (leftmost) digit by 7, the second digit (if there is
 *      one) by 6, the third by 5, and so on -- the multiplier goes down by one
 *      for each digit.
 *   2. Add up the products.
 *   3. The check digit is the rightmost digit of that sum.
 *
 * Example: num = 1732
 *      1 x 7  +  7 x 6  +  3 x 5  +  2 x 4  =  7 + 42 + 15 + 8  =  72
 *      the rightmost digit of 72 is 2, so getCheck(1732) returns 2
 * The number WITH its check digit attached is 17322.
 *
 * Two helper methods are PROVIDED and already work:
 *      getNumberOfDigits(num)  how many digits num has (1732 -> 4)
 *      getDigit(num, n)        the nth digit of num, counting from the left,
 *                              starting at 1 (getDigit(1732, 1) -> 1,
 *                              getDigit(1732, 4) -> 2)
 *
 * This is written in the style of an AP free-response question.
 */
public class CheckDigit {
    public static void main(String[] args) {
        // Try your methods here. The autograder ignores main.
        System.out.println(getCheck(1732));  // 2
        System.out.println(isValid(17322));  // true
        System.out.println(isValid(17325));  // false
    }

    /** PROVIDED -- do not change
     * Returns the number of digits in num.
     * Precondition: num >= 1 (0 would report zero digits).
     */
    public static int getNumberOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }

    /** PROVIDED -- do not change
     * Returns the nth digit of num, counting from the LEFT and starting at 1.
     * Precondition: n >= 1 and n <= the number of digits in num
     * Example: getDigit(1732, 1) returns 1; getDigit(1732, 4) returns 2.
     */
    public static int getDigit(int num, int n) {
        int count = getNumberOfDigits(num) - n;
        for (int i = 0; i < count; i++) {
            num = num / 10;
        }
        return num % 10;
    }

    /** COMPLETE THIS METHOD
     * Precondition: num >= 1 and num has between one and six digits, inclusive.
     * Returns the check digit for num: multiply the first digit by 7, the
     * second by 6, the third by 5, and so on; add the products; return the
     * rightmost digit of the sum.
     * Example: getCheck(1732) returns 2  (1x7 + 7x6 + 3x5 + 2x4 = 72)
     *          getCheck(9) returns 3      (9x7 = 63)
     * Hint: loop i from 1 to getNumberOfDigits(num); the multiplier for
     *       digit i is 8 - i. The rightmost digit of a sum is sum % 10.
     */
    public static int getCheck(int num) {
        // Insert your code below

        return 0;
    }

    /** COMPLETE THIS METHOD
     * Precondition: numWithCheckDigit >= 10 and has between two and seven
     *               digits, inclusive.
     * numWithCheckDigit is a number with its check digit attached as the
     * rightmost digit. Returns true if that check digit is correct for the
     * number in front of it, and false otherwise.
     * Example: getCheck(1732) returns 2, so
     *          isValid(17322) returns true   (2 IS the check digit of 1732)
     *          isValid(17325) returns false  (5 is NOT the check digit of 1732)
     * Hint: numWithCheckDigit / 10 drops the last digit;
     *       numWithCheckDigit % 10 is the last digit.
     */
    public static boolean isValid(int numWithCheckDigit) {
        // Insert your code below

        return false;
    }
}
