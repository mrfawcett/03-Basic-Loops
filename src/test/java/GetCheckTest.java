import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GetCheckTest {

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

    @DisplayName("getCheck Test 4")
    @Test
    void getCheck_Test04 () {
        int expects = 9;
        int received = CheckDigit.getCheck(38462);
        assertEquals(expects, received);
    }

    @DisplayName("getCheck Test 5")
    @Test
    void getCheck_Test05 () {
        int expects = 5;
        int received = CheckDigit.getCheck(34);
        assertEquals(expects, received);
    }
}