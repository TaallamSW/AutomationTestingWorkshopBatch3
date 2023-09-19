package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By emailTxt= By.id("Email");
    private By passwordTxt=By.id("Password");
    private By loginBtn=By.className("login-button");
    private By errorMessage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    public void writeEmail(String email)
    {
       enterTextInWebElement(emailTxt,email);
    }
    public void writePassword(String password)
    {
        enterTextInWebElement(passwordTxt,password);
    }
    public void clickOnLoginBtn()
    {
        clickOnWebElement(loginBtn);
    }
    public String getErrorMessageText()
    {
        return getTextFromWebElement(errorMessage);
    }
}
