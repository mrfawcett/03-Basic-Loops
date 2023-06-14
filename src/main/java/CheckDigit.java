public class CheckDigit {
    
    /** Returns the number of digits in num. */
    public static int getNumberOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }


    /** Returns the nth digit of num.
     * Precondition: n >= 1 and n <= the number of digits in num
     */
    public static int getDigit(int num, int n) {
        int count = getNumberOfDigits(num) - n;
        for (int i = 0; i < count; i++) {
            num = num / 10;
        }
        return num % 10;
    }

    /** COMPLETE THIS METHOD
     * 
     * Precondition: The number of digits in num is between one and six, inclusive.
     * num >= 0
     * Multiply the first digit by 7, the second digit (if one exists) by 6, the third
     * digit (if one exists) by 5, and so on.
     * Add the products calculated in the previous step.
     * Extract the check digit, which is the rightmopst digit of the sum calculated.
     * Ex. num = 1732
     * 1x7 + 7x6 + 3x5 + 2x4 = 72
     * getCheck returns 2
     */
    public static int getCheck(int num) {

        return 0;
    }


    /** COMPLETE THIS METHOD
     * 
     * Precondition: The number of digits in numWithCheckDigit is between two and seven, inclusive.
     * numWithCheckDigit >= 0
     * Returns true if numWithCheckDigit is valid which represents a number containing
     * a check digit, is valid, or false otherwise. The check digit is always the rightmost digit
     * of numWithCheckDigit.
     * Ex. getCheck(1732) returns 2
     * isValid(17322) returns true  :: 2 is the check digit of 1732
     * isValid(17325) returns false :: 5 is NOT the check digit of 1732
     */
    public static boolean isValid(int numWithCheckDigit) {

        return false;
    }
}
