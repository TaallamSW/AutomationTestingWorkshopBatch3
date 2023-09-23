package BDD.Login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(glue = {"BDD/Login"},
        features = {"src/test/java/BDD/Login/login.feature"},
        plugin = {"pretty","html:tsrget/cucumber-html-report"},
        monochrome = true)
public class LoginRunner extends AbstractTestNGCucumberTests{

    public static WebDriver driver;
    @BeforeClass
    public void setup()
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
        driver.quit();
    }
}
