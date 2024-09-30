package AddToWishList;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import pages.WishListPage;

import static org.testng.Assert.assertEquals;

public class AddProductToWishListTest extends openBrowser {

    @Test

    public void testSuccessfulAddProductToWishList(){

        WishListPage wishListPage = homePage.addMessengerBagToWishlist();

        SignInPage signInPage = homePage.clickSignInButton();


        signInPage.setEmail("exampl@example.com");
        signInPage.setPassword("Password.1234");


        HomePage homePage = signInPage.clickSignInButton();

        assertEquals(wishListPage.getProductAddedToWishListSuccessText(),"Fusion Backpack has been added to your Wish List. Click here to continue shopping.","Wish List Test Fail");



    }

}
