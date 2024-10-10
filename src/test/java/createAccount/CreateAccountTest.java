package createAccount;

import basics.openBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.MyAccountPage;

import static org.testng.AssertJUnit.assertEquals;

public class CreateAccountTest extends openBrowser {


    @Test(dataProvider = "randomUserdataCreator", dataProviderClass = CreateAccountRandomDataProvider.class)
    public void testSuccessfulCreateAccount(String firstname, String lastname, String email, String password) {

        CreateAccountPage createAccountPage = homePage.clickCreateAnAccountButton();


        createAccountPage.setFirstName(firstname);
        createAccountPage.setLastName(lastname);
        createAccountPage.setEmail(email);
        createAccountPage.setPassword(password);
        createAccountPage.setConfirmPassword(password);
        MyAccountPage myAccountPage = createAccountPage.clickCreateAccountButton();
        assertEquals(myAccountPage.getAccountSuccessText(),
                "Thank you for registering with Main Website Store.",
                "new account tst fail");

        System.out.println("aasdaf"+myAccountPage.getAccountSuccessText());
        takeScreenshot("CreateAccount_" + email, "Pass");


    }


}
