package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private  WebDriver driver;
    private By createAccountButton = By.linkText("Create an Account");

    public HomePage(WebDriver driver ) {
        this.driver=driver;


    }
    public  CreateAccountPage  clickCreateAnAccountButton () {
        driver.findElement(createAccountButton).click();

        return new CreateAccountPage(driver);
    }
}
