import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class IsValidTest {

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

    @DisplayName("isValid Test 4")
    @Test
    void isValid_Test04 () {
        boolean expects = true;
        boolean received = CheckDigit.isValid(384629);
        assertEquals(expects, received);

    }

    @DisplayName("isValid Test 5")
    @Test
    void isValid_Test05 () {
        boolean expects = false;
        boolean received = CheckDigit.isValid(346);
        assertEquals(expects, received);
    }
}