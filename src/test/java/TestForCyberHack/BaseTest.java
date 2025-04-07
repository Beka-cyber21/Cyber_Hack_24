package TestForCyberHack;

import drivers.Driver;
import helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    WebElementActions webElementActions = new WebElementActions();
    WebDriver driver ;

    @BeforeSuite
    public void beforeSuite(){
        driver = Driver.getDriver();
    }
}
