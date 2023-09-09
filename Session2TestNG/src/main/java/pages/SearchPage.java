package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{

    private By result = By.xpath("//div[@class=\"no-result\"]");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getResult()
    {
        return driver.findElement(result).getText();
    }
}
