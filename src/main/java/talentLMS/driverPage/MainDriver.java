package talentLMS.driverPage;

import org.openqa.selenium.WebDriver;
import talentLMS.fileUtils.ConfigReader;

public class MainDriver {
    private MainDriver(){
    }
    static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigReader.getProperty("browserType").toLowerCase()){
                case"chrome":
                    driver = ChromeWebDriver.loadChromeWebDriver();
                    break;
                case "edge":
                    driver =EdgeWebDriver.loadEdgeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    break;
                case "safari":
                    driver =SafariWebDriver.loadSafariDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Uncorrected browser type" + ConfigReader.getProperty("browserType") );

            }
        }
        return driver;
    }
}
