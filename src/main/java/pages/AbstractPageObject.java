package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageObject {

    protected WebDriver driver;
    final static int PAGE_TIME_OUT = 10;

    public AbstractPageObject(final WebDriver driver) {
        this(driver, PAGE_TIME_OUT);
    }

    public AbstractPageObject(final WebDriver driver, int timeout) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
