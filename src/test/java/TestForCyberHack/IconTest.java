package TestForCyberHack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class IconTest extends BaseTest {
    @DataProvider(name = "Icon")
    public Object[][] clickAllIcon() {
        return new Object[][]{
                {homePage.branchesIcon},
                {homePage.categoriesIcon},
                {homePage.coursesIcon},
                {homePage.groupIcon},
                {homePage.iconBackInTimeIcon},
                {homePage.accountAndSettingsIcon},
                {homePage.ImportExportIcon},
                {homePage.reportsIcon},
                {homePage.userIcon},
                {homePage.userTypesIcon}
        };
    }

    @Test(dataProvider = "Icon")
    public void clickAllIcon(WebElement element) {
        driver.get("https://asteam.talentlms.com/dashboard");
        if (driver.getCurrentUrl().equals("https://asteam.talentlms.com/index/?redirect=%2Fdashboard")) {
            loginPage.logInLoginPage(loginPage.trueLogin, loginPage.truePassword);
        }
        webElementActions.moveToElementClick(element);
        Assert.assertNotEquals(driver.getCurrentUrl()
                , "\"https://asteam.talentlms.com/dashboard"
                , "is not changeURl");


    }
}
