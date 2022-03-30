package model;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {


    @Test
    void addStudent() {
        //given:
        StudentDB studentDB = new StudentDB();
        Student student = new Student("Peter", 2345);
        //when:
        studentDB.addStudent(student);
        //then
        Map <Integer, Student> actual = studentDB.studentList;  // vorher: "... = studentDB.showStudents();" nachher: private studentList geändert public, sodass studentList hier aufrufbar ist --> ist 'private' best practice wg. Sicherheit/ Komplexität?
        HashMap<Integer, Student> expected = new HashMap<>();  // expected ist leere Hashmap
        expected.put(student.id, student);                      // d.h.
        assertEquals(expected, actual);                         // kann der Vergleich klappen, wenn bereits Einträge in 'studentList'?
    }

    @Test
    void testAddStudent() {
    }

    @Test
    void removeStudent() {
    }

    @Test
    void showStudents() {
    }
}