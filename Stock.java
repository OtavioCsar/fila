import java.util.ArrayList;

public class Stock {
    ArrayList<Product> products = new ArrayList<Product>();
    int stocklimit = 3;

    boolean addToStock(Product product) {
        if (products.size() == stocklimit) {
            return false;
        }
        products.add(product);
        return true;
    }

    void removeFromStock(Product product) {
        products.remove(product);
    }

    void showItems() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));

        }
    }

    boolean stockCheck(Product product) {
        return products.contains(product);
    }
}
