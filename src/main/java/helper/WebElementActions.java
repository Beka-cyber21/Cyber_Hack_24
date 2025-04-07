package helper;

import drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementActions {
    public Actions actions = new Actions(Driver.getDriver());

    public WebElementActions waitButtonToBeClickAble(WebElement element) {

        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .elementToBeClickable(element));
        return this;

    }

    public WebElementActions waitElementToBeDisplayed(WebElement element) {
        new
                WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOf(element));
        return this;
    }
}
