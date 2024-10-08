package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private final WebDriver driver;

    private final By firstNameField = By.id("firstname");
    private final By lastNameField = By.id("lastname");
    private final By emailField = By.id("email_address");
    private final By passwordField = By.id("password");
    private final By confirmPasswordField = By.id("password-confirmation");

    private final By createAccountButton = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");


    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public MyAccountPage clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
        return new MyAccountPage(driver);
    }


}
