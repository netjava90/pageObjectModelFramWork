package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenBankAccountPage extends CommonAPI {
    //checkingAC
    @FindBy(xpath = "//span[text()='Banking']")
    private WebElement Banking ;
    @FindBy(css = "#oneX-0-banking")
    private WebElement personalBanking;
    @FindBy(xpath = "//a[contains(text(),'Checking, savings, CDs, and credit cards')]")
    private WebElement CheckingSavingsCDSandCreditCards;

    @FindBy(xpath = "//a[text()='Compare checking accounts']")
    private WebElement checkingAccount ;

    //HomeLoan
    @FindBy(xpath = "//a[text()='Home Loans']")
    private WebElement homeLoan;

    //credit card
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[4]/a[1]")
    WebElement creditCard;
    @FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/p[2]/span[1]/a[1]")
    WebElement learnMore;
    @FindBy(css = "#thirdPartyLinkModal-continue")
    WebElement Continue;
    public OpenBankAccountPage(WebDriver driver){PageFactory.initElements(driver, this);}

    public void clickOnBanking(){click(Banking);}
    public void clickOnPersonalBanking() {click(personalBanking);}
    public void clickOnChecking(){click(CheckingSavingsCDSandCreditCards);}
    public void clickOnChAccount(){click(checkingAccount);}
    public void scrollToView(String str){scrollToView(CheckingSavingsCDSandCreditCards);}

    //loan
    public void clickOnHomeLoan(){click(homeLoan);}

    //credit card
    public void clickOnCreditCard(){click(creditCard);}
    public void clickOnLearnMore(){click(learnMore);}
    public void clickOnContinueBtn(){click(Continue);}



}
