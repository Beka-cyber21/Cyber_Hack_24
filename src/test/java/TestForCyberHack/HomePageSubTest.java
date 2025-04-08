package TestForCyberHack;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageSubTest extends  BaseTest{
    @DataProvider(name = "SubText")
    public Object[][] clickAllSubmit(){
        return new Object[][]{
                {homePageSub.subAddUser},
                {homePageSub.subAddCourses},
                {homePageSub.subCourseStore},
                {homePageSub.subAdCategory},
                {homePageSub.subAddGroup},
                {homePageSub.subAddBranch},
                {homePageSub.subAddNotification},
                {homePageSub.subAddAutomation},
                {homePageSub.subAddUserType},
                {homePageSub.subImport},
                {homePageSub.subExport},
                {homePageSub.subUsers01},
                {homePageSub.subCourses},
                {homePageSub.subBranches},
                {homePageSub.subGroup},
                {homePageSub.subScorm},
                {homePageSub.subTests},
                {homePageSub.subInfographics},
                {homePageSub.subTrainingMatrix},
                {homePageSub.subCustom},
                {homePageSub.subHomepage},
                {homePageSub.subUsers02},
                {homePageSub.subThemes},
                {homePageSub.subCertificates},
                {homePageSub.subGamification},
                {homePageSub.subE_commerce},
                {homePageSub.subDomain},
                {homePageSub.subSubscription},
                {homePageSub.subNewInterface},
        };
    }

    @Test(dataProvider = "SubText")
    public void clickAllSub(WebElement element){
        driver.navigate().to("https://asteam.talentlms.com/dashboard");
        if (driver.getCurrentUrl().equals("https://asteam.talentlms.com/index/?redirect=%2Fdashboard")) {
            loginPage.logInLoginPage(loginPage.trueLogin, loginPage.truePassword);
        }webElementActions.moveToElementClick(element);
    }
}
