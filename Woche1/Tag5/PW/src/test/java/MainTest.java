import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test

    void checkLength_should8() {
        assertTrue(Main.checkLength("jhgfdsaq"));
    }

    @Test
    void checkNumbers_shouldTrue(){
        assertFalse(Main.checkNumbers("jhgfdsaq"));
        assertTrue(Main.checkNumbers("12345678"));
    }
    @Test
    void countNumbers_whenLess2_ShouldFalse(){
        assertFalse(Main.countNumbers(1));
    }
    @Test
    void checkUpperCase_ShouldTrue(){
        assertTrue(Main.checkUpperCase("HAaalloo"));
    }
    @Test
    void checkBadPW_shouldTrue(){
        assertTrue(Main.checkBadPW("12345678", "", "21022001"));
    }
    @Test
    void checkBadPW2_shouldTrue(){
        assertTrue(Main.checkBadPW("Klaus Kinski", "Klaus Kinski", "21022001"));
    }

}