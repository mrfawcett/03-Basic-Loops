import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckDigitTest {

    @DisplayName("getCheck Test 1")
    @Test
    void getCheck_Test01 () {
        int expects = 2;
        int received = CheckDigit.getCheck(1732);
        assertEquals(expects, received);
    }

    @DisplayName("getCheck Test 2")
    @Test
    void getCheck_Test02 () {
        int expects = 3;
        int received = CheckDigit.getCheck(9);
        assertEquals(expects, received);
    }
    
    @DisplayName("getCheck Test 3")
    @Test
    void getCheck_Test03 () {
        int expects = 7;
        int received = CheckDigit.getCheck(687425);
        assertEquals(expects, received);
    }

    @DisplayName("isValid Test 1")
    @Test
    void isValid_Test01 () {
        boolean expects = true;
        boolean received = CheckDigit.isValid(17322);
        assertEquals(expects, received);
    }

    @DisplayName("isValid Test 2")
    @Test
    void isValid_Test02 () {
        boolean expects = false;
        boolean received = CheckDigit.isValid(99);
        assertEquals(expects, received);
    }

    @DisplayName("isValid Test 3")
    @Test
    void isValid_Test03 () {
        boolean expects = true;
        boolean received = CheckDigit.isValid(6874257);
        assertEquals(expects, received);
    }
}