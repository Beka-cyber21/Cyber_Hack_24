package TestForCyberHack;

import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
    @Test
    public void logInTest(){
        driver.navigate().to("https://asteam.talentlms.com/index");

    }
}
