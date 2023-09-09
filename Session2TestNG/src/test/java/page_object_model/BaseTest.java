package page_object_model;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;
    @BeforeClass
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void exit()
    {
        //driver.quit();
    }
}
