package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;


    private By createAccountButton = By.linkText("Create an Account");
    private By signInButton = By.linkText("Sign In");
    private By signInSUccessMessage = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span");
    private By searchTextBox = By.id("search");

    private By productAtHomeElement = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[6]/div/div/strong/a");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public CreateAccountPage clickCreateAnAccountButton() {
        driver.findElement(createAccountButton).click();
        return new CreateAccountPage(driver);
    }

    public SignInPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new SignInPage(driver);
    }

    public String getSIgnInSuccessText() {

        //Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]"), "Welcome, firstname lastname!"));
        return driver.findElement(signInSUccessMessage).getText();
    }

    public SearchResultsPage writeTextInSearchBoxAndClickOk() {
        driver.findElement(searchTextBox).sendKeys("Hero Hoodie", Keys.ENTER);
        return new SearchResultsPage(driver);
    }

    public ProductPage clickProductTitle() {
        driver.findElement(productAtHomeElement).click();
        return new ProductPage(driver);
    }


}
