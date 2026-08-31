import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IsLongSeqTest {
    @DisplayName("isLongSeq: 2 has length 2, and 2 is not > 2 -> false")
    @Test
    void isLongSeq_Test01() {
        assertEquals(false, Hailstone.isLongSeq(2),
            "length equal to the start is NOT long -- use >, not >=");
    }

    @DisplayName("isLongSeq: 6 has length 9 > 6 -> true")
    @Test
    void isLongSeq_Test02() {
        assertEquals(true, Hailstone.isLongSeq(6), "length 9 is greater than 6");
    }

    @DisplayName("isLongSeq: 7 has length 17 > 7 -> true")
    @Test
    void isLongSeq_Test03() {
        assertEquals(true, Hailstone.isLongSeq(7), "length 17 is greater than 7");
    }

    @DisplayName("isLongSeq: 9 has length 20 > 9 -> true")
    @Test
    void isLongSeq_Test04() {
        assertEquals(true, Hailstone.isLongSeq(9), "length 20 is greater than 9");
    }

    @DisplayName("isLongSeq: 10 has length 7, not > 10 -> false")
    @Test
    void isLongSeq_Test05() {
        assertEquals(false, Hailstone.isLongSeq(10), "length 7 is less than 10");
    }

    @DisplayName("isLongSeq: 1 has length 1, and 1 is not > 1 -> false")
    @Test
    void isLongSeq_Test06() {
        assertEquals(false, Hailstone.isLongSeq(1),
            "the smallest input; length 1 equals the start, so it is not long");
    }
}
