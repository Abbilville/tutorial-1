package id.ac.ui.cs.advprog.eshop.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeControllerTest {

    @Test
    void testHomePage() {
        HomeController homeController = new HomeController();
        String viewName = homeController.homePage();
        assertEquals("HomePage", viewName);
    }
}