package de.neuefische.cgn221springstudent.repo;

import de.neuefische.cgn221springstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentRepo {
    Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId() ,student);
    }
    public Student getStudentById (String id){
       return students.get(id);
    }

    public Map<String, Student> getAllStudents (){
        return students;
    }

    public void deleteStudentById (String id){
        students.remove(id);
    }

    @Override
    public String toString() {
        return "StudentRepo{" +
                "students=" + students +
                '}';
    }
}
