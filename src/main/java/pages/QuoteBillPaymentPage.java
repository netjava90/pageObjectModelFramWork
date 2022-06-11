package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteBillPaymentPage extends CommonAPI {
    //Auto quote
    @FindBy(xpath = "//span[text()='Get a Quote']")
    private WebElement getQuote;
    @FindBy(css = "#getaquote-select-product")
    private WebElement product;
    @FindBy(css = "#getaquote-zip")
    private WebElement zipCode;
    @FindBy(css = "#getaQuoteButton")
    private WebElement startQuoteBtn;

    //pay bill
    @FindBy(xpath = "//span[text()='Pay a Bill']")
    private WebElement payBill;
    @FindBy(css = "#pay-a-bill-paymentSelect")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNum;
    @FindBy(xpath = "//input[@name='dob']")
    private WebElement dateOfBirth;
    @FindBy(css = "#pay-a-bill-submitButton")
   private WebElement payNowBtn;
//    @FindBy(css = "//button[@class='-oneX-btn-primary -oneX-btn-fit-content']")
//    WebElement continueBtn;

    //RoadSideAssistance
    @FindBy(xpath="//span[text()='Claims']")
    private WebElement claim;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[6]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1] ")
    private WebElement roadSideAssistance;
    //a[text()='Roadside Assistance']
    //a[@class='-oneX-btn-primary__anchor -oneX-btn-medium']
    @FindBy(xpath = "//body/div[@id='content']/section[@id='17-3152508']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement getRoadSideAssistanceBtn;
    @FindBy(css = "//button[@id='start-request']")
    WebElement startMyRequest;


    public QuoteBillPaymentPage(WebDriver driver) {PageFactory.initElements(driver, this);}


    //quote
    public void getQuote() {
        click(getQuote);
    }
    public void selectFromMenuDropdown(String option) {
        selectFromDropdown(product, option);
    }
    public void zipCode(String zip) {
        type(zipCode, zip);
    }
    public void clickOnStartQuoteBtn() {
        click(startQuoteBtn);
    }

    //bill
    public void clickOnPayBill() {click(payBill);}
    public void selectOptionFromMenuDropdown(String option) {selectFromDropdown(phoneNumber, option);}
    public void typePhoneNum(String phNum){type(phoneNum, phNum);}
    public void typeDateOfBirth(String DOB){type(dateOfBirth, DOB);}
    public void clickOnPayNowBtn(){click(payNowBtn);}

//    public void clickOnContinueBtn(){click(continueBtn);}

    //Roadside assistance
    public void clickOnClaim(){
        click(claim);
    }
    public void clickOnRoadSideAssistance(){
        click(roadSideAssistance);
    }

    public void clickOnGetRoadSideAssistanceBtn(){click(getRoadSideAssistanceBtn);}




//    public void suggestDropDown(){
//        click(startMyRequest);
//        startMyRequest.sendKeys("Can", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//    }



}