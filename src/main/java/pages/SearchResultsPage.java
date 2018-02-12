package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends AbstractPageObject {

    @FindBy(css = ".kno-ecr-pt.kno-fb-ctx>span")
    private WebElement cityName;

    public SearchResultsPage(final WebDriver driver) {
        super(driver);
    }

    public void load() {
        System.out.println("Cant go to the ResultPage directly");
    }

    public Boolean isCityDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(cityName));
        return cityName.isDisplayed();
    }

    public String getCityName() {
        return cityName.getText();
    }

}
