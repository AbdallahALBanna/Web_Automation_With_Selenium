package BuyProductsInCart;

import basics.openBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class BuyProductInCartTest extends openBrowser {


    @Test(priority = 1)
    public void testSuccessfulSignIn() throws InterruptedException {

        SignInPage signInPage = homePage.clickSignInButton();

        signInPage.setEmail("exampl@example.com");
        signInPage.setPassword("Password.1234");

        HomePage homePage = signInPage.clickSignInButton();

        assertEquals(homePage.getSIgnInSuccessText(),
                "Welcome, firstname lastname!",
                "Sign In Tst Failed");
        driver.get("https://magento.softwaretestingboard.com/");

    }


    @Test(priority = 2)
    public void testSuccessfulBuyProductInCart() throws InterruptedException, IOException {
        CheckoutPage checkoutPage = homePage.clickCartAndProceedToCheckoutButton();
        checkoutPage.clickTopRatedShippingRadioButton();
        ReviewAndPaymentPage reviewAndPaymentPage = checkoutPage.clickNextButton();


        ThankYouforPurchasePage thankYouforPurchasePage = reviewAndPaymentPage.clickPlaceOrderButton();

        String expextedOutputMessage = "Thank you for your purchase!";
        String actualOutputMessage = thankYouforPurchasePage.getPurchaseSuccessMessage();
        assertEquals(actualOutputMessage,
                expextedOutputMessage,
                "Test Buy Product From Card Failed");


        try {
            Assert.assertEquals(actualOutputMessage, expextedOutputMessage, "Test Buy Product From Card Failed");

            // If assertion is successful, take a screenshot in "Pass" folder
            takeScreenshot("testSuccessfulBuyProductInCart", "Pass");
        } catch (AssertionError e) {
            // If assertion fails, take a screenshot in "Fail" folder
            takeScreenshot("testSuccessfulBuyProductInCart", "Fail");
            throw e;  // Rethrow the exception to mark the test as failed
        }

    }


        //    @Test(priority = 2)
    //
    //
    //    public void testSuccessfulBuyProductInCart() throws InterruptedException {
    //        CheckoutPage checkoutPage = homePage.clickCartAndProceedToCheckoutButton();
    //Thread.sleep(10000);
    //        checkoutPage.setStreetAddress("Abdallah Albanna st. Alexandria ");
    //        checkoutPage.setCity("Alexandria");
    //        checkoutPage.setState();
    //        checkoutPage.setPostalCode("12345");
    //        checkoutPage.setPhoneNumber("0123456789");
    //        checkoutPage.clickTopRatedShippingRadioButton();
    //        checkoutPage.clickNextButton();
    //        Thread.sleep(10000);
    //        ReviewAndPaymentPage reviewAndPaymentPage = checkoutPage.clickNextButton();
    //        reviewAndPaymentPage.clickReviewAndPaymentButton();


}
