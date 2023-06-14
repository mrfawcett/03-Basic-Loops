import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PropLongTest {

    @DisplayName ("propLong Test01")
    @Test
    void propLong_Test01 () {
        double expected = 0.4;
        double received = Hailstone.propLong(5);
        assertEquals(expected, received);
    }

    @DisplayName ("propLong Test02")
    @Test
    void propLong_Test02 () {
        double expected = 0.5;
        double received = Hailstone.propLong(6);
        assertEquals(expected, received);
    }
    
    @DisplayName ("propLong Test03")
    @Test
    void propLong_Test03 () {
        double expected = 0.0;
        double received = Hailstone.propLong(1);
        assertEquals(expected, received);
    }
    
    @DisplayName ("propLong Test04")
    @Test
    void propLong_Test04 () {
        double expected = 0.25;
        double received = Hailstone.propLong(4);
        assertEquals(expected, received);
    }
    
    @DisplayName ("propLong Test05")
    @Test
    void propLong_Test05 () {
        double expected = 0.5;
        double received = Hailstone.propLong(10);
        assertEquals(expected, received);
    }
}
