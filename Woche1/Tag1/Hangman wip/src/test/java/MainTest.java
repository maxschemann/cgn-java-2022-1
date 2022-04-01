import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkInput_whenMatch_ShouldTrue() {
        assertTrue(Main.checkInput("e"));
    }
    @Test
    void checkInput_whenWrong_ShouldFalse(){
        assertFalse(Main.checkInput("t"));
    }
    @Test
    void countTries_whenWrong_shouldPlusOne(){
        assertEquals(3, Main.countWrongTries(2, true));
    }
}