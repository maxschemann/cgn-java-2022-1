import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void addNewOrderToOrderRepo() {
        // Testing both Order.addProductToOrder and OrderRepo.addNewOrderToOrderRepo

        //create testOrder with testProducts
        Product testProduct1 = new Product("testProductID1", "testProductName1");
        Product testProduct2 = new Product("testProductID2", "testProductName2");
        Order testOrder = new Order("testOrderID1");
        testOrder.addProductToOrder(testProduct1);
        testOrder.addProductToOrder(testProduct2);

        //create new Hashmap and add testOrder
        HashMap<String, ArrayList<Product>> testOrders = new HashMap<>();
        testOrders.put(testOrder.getId(), testOrder.getProductsInOrder());

        //create new OrderRepo and call addNewOrderToOrderRepo
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.addNewOrderToOrderRepo(testOrder);

        //assertEquals
        assertEquals(testOrders, orderRepo.orders);
    }

    @Test
    void searchForExistingID() {

    }
}