import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShopService {
    public static void main(String[] args) {


mainMenu();
if (mainMenu()==1) {
    System.out.println(listAllProducts());
    System.out.println("Bitte Produkt auswählen.");
    Scanner scan = new Scanner(System.in);
    String id = scan.nextLine();
    System.out.println(getProductByID(id));
}

    }
    public static int mainMenu() {

        System.out.println("Bitte auswählen: [1] Produkte [2] Bestellungen");
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        try {
            selection = scan.nextInt();
            Exception wrongNumber = new ArrayIndexOutOfBoundsException("Bitte [1] oder [2] auswählen");
            if (selection<1 || selection>2) throw wrongNumber;
        } catch (Exception e) {
            System.out.println(e);
        }
        return selection;
    }

    public static HashMap<String, Product> listAllProducts(){
        ProductRepo products = new ProductRepo();
        return products.listAllProducts();
    }
    public static Product getProductByID (String id){
        ProductRepo products = new ProductRepo();
        return products.getProductByID(id);
    }
    public static HashMap<String, ArrayList<Product>> listAllOrders () {
        OrderRepo orders = new OrderRepo();
        return orders.listAllOrders();
    }
    public static ArrayList<Product> getOrderByID (String id){
        OrderRepo orders = new OrderRepo();
        return orders.getOrderByID(id);
    }
}
