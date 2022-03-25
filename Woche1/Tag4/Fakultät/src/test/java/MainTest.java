import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void faculty() {

        assertEquals(6, Main.faculty(3));
        assertEquals(24, Main.faculty(4));
        assertEquals(1, Main.faculty(0));
    }
}