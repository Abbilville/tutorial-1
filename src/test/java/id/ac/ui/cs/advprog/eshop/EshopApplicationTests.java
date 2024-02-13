package id.ac.ui.cs.advprog.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class EshopApplicationTests {

    @Autowired
    private EshopApplication application;

    @Test
    void contextLoads() {
        assertTrue(true, "The context loads successfully");
    }

    @Test
    void testMain() {
        application.main(new String[] {});
    }

}
