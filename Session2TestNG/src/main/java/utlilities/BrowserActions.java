package utlilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions
{

    public static void waitUntilWebElementIsVisible(WebDriver driver,By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static void clickOnWebElement(WebDriver driver,By element)
    {
        waitUntilWebElementIsVisible(driver,element);
        driver.findElement(element).click();
    }
    public static void enterTextInWebElement(WebDriver driver,By element, String text) {
        waitUntilWebElementIsVisible(driver,element);
        driver.findElement(element).sendKeys(text);
    }
}
