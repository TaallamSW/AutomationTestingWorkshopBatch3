package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
    WebDriver driver;
    /***************** Class Constructor **************************/
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
    /******************* Common Elements **************************/
    private By registerBtn = By.xpath("//a[text()='Register']");
    By searchTextBox = By.id("small-searchterms");
    private By loginBtn = By.xpath("//a[text()='Log in']");
    private By logoutBtn = By.xpath("//a[text()=\"Log out\"]");

    /***************** Common Browser Functions********************/
    public void waitUntilWebElementIsVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public boolean isWebElementPresent(By element)
    {
        boolean found;
        try
        {
            waitUntilWebElementIsVisible(element);
            driver.findElement(element);
            found = true;
        }
        catch (Exception e)
        {
            found = false;
        }
        return found;
    }
    public void clickOnWebElement(By element)
    {
        waitUntilWebElementIsVisible(element);
        driver.findElement(element).click();
    }
    public void enterTextInWebElement(By element, String text) {
        waitUntilWebElementIsVisible(element);
        driver.findElement(element).sendKeys(text);
    }
    public String getTextFromWebElement(By element)
    {
        waitUntilWebElementIsVisible(element);
        return driver.findElement(element).getText();
    }
    /***************** Common Pages Functions*********************/
    public void clickOnRegisteration()
    {
        clickOnWebElement(registerBtn);
    }
    public void clickOnLoginBtn()
    {
        clickOnWebElement(loginBtn);
    }
    public void clickOnLogout()
    {
        clickOnWebElement(logoutBtn);
    }

    public boolean isSuccessfulLogin()
    {
        return isWebElementPresent(logoutBtn);
    }
}
