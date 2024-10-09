package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    public By firstSearchResult = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a");
    private final WebDriver driver;


    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstSearchResultText() {

        //Wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]"), "Welcome, firstname lastname!"));
        return driver.findElement(firstSearchResult).getText();
    }


}
