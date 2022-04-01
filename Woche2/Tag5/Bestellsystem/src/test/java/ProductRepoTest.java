import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @org.junit.jupiter.api.Test
    void listAllProducts() {
        HashMap<String, Product> testProducts = new HashMap<>();
        Product testProduct1 = new Product("1", "testName1");
        Product testProduct2 = new Product("2", "testName1");
        testProducts.put(testProduct1.getId(), testProduct1);
        testProducts.put(testProduct2.getId(), testProduct2);
        ProductRepo productRepo = new ProductRepo();
        productRepo.products.put(testProduct1.getId(), testProduct1);
        productRepo.products.put(testProduct2.getId(), testProduct2);
        assertEquals(testProducts.toString(), productRepo.products.toString());
    }

    @org.junit.jupiter.api.Test
    void getProduct() {
        HashMap<String, Product> testProducts = new HashMap<>();
        Product testProduct1 = new Product("1", "testName1");
        testProducts.put(testProduct1.id, testProduct1);
        ProductRepo productRepo = new ProductRepo();
        productRepo.products.put(testProduct1.id, testProduct1);
        assertEquals(testProducts.get(1), productRepo.products.get(1));
    }
}