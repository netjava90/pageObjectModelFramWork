package pages;

import base.CommonAPI;
import com.sun.deploy.security.ValidationState;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends CommonAPI {

    @FindBy(xpath = "//*[text()='Log in']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@autocomplete='username']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='util-login-password']")
    WebElement password;
    @FindBy(xpath = "//button[@class='-oneX-util-login-button -oneX-btn-primary -oneX-btn-fit-content']")
    WebElement loginButtonSecond;

    @FindBy(xpath = "button[class='-oneX-header-util-menu-btn  -oneX-util-menu-icon-container']")
    WebElement search1;

    public AccountPage (WebDriver driver){PageFactory.initElements(driver, this);}

    public void clickOnLogInButton(){click(loginButton);}
    public void typeUserName(String user){
        type(userName, user);
    }
    public void typePassword(String pass) {
        type(password, pass);
    }
    public void clickLoginButtonSecond(){
        click(loginButtonSecond);
    }


}
