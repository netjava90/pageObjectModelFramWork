package homepagepackagetest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccessDocMessPage;
import pages.AccountPage;

public class AccessDocMessTest extends CommonAPI {
    @Test
    public void accessDocuments() {
        AccountPage accountPage = new AccountPage(getDriver());
        accountPage.clickOnLogInButton();
        accountPage.typeUserName("Aksel1506");
        accountPage.typePassword("TestCase@java#");
        accountPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        AccessDocMessPage accessDocMessPage = new AccessDocMessPage(getDriver());
        accessDocMessPage.selectFromMenuDropdown("documents");
        String expectedPageTitle1 = "Document Center";
        Assert.assertEquals(expectedPageTitle1, getPageTitle());
    }
   @Test
    public void accessMessages() {
        AccountPage accountPage = new AccountPage(getDriver());
        accountPage.clickOnLogInButton();
        accountPage.typeUserName("Aksel1506");
        accountPage.typePassword("TestCase@java#");
        accountPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        AccessDocMessPage accessDocMessPage = new AccessDocMessPage(getDriver());
        accessDocMessPage.selectFromMenuDropdown("messages");
        String expectedPageTitle2 = "State Farm Secure Mailbox Sign-in";
        Assert.assertEquals(expectedPageTitle2, getPageTitle());
        accessDocMessPage.clickOnContinueBtn();
    }
}
