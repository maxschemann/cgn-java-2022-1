package model;

public class ComputerScienceStudent extends Student{
    String specialization;

    public ComputerScienceStudent(String name, int id, String specialization) {
        super(name, id);
       this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "specialization='" + specialization + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public String getName() {
        return this.name + " is a Computer Science Student.";
    }
}
