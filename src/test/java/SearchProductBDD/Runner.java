package SearchProductBDD;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/SearchProductBDD",
        glue = {"SearchProductBDD"}
)
public class Runner extends AbstractTestNGCucumberTests {
}

