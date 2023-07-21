package repository;

import java.util.ArrayList;
import java.util.List;
public class ProductRepository {
    List<Product> productList = new ArrayList<>();

    public void addProduct (Product product) {
        productList.add(product);
    }

    public Product getProductById(long id) {
        for (int i=0; i < productList.size(); i++) {
            if (productList.get(i).id == id) {
                return productList.get(i);
            }
        }
        return null;
    }

}
