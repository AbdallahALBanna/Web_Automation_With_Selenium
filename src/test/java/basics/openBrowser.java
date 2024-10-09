package basics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class openBrowser {


    protected static WebDriver driver = new ChromeDriver();
    protected HomePage homePage;



    // Helper method to take a screenshot, with test result (Pass/Fail) as an additional argument
    public void takeScreenshot(String testName, String result) throws IOException {
        // Get the current date and time to make the filename unique
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        // Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        // Call getScreenshotAs method to create an image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // Define the destination directory based on result (Pass/Fail)
        String destinationDir = "src/test/ScreenShots/" + result + "/";
        File dir = new File(destinationDir);

        // Check if directory exists, create it if not
        if (!dir.exists()) {
            dir.mkdirs(); // Creates all non-existent parent directories
        }

        // Define the full path for the screenshot file
        String destinationPath = destinationDir + testName + "_" + timestamp + ".png";

        // Move the file to the destination
        FileHandler.copy(srcFile, new File(destinationPath));

        System.out.println("Screenshot saved at: " + destinationPath);
    }












    @BeforeClass
    public void setUp() {

        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//
//        WebElement createAcountButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
//        createAcountButton.click();
//        System.out.println((driver.getTitle()));
        //  driver.quit();

    }


//    @AfterMethod
//    public void goHome() throws InterruptedException {
//        driver.get("https://magento.softwaretestingboard.com/");
//        Thread.sleep(5000);
//    }







    @AfterClass
    public void tearDown() {
        // driver.quit();
    }



}
