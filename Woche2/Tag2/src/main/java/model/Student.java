package model;

import java.util.Objects;

public abstract class Student {
    protected String name;
    protected int id;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public abstract String getName();

    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

}
