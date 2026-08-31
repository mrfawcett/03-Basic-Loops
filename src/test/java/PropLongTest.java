import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PropLongTest {
    private static final double DELTA = 0.0001;

    @DisplayName("propLong(5): 3 and 5 are long -> 2/5 = 0.4")
    @Test
    void propLong_Test01() {
        assertEquals(0.4, Hailstone.propLong(5), DELTA,
            "of 1..5 only 3 and 5 are long; 2 / 5 must be a double division");
    }

    @DisplayName("propLong(6): 3, 5, 6 are long -> 3/6 = 0.5")
    @Test
    void propLong_Test02() {
        assertEquals(0.5, Hailstone.propLong(6), DELTA, "3 of 6 starting values are long");
    }

    @DisplayName("propLong(1): 1 is not long -> 0.0")
    @Test
    void propLong_Test03() {
        assertEquals(0.0, Hailstone.propLong(1), DELTA,
            "the only starting value is 1, which is not long");
    }

    @DisplayName("propLong(4): only 3 is long -> 1/4 = 0.25")
    @Test
    void propLong_Test04() {
        assertEquals(0.25, Hailstone.propLong(4), DELTA, "1 of 4 starting values is long");
    }

    @DisplayName("propLong(10): 3, 5, 6, 7, 9 are long -> 5/10 = 0.5 (the Javadoc example)")
    @Test
    void propLong_Test05() {
        assertEquals(0.5, Hailstone.propLong(10), DELTA, "5 of 10 starting values are long");
    }

    @DisplayName("propLong(7): 3, 5, 6, 7 are long -> 4/7 = 0.5714...")
    @Test
    void propLong_Test06() {
        assertEquals(4.0 / 7.0, Hailstone.propLong(7), DELTA,
            "4 / 7 is 0 with integer division -- cast or divide by a double");
    }

    @DisplayName("propLong(2): neither 1 nor 2 is long -> 0.0")
    @Test
    void propLong_Test07() {
        assertEquals(0.0, Hailstone.propLong(2), DELTA,
            "both 1 and 2 have length equal to their start, so neither is long");
    }
}
