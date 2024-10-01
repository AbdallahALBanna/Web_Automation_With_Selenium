package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewAndPaymentPage {

    private  WebDriver driver;

    private  By reviewAndPaymentButton = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button");

    public ReviewAndPaymentPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public ThankYouforPurchasePage clickReviewAndPaymentButton(){
        driver.findElement(reviewAndPaymentButton).click();
        return new ThankYouforPurchasePage(driver);


    }


}
