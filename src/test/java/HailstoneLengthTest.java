import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class HailstoneLengthTest {
    @DisplayName("hailstoneLength: starting at 1 the sequence is just [1] -> length 1")
    @Test
    void hailstoneLength_Test01() {
        assertEquals(1, Hailstone.hailstoneLength(1),
            "n = 1 stops immediately; the one term still counts");
    }

    @DisplayName("hailstoneLength: 3 -> 3,10,5,16,8,4,2,1 -> length 8")
    @Test
    void hailstoneLength_Test02() {
        assertEquals(8, Hailstone.hailstoneLength(3), "3, 10, 5, 16, 8, 4, 2, 1");
    }

    @DisplayName("hailstoneLength: 4 -> 4,2,1 -> length 3")
    @Test
    void hailstoneLength_Test03() {
        assertEquals(3, Hailstone.hailstoneLength(4), "4, 2, 1");
    }

    @DisplayName("hailstoneLength: 5 -> 5,16,8,4,2,1 -> length 6 (the READ FIRST example)")
    @Test
    void hailstoneLength_Test04() {
        assertEquals(6, Hailstone.hailstoneLength(5), "5, 16, 8, 4, 2, 1");
    }

    @DisplayName("hailstoneLength: 7 -> length 17")
    @Test
    void hailstoneLength_Test05() {
        assertEquals(17, Hailstone.hailstoneLength(7),
            "7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1");
    }

    @DisplayName("hailstoneLength: 6 -> 6,3,10,5,16,8,4,2,1 -> length 9")
    @Test
    void hailstoneLength_Test06() {
        assertEquals(9, Hailstone.hailstoneLength(6),
            "6 is even, so it drops to 3 and then follows 3's sequence");
    }

    @DisplayName("hailstoneLength: 27 takes a long ride -> length 112")
    @Test
    void hailstoneLength_Test07() {
        assertEquals(112, Hailstone.hailstoneLength(27),
            "27 climbs as high as 9232 before falling to 1; the loop must keep going until n == 1");
    }
}
