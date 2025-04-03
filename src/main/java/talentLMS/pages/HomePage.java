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


}
