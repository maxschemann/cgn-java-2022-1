package de.neuefische.cgn221springstudent.services;

import de.neuefische.cgn221springstudent.model.Student;
import de.neuefische.cgn221springstudent.repo.StudentRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {
    StudentService actualService = new StudentService(new StudentRepo());
    StudentRepo mockRepo = mock(StudentRepo.class);
    Student student1 = new Student("1", "Peter");
    @Test
    void addStudent() {
        //given
        Student actual = actualService.addStudent(student1);
        //when
        when(mockRepo.addStudent(student1)).thenReturn(student1);
        //then
        Student expected = mockRepo.addStudent(student1);
        verify(mockRepo).addStudent(student1);
        assertEquals(expected, actual);
    }

    @Test
    void getStudentById() {
        actualService.addStudent(student1);
        Student actual = actualService.getStudentById("1");
        when(mockRepo.getStudentById("1")).thenReturn(student1);
        assertEquals(mockRepo.getStudentById("1"),actual);
    }

    @Test
    void getAllStudents() {
        
    }

    @Test
    void deleteStudentByID() {
    }

    @Test
    void showStudent() {
    }
}