package homepagepackagetest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoPaperLessPage;

public class GoPaperLessTest extends CommonAPI {
  @Test
  public void testPaperLess() {
    GoPaperLessPage paperLessPage = new GoPaperLessPage(getDriver());
    waitFor(5);
    paperLessPage.ScrollToViewGoPaperLessBtn(getDriver());
    paperLessPage.clickOnPaperLess();
    paperLessPage.typePhoneNum("3475495665");
    paperLessPage.typeDateOfBirth("04061987");
    paperLessPage.clickOnContinue();
    waitFor(5);
    String expectedPageTitle = "Now, review and agree to the terms and conditions";
    Assert.assertEquals(expectedPageTitle, getPageTitle());

  }

  //@Test
  public void testAutoPay() {
    GoPaperLessPage paperLessPage = new GoPaperLessPage(getDriver());
    paperLessPage.clickOnAutoPay();
  }
}