package talentLMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewInterfacePage extends BasePage{
    @FindBy(xpath = "//div[@data-testid=\"profile-menu-button\"]")
    public WebElement profileMenuButton;

    @FindBy(xpath = "//a[@data-testid=\"legacy-menu-item\"]")
    public WebElement legacyMenuItem;

}
