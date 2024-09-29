package SignIn;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

import static org.testng.Assert.assertEquals;

public class SignInTest extends openBrowser {


    @Test
    public void testSuccessfulSignIn() throws InterruptedException {

        SignInPage signInPage = homePage.clickSignInButton();


        signInPage.setEmail("exampl@example.com");
        signInPage.setPassword("Password.1234");


        HomePage homePage = signInPage.clickSignInButton();

        // Thread.sleep(5000);


        assertEquals(homePage.getSIgnInSuccessText(),
                "Welcome, firstname lastname!",
                "Sign In Tst Failed");


    }


}
