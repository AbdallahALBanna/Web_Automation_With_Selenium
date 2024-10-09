package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReviewAndPaymentPage {

    private final WebDriver driver;

    public ReviewAndPaymentPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By reviewAndPaymentButton = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button");

    private final By palceOrderButton = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button");
    private final By loader = By.xpath("/html/body/div[1]/div/img");


    public ThankYouforPurchasePage clickReviewAndPaymentButton(){
        driver.findElement(reviewAndPaymentButton).click();
        return new ThankYouforPurchasePage(driver);


    }

    public ThankYouforPurchasePage clickPlaceOrderButton() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.attributeToBe(By.tagName("body"), "aria-busy", "false"));
//
//        //wait.until(ExpectedConditions.elementToBeClickable(palceOrderButton));
//
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait1.until(ExpectedConditions.invisibilityOfElementLocated(loader));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait2.until(ExpectedConditions.elementToBeClickable(palceOrderButton));


        driver.findElement(palceOrderButton).click();
        return new ThankYouforPurchasePage(driver);


    }


}
