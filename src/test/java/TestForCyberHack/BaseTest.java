package TestForCyberHack;

import com.github.javafaker.Faker;
import drivers.Driver;
import helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import page.HomePage;
import page.LoginPage;

public abstract class BaseTest {
    WebElementActions webElementActions = new WebElementActions();
    WebDriver driver ;
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    HomePage homePage = new HomePage();

    @BeforeSuite
    public void beforeSuite(){
        driver = Driver.getDriver();
    }
}
