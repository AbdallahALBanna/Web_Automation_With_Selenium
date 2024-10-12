package SearchProduct;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.SearchResultsPage;

import static org.testng.Assert.assertEquals;

public class SearchProductTest extends openBrowser {


    @Test(priority =1)
    public void testSuccessfulProductSearch() {

        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "Hero Hoodie",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();

    }

    @Test(priority = 2)
    public void testFailProductSearch() {

        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "dyjkdy",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();

    }

    @Test(priority = 2)
    public void testFailProductSearch1() {

        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "dyjkdy",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();

    }

    @Test(priority = 2)
    public void testFailProductSearch2() {

        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "dyjkdy",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();

    }

    @Test(priority = 2)
    public void testFailProductSearch3() {

        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "dyjkdy",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();

    }


}
