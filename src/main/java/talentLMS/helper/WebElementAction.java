package talentLMS.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import talentLMS.driverPage.MainDriver;

import java.sql.Driver;
import java.time.Duration;

public class WebElementAction {

    public Actions actions = new Actions(MainDriver.getDriver());

    public WebElementAction sendKeys(WebElement element, String key) {
        element.sendKeys(key);
        return this;
    }

    public WebElementAction waitButtonToBeDisplayed(WebElement element) {
        new
                WebDriverWait(MainDriver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOf(element));
        return this;
    }

    public WebElementAction waitButtonToBeClickAble(WebElement element) {
        new
                WebDriverWait(MainDriver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOf(element));
        return this;

    }

    public WebElementAction clickBTN(WebElement element) {
        waitButtonToBeClickAble(element)
                .waitButtonToBeDisplayed(element);
        element.click();
        return this;
    }

}
