package pages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoPaperLessPage extends CommonAPI {

    //go paperless
    @FindBy(xpath ="//a[contains(text(),'Go paperless')]")
    WebElement goPaperLessBtn;
    @FindBy( css = "#phoneNumber-input")
    WebElement  phoneNumber;      ;
    @FindBy(css = "#dob-input")
    WebElement dateOfBirth;       ;
    @FindBy( css = "#auth-primary-button")
    WebElement continueButton;

    //auto pay
    @FindBy(xpath = "//a[text()='Enroll in AutoPay']")
    WebElement autoPay;

    public GoPaperLessPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //go paper less
    //public void ScrollDownToView(){scrollToView(goPaperLessBtn);}
    public void scrollToView(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);}

    public void ScrollToViewGoPaperLessBtn(WebDriver driver){
        scrollToView(goPaperLessBtn, getDriver());}

    public void clickOnPaperLess(){click(goPaperLessBtn);}
    public void typePhoneNum(String Num){type(phoneNumber, Num);}
    public void typeDateOfBirth(String Dob) {
        type(dateOfBirth, Dob);
    }
    public void clickOnContinue(){
        click(continueButton);
    }


    //auto pay
    public void clickOnAutoPay(){click(autoPay);}




}
