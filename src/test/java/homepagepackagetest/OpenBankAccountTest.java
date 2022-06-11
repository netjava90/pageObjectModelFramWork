package homepagepackagetest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OpenBankAccountPage;

public class OpenBankAccountTest extends CommonAPI {

    @Test
    public void openCheckingAccount(){
        OpenBankAccountPage openBankAccountPage = new OpenBankAccountPage(getDriver());
        openBankAccountPage.clickOnBanking();
        openBankAccountPage.clickOnPersonalBanking();
        waitFor(5);
        openBankAccountPage.scrollToView("CheckingSavingsCDSandCreditCards");
        openBankAccountPage.clickOnChecking();
        openBankAccountPage.clickOnChAccount();
    }
    @Test
    public void getHomeLoan(){
        OpenBankAccountPage openBankAccountPage = new OpenBankAccountPage(getDriver());
        openBankAccountPage.clickOnBanking();
        openBankAccountPage.clickOnHomeLoan();
        waitFor(5);
        String expectedPageTitle = "Welcome to a simple and seamless home loan experience | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void getCreditCard(){
        OpenBankAccountPage openBankAccountPage = new OpenBankAccountPage(getDriver());
        openBankAccountPage.clickOnBanking();
        openBankAccountPage.clickOnCreditCard();
        openBankAccountPage.clickOnLearnMore();
        waitFor(3);
        String expectedPageTitle = "Visa Credit Cards from U.S. Bank® | State Farm®";
        Assert.assertEquals(expectedPageTitle,getPageTitle());
        openBankAccountPage.clickOnContinueBtn();

    }


}
