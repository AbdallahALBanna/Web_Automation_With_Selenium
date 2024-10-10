package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    private final WebDriver driver;
    public By addProductToCartButton = By.id("product-addtocart-button");
    public By productAddedToCartSuccessText = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getProductAddedToCartSuccessText() {

        //Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"), "You added Push It Messenger Bag to your "));
        return driver.findElement(productAddedToCartSuccessText).getText();
    }
}
