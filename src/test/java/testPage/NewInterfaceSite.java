package testPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewInterfaceSite extends BaseTest {
    @Test
    public void newInterfaceTest() {
        webElementAction.clickBTN(newInterfacePage.profileMenuButton)
                .clickBTN(newInterfacePage.legacyMenuItem);

        Assert.assertEquals("https://asteam.talentlms.com/dashboard"
                , driver.getCurrentUrl(),
                "You cant change site");
    }

}
//https://asteam.talentlms.com/dashboard