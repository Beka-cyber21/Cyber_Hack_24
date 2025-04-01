package talentLMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{
    public  String trueLogin = "bekturakmatov21@gmail.com";
    public String truePassword ="a#zDCVGJLMqq5n9";


    @FindBy(name = "login")
    public WebElement login;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement submitButton;




}
