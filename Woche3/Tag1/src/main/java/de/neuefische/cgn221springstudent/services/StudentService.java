package de.neuefische.cgn221springstudent.services;

import de.neuefische.cgn221springstudent.model.Student;
import de.neuefische.cgn221springstudent.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService {

    private final StudentRepo repo;

    @Autowired
    public StudentService(StudentRepo repo){
        this.repo = repo;
    }

    public void addStudent(Student student) {
        repo.addStudent(student);
    }

    public Student getStudentById(String id) {
        return repo.getStudentById(id);
    }

    public Map<String, Student> getAllStudents (){
        return repo.getAllStudents();
    }

    public void deleteStudentByID(String id){
        repo.deleteStudentById(id);
    }



    public void showStudent(){
        Student student= new Student("123","uashfi");
        System.out.println(student);
    }


}
