package talentLMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//a[@class=\"dropdown-toggle tl-nabvar-roles-button\"]")
    public WebElement dropdownToggleNabvarRolesButton;

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[position()=1]")
    public WebElement dropdownToggleGoTo;

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[position()=2]")
    public WebElement dropdownToggleMessages;

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[position()=3]")
    public WebElement dropdownToggleHelp;

    @FindBy(id = "tl-upgrade-link")
    public WebElement tlUpgradeLink;

    @FindBy(id = "tl-spotlight")
    public WebElement tlSpotlight;

    @FindBy(id = "navbar-logout")
    public WebElement navbarLogout;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=1]")
    public WebElement userIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=2]")
    public WebElement coursesIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=3]")
    public WebElement categoriesIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=4]")
    public WebElement groupIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=5]")
    public WebElement branchesIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=6]")
    public WebElement eventsEngineIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=7]")
    public WebElement userTypesIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=8]")
    public WebElement importExportIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=9]")
    public WebElement reportsIcon;

    @FindBy(xpath = "(//i[@class=\"icon-circle tl-icon-stack-background\"])[position()=10]")
    public WebElement accountAndSettingsIcon;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Users\"]")
    public WebElement textUsers;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Courses\"]")
    public WebElement textCourses;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Categories\"]")
    public WebElement textCategories;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Groups\"]")
    public WebElement textGroups;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Branches\"]")
    public WebElement textBranches;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Events engine\"]")
    public WebElement textEventEngine;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"User types\"]")
    public WebElement textUserTypes;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Import - Export\"]")
    public WebElement textImport_Export;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Reports\"]")
    public WebElement textReports;

    @FindBy(xpath = "//div[@class=\"tl-bold-link\"]/a[normalize-space(text())=\"Account & Settings\"]")
    public WebElement textAccountAndSettings;

    @FindBy(xpath ="(//div[@data-toggle=\"buttons-radio\"])[position()=1]/a[normalize-space(text())=\"Today\"]" )
    public WebElement btnInDiagramToday;

    @FindBy(xpath = "(//div[@data-toggle=\"buttons-radio\"])[position()=1]/a[normalize-space(text())=\"Yesterday\"]")
    public WebElement btnInDiagramYesterday;

    @FindBy(xpath = "(//div[@data-toggle=\"buttons-radio\"])[position()=1]/a[normalize-space(text())=\"Week\"]")
    public WebElement btnInDiagramWeek;

    @FindBy(xpath = "(//div[@data-toggle=\"buttons-radio\"])[position()=1]/a[normalize-space(text())=\"Month\"]")
    public WebElement btnInDiagramMonth;

    @FindBy(id="tl-admin-right-sidebar-show-timeline")
    public WebElement btnShowTimeLine;

    @FindBy(id="tl-admin-right-sidebar-show-chart")
    public WebElement btnShowChart;

    @FindBy(id="tl-admin-right-sidebar-show-statistics")
    public WebElement btnShowStatistic;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add user\"]")
    public WebElement subBtnAddUser;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add course\"]")
    public WebElement subBtnAddCourse;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Course Store\"]")
    public WebElement subBtnCourseStore;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add category\"]")
    public WebElement subBtnAddCategory;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add group\"]")
    public WebElement subBtnAddGroup;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add branch\"]")
    public WebElement subBtnAddBranch;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add notification\"]")
    public WebElement subBtnAddNotification;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add automation\"]")
    public WebElement subBtnAddAutomation;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Add user type\"]")
    public WebElement subBtnAddUserType;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Import\"]")
    public WebElement subBtnImport;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Export\"]")
    public WebElement subBtnExport;

    @FindBy(xpath = "//div[@id=\"tl-admin-dashboard-reports\"]/div/div[2]/a[normalize-space(text())=\"Users\"]")
    public WebElement subBtnUsersInReports;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Courses\"]")
    public WebElement subBtnCourses;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Branches\"]")
    public WebElement subBtnBranches;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Groups\"]")
    public WebElement subBtnGroups;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Scorm\"]")
    public WebElement subBtnScorm;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Tests\"]")
    public WebElement subBtnTests;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Infographics\"]")
    public WebElement subBtnInfographics;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Training matrix\"]")
    public WebElement subBtnTrainingMatrix;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Custom\"]")
    public WebElement subBtnCustom;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Homepage\"]")
    public WebElement subBtnHomepage;

    @FindBy(xpath = "//div[@id=\"tl-admin-settings\"]/div[2]/a[normalize-space(text())=\"Users\"]")
    public WebElement subBtnUsers;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Themes\"]")
    public WebElement subBtnThemes;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Certificates\"]")
    public WebElement subBtnCertificates;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Gamification\"]")
    public WebElement subBtnGamification;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"E-commerce\"]")
    public WebElement subBtnE_commerce;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Domain\"]")
    public WebElement subBtnDomain;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a[normalize-space(text())=\"Subscription\"]")
    public WebElement subBtnSubscription;

    @FindBy(xpath = "//div[@class=\"hidden-phone\"]/a/strong")
    public WebElement subBtnNewInterface;









































































































































}
