package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    String trueLogin = "bekturakmatov21@gmail.com";
    String truePassword ="a#zDCVGJLMqq5n9";

    @FindBy(name="login")
    public WebElement login;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(name="submit")
    public WebElement submit;

    @FindBy(xpath = "//div[@class=\"text-center\"]/a")
    public WebElement forgotPassword;

    public LoginPage loginInLogPage(String login,String password){
        webElementActions.sendKeysTag(this.login,login)
                .sendKeysTag(this.password,password)
                .clickBtn(submit);
        return this;
    }


}
