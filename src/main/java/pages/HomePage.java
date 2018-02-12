package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends AbstractPageObject {

    @FindBy(id = "lst-ib")
    WebElement searchResultTextBox;

    public HomePage(final WebDriver driver) {
        super(driver);
    }

    public HomePage load() {
        driver.get("http://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new HomePage(driver);
    }

    public void isLoaded() {
        Assert.assertTrue(driver.getTitle().equals("Google Home Page"));
    }

    public SearchResultsPage search(String stringToSearch) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(searchResultTextBox));
        searchResultTextBox.clear();
        searchResultTextBox.sendKeys(stringToSearch);
        searchResultTextBox.submit();
        return new SearchResultsPage(driver);
    }

}
