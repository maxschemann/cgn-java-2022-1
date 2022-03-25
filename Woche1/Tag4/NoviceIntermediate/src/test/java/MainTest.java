import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {

    }

    @Test
    void nameLoop() {
        assertEquals(6, Main.nameLoop("String"));
    }

    @Test
    void greaterThan0() {
        assertFalse(Main.greaterThan0(-1));
        assertTrue(Main.greaterThan0(1));
    }


    @Test
    void square() {
        assertEquals(4, Main.square(2));
    }

   @Test
    void insertName() {
        String name = "Peter";
        assertEquals(name, Main.insertName(name));
    }

    String[] myNumbersArray = {"Eins", "Zwei", "Drei", "Vier", "Fünf","Sechs","Sieben","Acht","Neun","Zehn"};
    @Test
    void zahlwoerter() {
        assertEquals("Fünf", Main.zahlwoerter(myNumbersArray, 5));
    }
}