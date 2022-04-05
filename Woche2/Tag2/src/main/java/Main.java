import model.BiologyStudent;
import model.ComputerScienceStudent;
import smartphone.Contact;
import smartphone.Friend;
import smartphone.Smartphone;

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent hannes = new ComputerScienceStudent("Hannes Hanson", 234, "Computer Science");
        System.out.println(hannes);
        System.out.println(hannes.getName());

        BiologyStudent anna = new BiologyStudent("Anna Muster", 345, false);
        System.out.println(anna);

        // setter vom Array
        // toString
        Contact a = new Friend("Best Friend", "12345");
        Contact[] oneContacts = {a, new Friend("2nd Best Friend", "2345")};
        Smartphone one = new Smartphone("3", "Fairphone", oneContacts);
        System.out.println(one);
    }
}
