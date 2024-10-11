package basics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class openBrowser {

    protected static WebDriver driver;
    protected HomePage homePage;


    // Helper method to take a screenshot
    public void takeScreenshot(String testName, String result) {
        try {
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
            String destinationDir = "src/test/ScreenShots/" + result + "/";
            File dir = new File(destinationDir);

            if (!dir.exists()) {
                dir.mkdirs();
            }

            String destinationPath = destinationDir + testName + "_" + timestamp + ".png";
            FileHandler.copy(srcFile, new File(destinationPath));
            System.out.println("Screenshot saved at: " + destinationPath);
        } catch (IOException e) {
            System.err.println("Failed to capture screenshot: " + e.getMessage());
        }
    }

    @BeforeClass
    public void setUp() {
        // To add Extension to Chrome Automated Browser
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/Stands AdBlocker - Chrome Web Store 2.1.24.0.crx"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);

        // Wait for the new tab to open
        String originalTab = driver.getWindowHandle(); // Store the original tab handle
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab); // Switch to the new tab
                break;
            }
        }

        // Close the new tab
        driver.close();

        // Switch back to the original tab
        driver.switchTo().window(originalTab);

    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://magento.softwaretestingboard.com/");

    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            System.out.println("Browser closed successfully.");
//        }
//    }


}
