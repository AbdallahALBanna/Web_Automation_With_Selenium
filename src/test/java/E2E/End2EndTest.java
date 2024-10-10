package E2E;

import basics.openBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class End2EndTest extends openBrowser {

    @Test(priority = 1)
    public void testSuccessfulSignIn() throws IOException {
        SignInPage signInPage = homePage.clickSignInButton();

        signInPage.setEmail("exampl@example.com");
        signInPage.setPassword("Password.1234");

        HomePage homePage = signInPage.clickSignInButton();

        String expectedMessage = "Welcome, firstname lastname!";
        String actualMessage = homePage.getSIgnInSuccessText();

        try {
            assertEquals(actualMessage, expectedMessage, "Sign In Test Failed");
            // Take a screenshot for a successful sign-in
            takeScreenshot("testSuccessfulSignIn", "Pass");
        } catch (AssertionError e) {
            // Take a screenshot for a failed sign-in
            takeScreenshot("testSuccessfulSignIn", "Fail");
            throw e;  // Rethrow to mark the test as failed
        }
    }

    @Test(priority = 2)
    public void testSuccessfulProductSearch() throws IOException {
        SearchResultsPage searchResultsPage = homePage.writeTextInSearchBoxAndClickOk();

        String expectedResult = "Hero Hoodie";
        String actualResult = searchResultsPage.getFirstSearchResultText();

        try {
            assertEquals(actualResult, expectedResult, "Search Test Failed");
            // Take a screenshot for successful search
            takeScreenshot("testSuccessfulProductSearch", "Pass");
        } catch (AssertionError e) {
            // Take a screenshot for a failed search test
            takeScreenshot("testSuccessfulProductSearch", "Fail");
            throw e;
        }

        driver.findElement(searchResultsPage.firstSearchResult).click();
    }

    @Test(priority = 3)
    public void testSuccessfulAddProductToWishList() throws IOException {
        WishListPage wishListPage = homePage.addMessengerBagToWishlist();

        String expectedMessage = "Fusion Backpack has been added to your Wish List. Click here to continue shopping.";
        String actualMessage = wishListPage.getProductAddedToWishListSuccessText();

        try {
            assertEquals(actualMessage, expectedMessage, "Wish List Test Failed");
            // Take a screenshot for a successful wishlist addition
            takeScreenshot("testSuccessfulAddProductToWishList", "Pass");
        } catch (AssertionError e) {
            // Take a screenshot for a failed wishlist addition
            takeScreenshot("testSuccessfulAddProductToWishList", "Fail");
            throw e;
        }
    }

    @Test(priority = 4)
    public void testSuccessfulAddProductToCart() throws IOException {
        ProductPage productPage = homePage.clickProductTitle();

        driver.findElement(productPage.addProductToCartButton).click();

        String expectedSuccessMessage = "You added Push It Messenger Bag to your shopping cart.";
        String actualSuccessMessage = productPage.getProductAddedToCartSuccessText();

        try {
            assertEquals(actualSuccessMessage, expectedSuccessMessage, "Product Added To Cart Test Failed");
            // Take a screenshot for adding product to the cart
            takeScreenshot("testSuccessfulAddProductToCart", "Pass");
        } catch (AssertionError e) {
            // Take a screenshot for a failed add-to-cart test
            takeScreenshot("testSuccessfulAddProductToCart", "Fail");
            throw e;
        }
    }


    @Test(priority = 5)
    public void testSuccessfulBuyProductInCart() throws InterruptedException {
        CheckoutPage checkoutPage = homePage.clickCartAndProceedToCheckoutButton();
        checkoutPage.clickTopRatedShippingRadioButton();
        ReviewAndPaymentPage reviewAndPaymentPage = checkoutPage.clickNextButton();

        ThankYouforPurchasePage thankYouforPurchasePage = reviewAndPaymentPage.clickPlaceOrderButton();

        String expectedOutputMessage = "Thank you for your purchase!";
        String actualOutputMessage = thankYouforPurchasePage.getPurchaseSuccessMessage();

        try {
            // If assertion passes, take a screenshot for success
            Assert.assertEquals(actualOutputMessage, expectedOutputMessage, "Test Buy Product From Cart Failed");
            takeScreenshot("testSuccessfulBuyProductInCart", "Pass");
        } catch (AssertionError e) {
            // If the test fails, take a screenshot in the "Fail" folder
            takeScreenshot("testSuccessfulBuyProductInCart", "Fail");
            throw e;  // Rethrow the exception to mark the test as failed
        }
    }
}

