import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GetCheckTest {
    @DisplayName("getCheck(1732): 1x7 + 7x6 + 3x5 + 2x4 = 72 -> 2 (the READ FIRST example)")
    @Test
    void getCheck_Test01() {
        assertEquals(2, CheckDigit.getCheck(1732), "the sum is 72; its rightmost digit is 2");
    }

    @DisplayName("getCheck(9): a single digit, 9x7 = 63 -> 3")
    @Test
    void getCheck_Test02() {
        assertEquals(3, CheckDigit.getCheck(9), "one digit means one product: 63 -> 3");
    }

    @DisplayName("getCheck(687425): six digits, multipliers 7 down to 2 -> 7")
    @Test
    void getCheck_Test03() {
        assertEquals(7, CheckDigit.getCheck(687425),
            "6x7 + 8x6 + 7x5 + 4x4 + 2x3 + 5x2 = 157 -> 7");
    }

    @DisplayName("getCheck(38462): five digits -> 9")
    @Test
    void getCheck_Test04() {
        assertEquals(9, CheckDigit.getCheck(38462),
            "3x7 + 8x6 + 4x5 + 6x4 + 2x3 = 119 -> 9");
    }

    @DisplayName("getCheck(34): 3x7 + 4x6 = 45 -> 5")
    @Test
    void getCheck_Test05() {
        assertEquals(5, CheckDigit.getCheck(34), "21 + 24 = 45 -> 5");
    }

    @DisplayName("getCheck(100000): zeros contribute nothing, 1x7 = 7 -> 7")
    @Test
    void getCheck_Test06() {
        assertEquals(7, CheckDigit.getCheck(100000),
            "the first digit is multiplied by 7 no matter how many digits follow");
    }

    @DisplayName("getCheck(999999): largest six-digit input, sum 243 -> 3")
    @Test
    void getCheck_Test07() {
        assertEquals(3, CheckDigit.getCheck(999999),
            "9 x (7+6+5+4+3+2) = 243 -> 3; only the rightmost digit of the sum is returned");
    }
}
