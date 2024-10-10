package SignIn;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

import static org.testng.Assert.assertEquals;

public class SignInTest extends openBrowser {


    @Test(dataProvider = "sginInExcelDataProvider", dataProviderClass = SignInExcelDataProvider.class)
    public void testSuccessfulSignIn(String firstname, String lastname, String email, String password) {

        SignInPage signInPage = homePage.clickSignInButton();

//        signInPage.setEmail("exampl@example.com");
//        signInPage.setPassword("Password.1234");

        signInPage.setEmail(email);
        signInPage.setPassword(password);

        HomePage homePage = signInPage.clickSignInButton();

        assertEquals(homePage.getSIgnInSuccessText(),
                "Welcome, " + firstname + " " + lastname + "!",
                "Sign In Tst Failed");


    }


}
