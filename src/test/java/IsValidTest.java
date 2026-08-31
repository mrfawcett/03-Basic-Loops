import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IsValidTest {
    @DisplayName("isValid(17322): 2 is the check digit of 1732 -> true (the READ FIRST example)")
    @Test
    void isValid_Test01() {
        assertEquals(true, CheckDigit.isValid(17322), "getCheck(1732) is 2, and the last digit is 2");
    }

    @DisplayName("isValid(99): the check digit of 9 is 3, not 9 -> false")
    @Test
    void isValid_Test02() {
        assertEquals(false, CheckDigit.isValid(99), "getCheck(9) is 3, but the last digit is 9");
    }

    @DisplayName("isValid(6874257): seven digits, 7 is the check digit of 687425 -> true")
    @Test
    void isValid_Test03() {
        assertEquals(true, CheckDigit.isValid(6874257), "getCheck(687425) is 7");
    }

    @DisplayName("isValid(384629): 9 is the check digit of 38462 -> true")
    @Test
    void isValid_Test04() {
        assertEquals(true, CheckDigit.isValid(384629), "getCheck(38462) is 9");
    }

    @DisplayName("isValid(346): the check digit of 34 is 5, not 6 -> false")
    @Test
    void isValid_Test05() {
        assertEquals(false, CheckDigit.isValid(346), "getCheck(34) is 5, but the last digit is 6");
    }

    @DisplayName("isValid(1000007): 7 is the check digit of 100000 -> true")
    @Test
    void isValid_Test06() {
        assertEquals(true, CheckDigit.isValid(1000007),
            "drop the last digit with / 10 to get 100000, whose check digit is 7");
    }

    @DisplayName("isValid(10): smallest input; the check digit of 1 is 7, not 0 -> false")
    @Test
    void isValid_Test07() {
        assertEquals(false, CheckDigit.isValid(10), "getCheck(1) is 7, but the last digit is 0");
    }
}
