package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class openBrowser {


    static WebDriver driver = new ChromeDriver();
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {

        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();


//
//        WebElement createAcountButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
//        createAcountButton.click();
//        System.out.println((driver.getTitle()));
        //  driver.quit();

    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
