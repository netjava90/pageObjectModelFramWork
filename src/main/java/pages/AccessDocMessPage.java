package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessDocMessPage extends CommonAPI {
    //documents
    @FindBy(xpath="//header/nav[1]/section[3]/div[1]/div[2]/button[1]")
    WebElement dropDown;
    @FindBy(xpath = "//div[@class='-oneX-header-nav-container']/div/div/ul/li[2]")
    WebElement documents;


    @FindBy(xpath = "//p[@class='btnContinue']")
    WebElement Continue;
    public AccessDocMessPage(WebDriver driver){PageFactory.initElements(driver, this);}
    public void selectFromMenuDropdown(String option) {
        selectFromDropdown(documents, option);
    }


    public void clickOnContinueBtn(){click(Continue);}


}
