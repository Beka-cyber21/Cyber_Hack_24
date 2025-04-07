package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-user tl-icon-stack-content\"]")
    public WebElement userIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-book tl-icon-stack-content\"]")
    public WebElement coursesIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-menu tl-icon-stack-content\"]")
    public WebElement categoriesIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-users tl-icon-stack-content\"]")
    public WebElement groupIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-split tl-icon-stack-content\"]")
    public WebElement branchesIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-back-in-time tl-icon-stack-content\"]")
    public WebElement iconBackInTimeIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-vcard tl-icon-stack-content\"]")
    public WebElement userTypesIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-refresh tl-icon-stack-content\"]")
    public WebElement ImportExportIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-chart-pie tl-icon-stack-content\"]")
    public WebElement reportsIcon;

    @FindBy(xpath = "//div[@class=\"tl-icons-block\"]/span/i[@class=\"icon-sliders-v tl-icon-stack-content\"]")
    public WebElement accountAndSettingsIcon;

}
