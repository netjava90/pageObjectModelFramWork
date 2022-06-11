package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InspectionPage extends CommonAPI {
    @FindBy(css = "#oneX-sf-logo")
    WebElement statFarmLogo;

//    public boolean isPresent(WebElement element){
//        return element.isDisplayed(statFarmLogo, element);}
    public InspectionPage (WebDriver driver){PageFactory.initElements(driver, this);}
}
