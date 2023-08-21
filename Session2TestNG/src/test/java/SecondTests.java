import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTests {
    @AfterClass
    public void openHomepage()
    {
        System.out.println("Go to home page");
    }
    @Test(priority = -1)
    public void enterEmail()
    {
        System.out.println("Enter Email");
    }
    @BeforeClass
    public void openLogin()
    {
        System.out.println("Go to login Page");
    }
    @Test
    public void enterPassword()
    {
        System.out.println("Enter Password");
    }

}
