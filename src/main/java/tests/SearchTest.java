package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultsPage;

public class SearchTest extends AbstractTestBase {

    @DataProvider
    public Object[][] data() {
        return new Object[][] { { "Kolkata" }, { "Calgary" } };
    }

    @Test(dataProvider = "data")
    public void testCity(final String cityName) {
        SearchResultsPage searchResultsPage = new HomePage(driver).load().search(cityName);
        Assert.assertTrue(searchResultsPage.isCityDisplayed());
        Assert.assertEquals(searchResultsPage.getCityName(), cityName);
    }
}
