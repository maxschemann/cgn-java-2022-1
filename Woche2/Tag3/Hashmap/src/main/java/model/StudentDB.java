package model;


import java.util.HashMap;
import java.util.Map;

public class StudentDB {

    public Map<Integer, Student> studentList = new HashMap<>();


    public StudentDB() {
    }


    public void addStudent (Student student){
        studentList.put(student.id, student);
    }

    public void removeStudent (Student student){
        studentList.remove(student.id);
    }

    public Map<Integer, Student> showStudents (){
        return studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDB studentDB = (StudentDB) o;

        return studentList.equals(studentDB.studentList);
    }

    @Override
    public int hashCode() {
        return studentList.hashCode();
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentList=" + studentList +
                '}';
    }



/*  ALTER CODE MIT ArrayList
    Student student = new Student("Peter", 2345);
    ArrayList<Student> studentList = new ArrayList<Student>();
    public static ArrayList<Student> main (Student student,ArrayList<Student> studentList){
        studentList.add(student);
        return studentList;
    }
    public static Student getStudent(ArrayList<Student>studentlist, int i){
        return studentlist.get(i);
    }
    public static ArrayList<Student> removeStudent (Student student, ArrayList<Student> studentList){
        studentList.remove(student);
        return studentList;
    }



    public StudentDB(String name, int id) {
        super(name, id);
    }

    newArrayList StudentDB (Student[] insertArray) {
        this.students = insertArray;
    }
    public Student[] getStudents(){
        return students;
    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
    */

}
