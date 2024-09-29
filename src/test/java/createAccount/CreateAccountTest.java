package createAccount;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.MyAccountPage;

import static org.testng.Assert.assertEquals;

public class CreateAccountTest extends openBrowser {


    @Test
    public void testSuccessfulCreateAccount() {
        CreateAccountPage createAccountPage = homePage.clickCreateAnAccountButton();

        createAccountPage.setFirstName("firstname");
        createAccountPage.setLastName("lastname");
        createAccountPage.setEmail("exampl@example.com");
        createAccountPage.setPassword("Password.1234");
        createAccountPage.setConfirmPassword("Password.1234");
        MyAccountPage myAccountPage = createAccountPage.clickCreateAccountButton();
        assertEquals(myAccountPage.getAccountSuccessText(),
                "Thank you for registering with Main Website Store.",
                "new account test fail");

    }


}
