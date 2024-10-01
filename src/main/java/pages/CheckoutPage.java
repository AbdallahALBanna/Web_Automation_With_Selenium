package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
    private final WebDriver driver;


    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    private final By streetAddressField = By.name("street[0]");
    private final By cityField = By.name("city");
    private final By stateField = By.className("select");
    private final By postalCodeField = By.name("postcode");
    private final By phoneNumberField = By.name("telephone");
    private final By topRatedShippingRadioButton =By.name("ko_unique_1");
    private final By nextButton = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");



    public void setStreetAddress(String streetAddress){
        driver.findElement(streetAddressField).sendKeys(streetAddress);
    }

    public void setCity(String city){
        driver.findElement(cityField).sendKeys(city);
    }

    public void setState() {

        driver.findElement(stateField).sendKeys(Keys.ENTER,"T",Keys.ENTER);



}

    public void setPostalCode(String postalCode){
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void setPhoneNumber(String phoneNumber)
    {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickTopRatedShippingRadioButton()
    {
        driver.findElement(topRatedShippingRadioButton).click();
    }

    public ReviewAndPaymentPage clickNextButton()
    {
        driver.findElement(nextButton).click();
        return new ReviewAndPaymentPage(driver);
    }



}
