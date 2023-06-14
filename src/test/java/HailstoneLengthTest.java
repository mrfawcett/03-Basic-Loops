import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class HailstoneLengthTest {
    @DisplayName ("hailstoneLength Test01")
    @Test
    void hailstoneLength_Test01 () {
        int expects = 1;
        int received = Hailstone.hailstoneLength(1);
        assertEquals(expects, received);
    }

    @DisplayName ("hailstoneLength Test02")
    @Test
    void hailstoneLength_Test02 () {
        int expects = 8;
        int received = Hailstone.hailstoneLength(3);
        assertEquals(expects, received);
    }

    @DisplayName ("hailstoneLength Test03")
    @Test
    void hailstoneLength_Test03 () {
        int expects = 3;
        int received = Hailstone.hailstoneLength(4);
        assertEquals(expects, received);
    }
    
    @DisplayName ("hailstoneLength Test04")
    @Test
    void hailstoneLength_Test04 () {
        int expects = 6;
        int received = Hailstone.hailstoneLength(5);
        assertEquals(expects, received);
    }

    @DisplayName ("hailstoneLength Test05")
    @Test
    void hailstoneLength_Test05 () {
        int expects = 17;
        int received = Hailstone.hailstoneLength(7);
        assertEquals(expects, received);
    }
}
