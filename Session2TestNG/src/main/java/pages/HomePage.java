package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By searchTextBox = By.id("small-searchterms");
    By searchBtn = By.xpath("//*[@id=\"small-search-box-form\"]/button");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterTextInSearchBox(String text)
    {
        driver.findElement(searchTextBox).sendKeys(text);
    }
    public void clickOnSearchButton()
    {
        driver.findElement(searchBtn).click();
    }
}
