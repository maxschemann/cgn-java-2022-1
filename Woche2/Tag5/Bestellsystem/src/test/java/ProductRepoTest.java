import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @org.junit.jupiter.api.Test
    void listAllProducts() {
        HashMap<String, Product> products = new HashMap<>();
        Product testProduct1 = new Product("1", "testName1");
        Product testProduct2 = new Product("2", "testName1");
        products.put(testProduct1.getId(), testProduct1);
        products.put(testProduct2.getId(), testProduct2);
    }

    @org.junit.jupiter.api.Test
    void getProduct() {
    }
}