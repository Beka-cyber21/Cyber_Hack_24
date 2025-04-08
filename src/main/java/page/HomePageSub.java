package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSub extends BasePage{
    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add user\"]")
    public WebElement subAddUser;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add course\"]")
    public WebElement subAddCourses;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Course Store\"]")
    public WebElement subCourseStore;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add category\"]")
    public WebElement subAdCategory;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add group\"]")
    public WebElement subAddGroup;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add branch\"]")
    public WebElement subAddBranch;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add notification\"]")
    public WebElement subAddNotification;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add automation\"]")
    public WebElement subAddAutomation;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add user type\"]")
    public WebElement subAddUserType;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Import\"]")
    public WebElement subImport;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Export\"]")
    public WebElement subExport;

    @FindBy(xpath = "//div[@id=\"tl-admin-dashboard-reports\"]/div/div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Users\"]")
    public WebElement subUsers01;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Courses\"]")
    public WebElement subCourses;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Branches\"]")
    public WebElement subBranches;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Groups\"]")
    public WebElement subGroup;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Scorm\"]")
    public WebElement subScorm;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Tests\"]")
    public WebElement subTests;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Infographics\"]")
    public WebElement subInfographics;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Training matrix\"]")
    public WebElement subTrainingMatrix;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Custom\"]")
    public WebElement subCustom;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Homepage\"]")
    public WebElement subHomepage;

    @FindBy(xpath = "//div[@id=\"tl-admin-settings\"]/div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Users\"]")
    public WebElement subUsers02;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Themes\"]")
    public WebElement subThemes;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Certificates\"]")
    public WebElement subCertificates;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Gamification\"]")
    public WebElement subGamification;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"E-commerce\"]")
    public WebElement subE_commerce;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Domain\"]")
    public WebElement subDomain;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Subscription\"]")
    public WebElement subSubscription;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"\"]")
    public WebElement subNewInterface;

}
