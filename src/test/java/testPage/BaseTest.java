package testPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import talentLMS.driverPage.MainDriver;
import talentLMS.helper.Randomizer;
import talentLMS.helper.WebElementAction;
import talentLMS.pages.LogInPage;

public abstract class BaseTest {
    WebDriver driver;
    WebElementAction webElementAction = new WebElementAction();
    Randomizer randomizer = new Randomizer();
    LogInPage logInPage = new LogInPage();

    @BeforeSuite
    public void beforeSuite(){
        driver = MainDriver.getDriver();
    }
}
