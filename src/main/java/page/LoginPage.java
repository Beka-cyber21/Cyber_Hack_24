package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
   public String trueLogin = "bekturakmatov21@gmail.com";
   public String truePassword ="a#zDCVGJLMqq5n9";

    @FindBy(name="login")
    public WebElement login;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(name="submit")
    public WebElement submit;

    @FindBy(xpath = "//div[@class=\"text-center\"]/a")
    public WebElement forgotPassword;

    public LoginPage logInLoginPage(String userLog,String userPass) {
     webElementActions.sendText(login,userLog)
             .sendText(password,userPass)
             .clickBtn(submit);
     return this;
    }



}
