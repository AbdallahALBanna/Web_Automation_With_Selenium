package createAccount;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class CreateAccountRandomDataProvider {

    @DataProvider(name = "randomUserdataCreator")

    public static Object[][] randomUserdataCreator() {
        Faker faker = new Faker();
        int numbOfAccounts = 5;
        Object[][] createAccountUserData = new Object[numbOfAccounts][4];

        for (int i = 0; i < numbOfAccounts; i++) {
            createAccountUserData[i][0] = faker.name().firstName();
            createAccountUserData[i][1] = faker.name().lastName();
            createAccountUserData[i][2] = faker.internet().emailAddress();
            createAccountUserData[i][3] = faker.internet().password(8, 16, true, true);

        }
        return createAccountUserData;
    }


}
