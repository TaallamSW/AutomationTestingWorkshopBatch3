import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo
{
    @Test
    public void startChrome()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void startChromeByWebdriverManger()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
    }
}
