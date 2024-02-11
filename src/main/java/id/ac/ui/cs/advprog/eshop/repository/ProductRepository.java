package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findById(String id) {
        Product product = null;
        for (int i = 0; i < productData.size(); i++) {
            if (productData.get(i).getProductId().equals(id))
                product = productData.get(i);
        }
        return product;
    }

    public Product update(Product updateProduct) {

        for (Product product : productData) {
            if (product.getProductId().equals(updateProduct.getProductId())) {
                if (updateProduct.getProductQuantity() < 0)
                    updateProduct.setProductQuantity(0);

                product.setProductName(updateProduct.getProductName());
                product.setProductQuantity(updateProduct.getProductQuantity());
            }
        }
        return updateProduct;
    }

    public Product delete(String productId) {
        Product deletedProduct = findById(productId);
        productData.remove(deletedProduct);
        return deletedProduct;
    }
}
