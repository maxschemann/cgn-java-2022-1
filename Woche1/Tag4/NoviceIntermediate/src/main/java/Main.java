import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
// Novice
public class Main {
    public static void main(String[] args) {
        String namen = "Tim & Max";
        System.out.println(namen);
        nameLoop(namen);
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Namen eingeben: ");
        String name = scan.next();
        insertName(name);
        String[] myNumbersArray = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        int index = 5;
        zahlwoerter(myNumbersArray, index);
        modulo();
        readName(scan);
    }

    public static int nameLoop(String namen) {
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println(namen);
        }
        return i;
    }

    public static boolean greaterThan0(int a) {
        if (a > 0) {
            return true;
        } else return false;
    }

    public static int square(int b) {
        return b * b;
    }

    public static String insertName(String name) {
        System.out.println("Hallo " + name);
        return name;
    }
    // Intermediate

    public static String zahlwoerter(String[] zahlen, int index) {
        if (index < 10 && index > 0) {
            System.out.println(zahlen[index - 1]);
            return zahlen[index - 1];
        } else return "??????";
    }

    public static String modulo() {


        for (int i=1 ; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("#$" + i);
                return "#$";
            } else if (i % 3 == 0) {
                System.out.println("#" + i);
                return "#";
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
                return "$";
            } else {
                System.out.println(i);
            }
        }
        return "fertig";

    }

    public static void readName(Scanner scan){
        String[] nameArray = {};

        String name = scan.nextLine();
        nameArray[0] = name;
        System.out.println(name);
        String name1 = scan.nextLine();

        nameArray[1] = name1;
        System.out.println(name1);
        String name2 = scan.nextLine();
        nameArray[2] = name2;
        System.out.println(name2);

        // Arrays.copyOf benutzen
        // loop solange Eingabe (boolean für abbruch)
    }
}
//  String[] myStringArray = new String[3];
//  String[] myStringArray = {"a", "b", "c"};
//  String[] myStringArray = new String[]{"a", "b", "c"};

