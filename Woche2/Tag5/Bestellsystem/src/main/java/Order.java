import java.util.ArrayList;
import java.util.HashMap;

public class Order {
    private String id;
    private ArrayList <Product> productsInOrder=new ArrayList<>();

    Order(String id){
        this.id =id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Product> getProductsInOrder() {
        return productsInOrder;
    }

    public void setProductsInOrder(ArrayList<Product> productsInOrder) {
        this.productsInOrder = productsInOrder;
    }

    void addProductToOrder (Product product){
        productsInOrder.add(product);
    }
}
