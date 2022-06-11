package homepagepackagetest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsurancePage;

public class InsurancePageTest extends CommonAPI {

   @Test
    public void getLifeInsurance(){
        InsurancePage insurancePage = new InsurancePage(getDriver());
        insurancePage.clickOnInsurance();
        insurancePage.clickOnLife();
        insurancePage.selectFromDropDown("NY");
        insurancePage.clickOnGo();
        String expectedPageTitle = "Life Quote - State Farm";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);

    }
   @Test
    public void getHomeInsurance() {
        InsurancePage insurancePage = new InsurancePage(getDriver());
        insurancePage.clickOnInsurance();
        insurancePage.clickOnHome();
        insurancePage.typeInZipCode("11219");
        insurancePage.clickOnStartQuote();
        String expectedPageTitle = "Home Insurance | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);
    }
}
