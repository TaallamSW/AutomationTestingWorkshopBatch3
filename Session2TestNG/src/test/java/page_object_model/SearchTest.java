package page_object_model;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    public void verifySearchButton()
    {
        HomePage homePage = new HomePage(driver);
        homePage.enterTextInSearchBox("Test");
        homePage.clickOnSearchButton();
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertEquals(searchPage.getResult(),"No products were found that matched your criteria.");
        searchPage.clickOnRegisteration();
    }

}
