import java.util.HashMap;

public class ProductRepo {

    HashMap<String, Product> products = new HashMap<>();

    public void main(String[] args) {
        products.put("OrderID1", new Product("ProductID1","Test1"));
        products.put("OrderID2", new Product("ProductID2","Test1"));
    }

    HashMap<String, Product> listAllProducts() {
        System.out.println(this.toString());
        return products;
    }

    Product getProductByID(String id) {
       if (products.containsKey(id)){
           return products.get(id);
       }
       else {
           System.out.println("ID nicht gefunden. Eingabe wiederholen.");
           return products.get(id);
       }
    }

    void addProductToRepo (Product product){
        products.put(product.getId(), product);
    }

    @Override
    public String toString() {

        return "Products:" + products;
    }
}
