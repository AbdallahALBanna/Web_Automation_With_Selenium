package SearchProduct;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.SearchResultsPage;

import static org.testng.Assert.assertEquals;

public class SearchProductTest extends openBrowser {


    @Test

    public void testSuccessfulProductSearch(){

        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "Hero Hoodie",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();








    }





}
