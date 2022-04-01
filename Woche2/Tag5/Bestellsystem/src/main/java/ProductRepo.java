import java.util.HashMap;

public class ProductRepo {
    HashMap<String, Product> products = new HashMap<>();

    HashMap<String, Product> listAllProducts() {
        return products;
    }

    Product getProduct(String id) {
        return products.get(id);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
