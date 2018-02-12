package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageObject {

    protected WebDriver driver;
    final static int PAGE_TIME_OUT = 10;
    // WebDriverWait wait;

    public AbstractPageObject(final WebDriver driver) {
        this(driver, PAGE_TIME_OUT);
    }

    public AbstractPageObject(final WebDriver driver, int timeout) {
        this.driver = driver;
        // wait = new WebDriverWait(driver, timeout);
        PageFactory.initElements(driver, this);
    }

}
