package BDD.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
WebDriver driver;
HomePage homePage;
LoginPage loginPage;
    @Given("Navigate to login page")
    public void navigateToLoginPage() {
        driver = LoginRunner.driver;
        homePage = new HomePage(driver);
        homePage.clickOnLoginBtn();
        loginPage = new LoginPage(driver);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginBtn();
    }

    @Then("user is Logged in Successfully")
    public void userIsLoggedInSuccessfully() {
        Assert.assertTrue(loginPage.isSuccessfulLogin());
    }


    @Then("Error message will appear with text {string}")
    public void errorMessageWillAppearWithText(String messageText) {
        Assert.assertEquals(loginPage.getErrorMessageText(),messageText);
    }

    @When("Enter email {string}")
    public void enterEmail(String email) {
        loginPage.writeEmail(email);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        loginPage.writePassword(password);
    }

    @When("Click on Logout Button")
    public void clickOnLogoutButton() {
        loginPage.clickOnLogout();
    }
}
