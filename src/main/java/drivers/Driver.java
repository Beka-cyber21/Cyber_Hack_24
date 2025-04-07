package drivers;

import fileUtils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver() {

}

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browserType").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadWebDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                case "safari":
                    driver = SafariWebDriver.loadSafariDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Uncorrected browser type" + ConfigReader.getProperty("browserType"));
            }
        }
        return driver;
    }
}
