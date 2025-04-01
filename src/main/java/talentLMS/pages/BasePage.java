package talentLMS.pages;

import org.openqa.selenium.support.PageFactory;
import talentLMS.driverPage.MainDriver;
import talentLMS.helper.WebElementAction;

public abstract class BasePage {
    WebElementAction webElementAction = new WebElementAction();

    public BasePage(){
        PageFactory.initElements(MainDriver.getDriver(),this);
    }
}
