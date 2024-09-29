package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private By createAccountSuccessMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAccountSuccessText() {
        return driver.findElement(createAccountSuccessMessage).getText();
    }

}
