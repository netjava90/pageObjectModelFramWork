package homepagepackagetest;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.SearchPage;

public class SearchTest extends CommonAPI {
  @Test
    public void searchAgent(){
        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickOnSearchBtn();
        searchPage.typeOnSearchBox("Find an agent");
        searchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void changeLanguage(){
        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickOnLanguage();
        waitFor(3);
        String expectedPageTitle = "100 años de seguro de automóviles de State Farm y más. Obtén una cotización | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void searchUsBank(){
        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickOnSearchBtn();
        searchPage.typeOnSearchBox("Us Bank");
        searchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        searchPage.clickOnBusinessBank();
    }

}
