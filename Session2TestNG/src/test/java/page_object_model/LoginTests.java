package page_object_model;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest{
    public HomePage homePage;
    public LoginPage loginPage;
    @Test
    public void verifyLoginWithValidUsernameAndValidPassword()
    {
        softAssert = new SoftAssert();
        homePage = new HomePage(driver);
        homePage.clickOnLoginBtn();
        loginPage = new LoginPage(driver);
        loginPage.writeEmail("Test1@gmail.com");
        loginPage.writePassword("test123");
        loginPage.clickOnLoginBtn();
        softAssert.assertTrue(loginPage.isSuccessfulLogin());
        loginPage.clickOnLogout();
        softAssert.assertAll();
    }
    @Test
    public void verifyLoginWithValidUsernameAndInValidPassword()
    {
        softAssert = new SoftAssert();
        homePage = new HomePage(driver);
        homePage.clickOnLoginBtn();
        loginPage = new LoginPage(driver);
        loginPage.writeEmail("Test1@gmail.com");
        loginPage.writePassword("test");
        loginPage.clickOnLoginBtn();
        softAssert.assertEquals(loginPage.getErrorMessageText(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect");
        softAssert.assertAll();
    }
    @Test
    public void verifyLoginWithInValidUsernameAndPassword()
    {
        softAssert = new SoftAssert();
        homePage = new HomePage(driver);
        homePage.clickOnLoginBtn();
        loginPage = new LoginPage(driver);
        loginPage.writeEmail("Test1w@gmail.com");
        loginPage.writePassword("test");
        loginPage.clickOnLoginBtn();
        softAssert.assertEquals(loginPage.getErrorMessageText(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
        softAssert.assertAll();
    }
}
