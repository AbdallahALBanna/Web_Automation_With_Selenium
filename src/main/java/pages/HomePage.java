package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;


    private final By createAccountButton = By.linkText("Create an Account");
    private final By signInButton = By.linkText("Sign In");
    private final By signInSUccessMessage = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span");
    private final By searchTextBox = By.id("search");

    private final By productAtHomeElement = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[6]/div/div/strong/a");


    private final By messengerBagHome = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img");


    private final By showCartButton = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    private final By proceedToCheckoutButton = By.xpath("//*[@id=\"top-cart-btn-checkout\"]");


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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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


    public WishListPage addMessengerBagToWishlist() {


        WebElement element = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/div/strong/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        WebElement wishlistIcon = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/div/div[3]/div/div[2]/a[1]"));
        wishlistIcon.click();

        return new WishListPage(driver);

    }


    public CheckoutPage clickCartAndProceedToCheckoutButton() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(showCartButton));


        driver.findElement(showCartButton).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));

        driver.findElement(proceedToCheckoutButton).click();
        return new CheckoutPage(driver);
    }


}
