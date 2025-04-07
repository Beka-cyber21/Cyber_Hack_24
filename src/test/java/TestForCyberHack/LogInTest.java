package TestForCyberHack;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    @DataProvider(name = "login variables")
    public Object[][] useLogin() {
        return new Object[][]{
                {faker.internet().emailAddress(), faker.internet().password()},
                {loginPage.trueLogin, loginPage.truePassword},
                {null, null}
        };
    }

    @Test(dataProvider = "login variables")
    public void logInTest(String login, String password) {
        driver.navigate().to("https://asteam.talentlms.com/index");
        try {loginPage.logInLoginPage(login, password);}
        catch (NullPointerException e){
            System.out.println("You haven't text");
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://asteam.talentlms.com/plus/dashboard","you have not changes url");


    }
}
