package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPage {

    public By productAddedToWishListSuccessTest = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    private WebDriver driver;


    public WishListPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductAddedToWishListSuccessText() {

        //Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(productAddedToWishListSuccessTest, "Fusion Backpack has been added to your Wish List. Click here to continue shopping."));
        return driver.findElement(productAddedToWishListSuccessTest).getText();


    }
}
