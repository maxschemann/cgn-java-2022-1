package de.neuefische.cgn221springstudent.repo;

import de.neuefische.cgn221springstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class StudentRepo {
    Map<String, Student> students = new HashMap<>();

    public Student addStudent(Student student) {
        students.put(student.getId() ,student);
        return student;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentRepo that = (StudentRepo) o;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}
