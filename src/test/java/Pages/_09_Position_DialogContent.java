package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _09_Position_DialogContent extends Parent {
    public _09_Position_DialogContent() {
        PageFactory.initElements(GWDBasic.getDriver(), this);
    }
    WebElement myElement;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//*[@data-icon='pen-to-square'])[1]")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteIcon;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")

    private WebElement deleteButton;


    public void findAndClick(String element) {

        switch (element) {
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "editButton":
                myElement = editButton;
                break;
            case "deleteIcon":
                myElement = deleteIcon;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
        }
        clickFunction(myElement);
    }
    public void findAndSend(String element, String value) {

        switch (element) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
        }
        sendKeysFunction(myElement, value);
}
    public void findAndVerify(String element, String text) {

        switch (element) {
            case "successMessage":
                myElement = successMessage;
                break;
        }
        verifyContainsText(myElement, text);
    }
}


