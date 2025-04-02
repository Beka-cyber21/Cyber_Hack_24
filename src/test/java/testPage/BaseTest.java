package testPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
    public void beforeSuite() {
        driver = MainDriver.getDriver();
    }

    @BeforeMethod
    public void beforeMethods() {
        driver.get("https://asteam.talentlms.com/index");
        webElementAction.sendKeys(logInPage.login, logInPage.trueLogin).
                sendKeys(logInPage.password, logInPage.truePassword).
                clickBTN(logInPage.submitButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
