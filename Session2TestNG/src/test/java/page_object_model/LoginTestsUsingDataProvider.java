package page_object_model;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestsUsingDataProvider extends BaseTest
{
    HomePage homePage;
    LoginPage loginpage;
    @Test(dataProvider = "myData")
    public void login(String email, String password,String expectedResult) {
        softAssert = new SoftAssert();
        homePage = new HomePage(driver);
        homePage.clickOnLoginBtn();
        loginpage= new LoginPage(driver);
        loginpage.writeEmail(email);
        loginpage.writePassword(password);
        loginpage.clickOnLoginBtn();
        if(loginpage.isSuccessfulLogin())
        {
            loginpage.clickOnLogout();
        }
        else
        {
            softAssert.assertEquals(loginpage.getErrorMessageText(),expectedResult);
            softAssert.assertAll();
        }
    }
    @DataProvider
    public Object[][] myData()
    {
        Object[][] data=new Object[3][3];
        data [0][0]="Test1@gmail.com";
        data [0][1]="test123";
        data [0][2]="login";
        data [1][0]="Test1@gmail.com";
        data [1][1]="test";
        data [1][2]="Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        data [2][0]="Test1w@gmail.com";
        data [2][1]="test123";
        data [2][2]="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        return data;
    }
}
