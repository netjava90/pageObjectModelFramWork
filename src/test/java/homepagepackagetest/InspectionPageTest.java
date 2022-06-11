package homepagepackagetest;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.InspectionPage;

public class InspectionPageTest extends CommonAPI {

   // @Test
    public void TestElementDisplayed(){
        InspectionPage inspectionPage = new InspectionPage(getDriver());
    }
}
