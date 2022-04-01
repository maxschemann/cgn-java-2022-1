import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    HashMap<String, ArrayList<Product>> orders = new HashMap<>();
    String id;

    Order newOrder = new Order(id);

    void addProductToOrder(Product product) {
        newOrder.addProductToOrder(product);
    }

    void addNewOrderToOrderRepo(Order newOrder) {
        orders.put(newOrder.getId(), newOrder.getProductsInOrder());
    }

    HashMap<String, ArrayList<Product>> listAllOrders() {
        return orders;
    }

    ArrayList<Product> getOrderByID(String id) {
        if (orders.containsKey(id)) {
            return orders.get(id); //get() gibt null, wenn key nicht da
        }
        else {
            System.out.println("ID nicht gefunden. Eingabe wiederholen.");
            return orders.get(id);
        }
    }
}