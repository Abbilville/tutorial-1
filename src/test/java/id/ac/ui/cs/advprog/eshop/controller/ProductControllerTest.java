package id.ac.ui.cs.advprog.eshop.controller;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @Mock
    private Model model;

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product();
        product.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product.setProductName("Pulpen Kokoro");
        product.setProductQuantity(100);
    }

    @Test
    public void testCreateProductPage() {
        String viewName = productController.createProductPage(model);

        assertEquals("CreateProduct", viewName);
        verify(model).addAttribute(eq("product"), any(Product.class));
    }

    @Test
    public void testCreateProductPost() {
        String redirectURL = productController.createProductPost(product, model);

        assertEquals("redirect:/product/list", redirectURL);
        verify(productService).create(product);
    }

    @Test
    public void testProductListPage() {
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        when(productService.findAll()).thenReturn(productList);

        String viewName = productController.productListPage(model);

        assertEquals("ListProduct", viewName);
        verify(model).addAttribute("products", productList);
    }

    @Test
    public void testEditProductPage() {
        String productId = "eb558e9f-1c39-460e-8860-71af6af63bd6";
        when(productService.findById(productId)).thenReturn(product);

        String viewName = productController.editProductPage(model, productId);

        assertEquals("EditProduct", viewName);
        verify(model).addAttribute("product", product);
    }

    @Test
    public void testEditProductPut() {
        String redirectURL = productController.editProductPut(product);

        assertEquals("redirect:list", redirectURL);
        verify(productService).update(product);
    }

    @Test
    public void testDeleteProduct() {
        String productId = "eb558e9f-1c39-460e-8860-71af6af63bd6";

        String redirectURL = productController.deleteProduct(productId);

        assertEquals("redirect:../list", redirectURL);
        verify(productService).delete(productId);
    }
}