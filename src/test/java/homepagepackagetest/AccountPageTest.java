package homepagepackagetest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountPageTest extends CommonAPI {



    @Test
    public void testClickOnLogInButton(){
        AccountPage accountPage = new AccountPage(getDriver());
        accountPage.clickOnLogInButton();
        accountPage.typeUserName("Aksel1506");
        accountPage.typePassword("TestCase@java$");
        accountPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(3);


    }
    @Test
    public void loginInvalidCredentials(){
        AccountPage accountPage = new AccountPage(getDriver());
        accountPage.clickOnLogInButton();
        accountPage.typeUserName("Aksel1506");
        accountPage.typePassword("Test@java");
        accountPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
}
