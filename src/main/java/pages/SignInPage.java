package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private final WebDriver driver;

    private final By emailField = By.id("email");
    private final By passwordField = By.id("pass");

    private final By signInButton = By.id("send2");


    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement((passwordField)).sendKeys(password);
    }

    public HomePage clickSignInButton() {
        driver.findElement(signInButton).click();


        return new HomePage(driver);
    }

}
