package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private final WebDriver driver;
    private final By createAccountSuccessMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div");
    private final By createAccountGetContactInfo = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div/div[1]");
    private final By dropDownMenuButton = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    private final By signOutButton = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

//    public String getAccountSuccessText() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(createAccountSuccessMessage));
//        return driver.findElement(createAccountSuccessMessage).getText().trim();
//    }

    public String getAccountContactInformation() {
        return driver.findElement(createAccountGetContactInfo).getText();
    }

    public void clickDropDownMenuButton() {
        driver.findElement(dropDownMenuButton).click();

    }

    public HomePage clickSignOutButton() {
        driver.findElement(signOutButton).click();
        return new HomePage(driver);
    }

}
