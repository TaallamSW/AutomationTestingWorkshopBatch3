package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage
{
    WebDriver driver;
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By registerBtn = By.xpath("//a[text()='Register']");
    public void clickOnRegisteration()
    {
        driver.findElement(registerBtn).click();
    }
}
