import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IsLongSeqTest {
    @DisplayName ("isLongSeq Test01")
    @Test
    void isLongSeq_Test01 () {
        boolean expects = false;
        boolean received = Hailstone.isLongSeq(2);
        assertEquals(expects, received);
    }

    @DisplayName ("isLongSeq Test02")
    @Test
    void isLongSeq_Test02 () {
        boolean expects = true;
        boolean received = Hailstone.isLongSeq(6);
        assertEquals(expects, received);
    }

    @DisplayName ("isLongSeq Test03")
    @Test
    void isLongSeq_Test03 () {
        boolean expects = true;
        boolean received = Hailstone.isLongSeq(7);
        assertEquals(expects, received);
    }

    @DisplayName ("isLongSeq Test04")
    @Test
    void isLongSeq_Test04 () {
        boolean expects = true;
        boolean received = Hailstone.isLongSeq(9);
        assertEquals(expects, received);
    }

    @DisplayName ("isLongSeq Test05")
    @Test
    void isLongSeq_Test05 () {
        boolean expects = false;
        boolean received = Hailstone.isLongSeq(10);
        assertEquals(expects, received);
    }

}
