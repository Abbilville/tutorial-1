package id.ac.ui.cs.advprog.eshop.functional;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@ExtendWith(SeleniumJupiter.class)
public class CreateProductFunctionalTest {
    /**
     * The port number assigned to the running application during test execution.
     * Set automatically during each test run by Spring Framework's test context.
     */
    @LocalServerPort
    private int serverPort;

    /**
     * The base URL for testing. Default value to {@code http://localhost}.
     */
    @Value("${app.baseUrl:http://localhost}")
    private String testBaseUrl;

    private String baseUrl;

    @BeforeEach
    void setUp() {
        baseUrl = String.format("%s:%d/product/list", testBaseUrl, serverPort);
    }

    @Test
    void pageTitle_isCorrect(ChromeDriver driver) throws Exception {
        // Exercise
        driver.get(testBaseUrl + ":" + serverPort + "/product/create");
        String pageTitle = driver.getTitle();

        // Verify
        assertEquals("Create New Product", pageTitle);
    }

    @Test
    void listMessage_createProductPage_isCorrect(ChromeDriver driver) throws Exception {
        // Exercise
        driver.get(testBaseUrl + ":" + serverPort + "/product/create");
        String welcomeMessage = driver.findElement(By.tagName("h3")).getText();

        // Verify
        assertEquals("Create New Product", welcomeMessage);
    }

    @Test
    void addProduct_isCorrect(ChromeDriver driver) throws Exception {
        // Exercise
        driver.get(testBaseUrl + ":" + serverPort + "/product/create");

        driver.findElement(By.id("nameInput")).sendKeys("New Product");
        driver.findElement(By.id("quantityInput")).sendKeys("50");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        driver.get(baseUrl);

        // Verify
        WebElement productList = driver.findElement(By.tagName("body"));
        assertTrue(productList.getText().contains("New Product"));
        assertTrue(productList.getText().contains("50"));
    }
}