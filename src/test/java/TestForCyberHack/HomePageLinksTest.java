package TestForCyberHack;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageLinksTest extends BaseTest {
    @DataProvider(name = "Links")
    public Object[][] clickAllLinks(){
        return new Object[][]{
                {homePage.userLink},
                {homePage.coursesLink},
                {homePage.categoriesLink},
                {homePage.groupsLink},
                {homePage.branchesLink},
                {homePage.eventsEngineLink},
                {homePage.usersTypesLink},
                {homePage.import_ExportLinks},
                {homePage.reportsLinks},
                {homePage.accountAndSettingsLinks}
        };
    }

    @Test(dataProvider = "Links")
    public void clickAllLinks(WebElement element) {
        driver.navigate().to("https://asteam.talentlms.com/dashboard");
        if (driver.getCurrentUrl().equals("https://asteam.talentlms.com/index/?redirect=%2Fdashboard")) {
            loginPage.logInLoginPage(loginPage.trueLogin, loginPage.truePassword);
        }
        webElementActions.clickBtn(element);
        Assert.assertNotEquals(driver.getCurrentUrl()
                , "\"https://asteam.talentlms.com/dashboard"
                , "is not changeURl");
    }
}
