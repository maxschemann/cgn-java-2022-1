import model.Student;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Student hannes = new Student("Hannes von den Ochsen", 234);
    Student lisa = new Student("Lisa Lange", 234);
    @org.junit.jupiter.api.Test
    void testEquals_shouldTrue() {
        assertEquals(hannes.id, lisa.id);
    }
}