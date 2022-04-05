import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShopService {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        int selection=0;
        while (selection != 1 && selection != 2) {
            System.out.println("Bitte auswählen: [1] Produkte [2] Bestellungen");
            Scanner scan = new Scanner(System.in);
            try {
                selection = scan.nextInt();}
             catch (Exception e) {System.out.println("Nur Zahlen erlaubt."); mainMenu();
            }
            if (selection != 1 && selection != 2){System.out.println("Ungültige Eingabe");
        }}
        if (selection == 1) {
            System.out.println("listAllProducts()");
        } else if (selection == 2) {System.out.println("listAllOrders");}

    }

/*
    public static boolean checkSelection(){
        try {
            //Exception wrongNumber = new ArrayIndexOutOfBoundsException();
            if (selection < 1 || selection > 2) throw new Exception();//wrongNumber;
        }
        catch (Exception e) {
            System.out.println("Bitte [1] oder [2] eingeben" +e);
        }
*/



    public static HashMap<String, Product> listAllProducts() {
        ProductRepo products = new ProductRepo();
        return products.listAllProducts();
    }

    public static Product getProductByID(String id) {
        ProductRepo products = new ProductRepo();
        return products.getProductByID(id);
    }

    public static HashMap<String, ArrayList<Product>> listAllOrders() {
        OrderRepo orders = new OrderRepo();
        return orders.listAllOrders();
    }

    public static ArrayList<Product> getOrderByID(String id) {
        OrderRepo orders = new OrderRepo();
        return orders.getOrderByID(id);
    }
}
