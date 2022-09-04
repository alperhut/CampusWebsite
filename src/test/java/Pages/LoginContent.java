package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginContent extends Parent{
    public LoginContent() {

        PageFactory.initElements(GWDBasic.getDriver(),this);

    }
    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    WebElement myElement;

    public void findAndSend(String element, String value){

        switch (element){

            case "username" : myElement = username;break;
            case "password" : myElement = password;break;

        }
        sendKeysFunction(myElement,value);
    }
    public void findAndClick(String element){

        switch (element){

            case "loginButton" : myElement = loginButton;break;

        }
        clickFunction(myElement);
    }
    public void findAndVerify(String element, String text){

        switch (element){

            case "dashboard" : myElement = dashboard;break;

        }
        verifyContainsText(myElement,text);
    }
}
