package id.ac.ui.cs.advprog.eshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class EshopApplicationTests {

    @SuppressWarnings("unused")
    @Autowired
    private EshopApplication application;

    @Test
    void contextLoads() {
        assertTrue(true, "The context loads successfully");
    }

    @Test
    void testMain() {
        EshopApplication.main(new String[] {});
    }

}
