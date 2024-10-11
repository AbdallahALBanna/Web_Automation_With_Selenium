package createAccount;

import basics.openBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;

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

        //String outptSuccessMessage = myAccountPage.getAccountSuccessText();
        String outputContactInfo = myAccountPage.getAccountContactInformation();

        driver.navigate().refresh();

//        System.out.println("outputContactInfo= "+ myAccountPage.getAccountContactInformation() );
//        System.out.println("outputContactInf== "+firstname+" "+lastname+"\n"+email);

        // System.out.println("outptSuccessMessage= "+myAccountPage.getAccountSuccessText());
        //        Assert.assertEquals(outptSuccessMessage.trim(),
        //                "Thank you for registering with Main Website Store.",
        //                "new account tst fail");

        Assert.assertEquals(outputContactInfo,
                firstname + " " + lastname + "\n" + email,
                "New account test failed");


        takeScreenshot("CreateAccount_" + email, "Pass");

        myAccountPage.clickDropDownMenuButton();
        HomePage homePage1 = myAccountPage.clickSignOutButton();

    }


}
