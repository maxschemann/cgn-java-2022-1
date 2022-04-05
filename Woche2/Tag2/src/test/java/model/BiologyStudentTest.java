package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiologyStudentTest {
    BiologyStudent lars = new BiologyStudent("Lars Beispiel", 65432, true);

    @Test
    void getName() {
        lars.setAdress("Straße in Hamburg; 22524 Hamburg");
        assertEquals("Lars Beispiel; Straße in Hamburg; 22524 Hamburg", lars.getAdress());
    }

    @Test
    void identityCardNumber() {
        lars.setIdentityCardNumber(987654);
        assertEquals(987654, lars.getIdentityCardNumber());
    }
}