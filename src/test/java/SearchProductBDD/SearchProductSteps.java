package SearchProductBDD;

import basics.openBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchResultsPage;

import static basics.openBrowser.driver;
import static basics.openBrowser.homePage;
import static org.testng.Assert.assertEquals;


public class SearchProductSteps {


    SearchResultsPage searchResultsPage;

    @Given("I am guest on the home page of the store")
    public void i_am_guest_on_the_home_page_of_the_store() {
        openBrowser.setUp();

    }

    @When("I search a vailed product")
    public void i_search_a_vailed_product() {

        searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();


    }

    @Then("I should see it in the search results")
    public void i_should_see_it_in_the_search_results() {

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "Hero Hoodie",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();

    }

}
