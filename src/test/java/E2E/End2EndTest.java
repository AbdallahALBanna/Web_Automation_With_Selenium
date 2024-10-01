package E2E;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class End2EndTest extends openBrowser {




    @Test(priority = 1)
    public void testSuccessfulSignIn() throws InterruptedException {

        SignInPage signInPage = homePage.clickSignInButton();


        signInPage.setEmail("exampl@example.com");
        signInPage.setPassword("Password.1234");


        HomePage homePage = signInPage.clickSignInButton();




        assertEquals(homePage.getSIgnInSuccessText(),
                "Welcome, firstname lastname!",
                "Sign In Tst Failed");


    }

    @Test(priority = 2)

    public void testSuccessfulProductSearch() {

        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        assertEquals(searchResultsPage.getFirstSearchResultText(),
                "Hero Hoodie",
                "Search test Failed");

        driver.findElement(searchResultsPage.firstSearchResult).click();


    }


    @Test(priority = 3)

    public void testSuccessfulAddProductToCart() {

        ProductPage productPage = homePage.clickProductTitle();

        driver.findElement(productPage.addProductToCartButton).click();

        assertEquals(productPage.getProductAddedToCartSuccessText(),
                "You added Push It Messenger Bag to your shopping cart.",
                "Product Added To Cart Test Failed");
    }



    @Test (enabled = false)

    public void testSuccessfulAddProductToWishList() {

        WishListPage wishListPage = homePage.addMessengerBagToWishlist();

        SignInPage signInPage = homePage.clickSignInButton();


        signInPage.setEmail("exampl@example.com");
        signInPage.setPassword("Password.1234");


        HomePage homePage = signInPage.clickSignInButton();

        assertEquals(wishListPage.getProductAddedToWishListSuccessText(), "Fusion Backpack has been added to your Wish List. Click here to continue shopping.", "Wish List Test Fail");

    }






}
