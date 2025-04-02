package testPage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import talentLMS.pages.LogInPage;

public class LogInTest extends BaseTest {
    @DataProvider(name = "log in user")
    public Object[][] takeManyVariable(){
        return new Object[][]{
                {randomizer.fakeLoginGenerate(),randomizer.fakePasswordGenerate()},
                {randomizer.fakeLoginGenerate(),randomizer.fakePasswordGenerate()},
                {webElementAction.sendKeys(logInPage.login, logInPage.trueLogin)
                        ,webElementAction.sendKeys(logInPage.password, logInPage.truePassword)}
        };
    }
    @BeforeSuite
    @Test(dataProvider = "log in user")
    public void baseLoginSite(String userLogin,String  userPassword){
        driver.get("https://asteam.talentlms.com/index");
        webElementAction.sendKeys(logInPage.login,userLogin).
                sendKeys(logInPage.password, userPassword).
                clickBTN(logInPage.submitButton);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expectedUrl="https://asteam.talentlms.com/plus/dashboard";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Url не соответствует ожидаемому после логина!");
    }

}
