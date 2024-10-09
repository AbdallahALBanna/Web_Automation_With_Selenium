package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThankYouforPurchasePage {

    private WebDriver driver;

    public ThankYouforPurchasePage(WebDriver driver){
        this.driver=driver;
    }

    public By purchaseSuccessMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");


    public String getPurchaseSuccessMessage() {

        //Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(purchaseSuccessMessage, "Thank you for your purchase!"));
        return driver.findElement(purchaseSuccessMessage).getText();
    }
}
