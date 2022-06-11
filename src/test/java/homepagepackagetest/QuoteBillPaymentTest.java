package homepagepackagetest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QuoteBillPaymentPage;

public class QuoteBillPaymentTest extends CommonAPI {

   @Test
    public void getAutoQuote() {
        QuoteBillPaymentPage quoteBillPage = new QuoteBillPaymentPage(getDriver());
        quoteBillPage.getQuote();
        quoteBillPage.selectFromMenuDropdown("Auto");
        quoteBillPage.zipCode("11219");
        quoteBillPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

   @Test
    public void payBill() {
        QuoteBillPaymentPage quoteBillPage = new QuoteBillPaymentPage(getDriver());
        quoteBillPage.clickOnPayBill();
        quoteBillPage.selectOptionFromMenuDropdown("Phone Number");
        quoteBillPage.typePhoneNum("3475495665");
        quoteBillPage.typeDateOfBirth("04061987");
        quoteBillPage.clickOnPayNowBtn();
        String expectedPageTitle = "Sorry we are having technical problems";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);
    }

   @Test
    public void getRoadSideAssistance() {
        QuoteBillPaymentPage quoteBillPage = new QuoteBillPaymentPage(getDriver());
        quoteBillPage.clickOnClaim();
        quoteBillPage.clickOnRoadSideAssistance();
        String expectedPageTitle = "Get Roadside Assistance - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        quoteBillPage.clickOnGetRoadSideAssistanceBtn();
        waitFor(3);
        String expectedPageTitle1 = "Emergency Roadside Service";
        Assert.assertEquals(expectedPageTitle1, getPageTitle());


    }
   @Test
    public void getPetInsurance() {
        QuoteBillPaymentPage quoteBillPage = new QuoteBillPaymentPage(getDriver());
        quoteBillPage.getQuote();
        quoteBillPage.selectFromMenuDropdown("Pet Insurance");
        quoteBillPage.zipCode("11219");
        quoteBillPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "Get A Pet Insurance Quote - Pet Insurance - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void getRenterQuote() {
        QuoteBillPaymentPage quoteBillPage = new QuoteBillPaymentPage(getDriver());
        quoteBillPage.getQuote();
        quoteBillPage.selectFromMenuDropdown("Renters");
        quoteBillPage.zipCode("11209");
        quoteBillPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
  }
