package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _08_Field_DC extends Parent {

    LeftNavCommon lnc = new LeftNavCommon();

    public _08_Field_DC() {
        PageFactory.initElements(GWDBasic.getDriver(), this);
    }

    WebElement myElement;

    @FindBy(xpath = "//ms-add-button[@tooltip='GENERAL.BUTTON.ADD']")
    private WebElement fieldaddButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchName;
    @FindBy(xpath = "//ms-search-button//button/*/*")
    private WebElement searchButton;
    @FindBy(xpath = "(//*[@data-icon='pen-to-square'])[1]")
    private WebElement editButton;
    @FindBy(xpath = "(//*[@data-icon='trash-can'])[1]")
    private WebElement deleteIcon;
    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[text()='Text']")
    private WebElement fieldtype;
    @FindBy(xpath = "//span[text()=' Integer ']")
    private WebElement integertype;

    public void FindAndClick(String element) {
        switch (element) {
            case "fieldaddButton":
                myElement = fieldaddButton;
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
            case "fieldtype":
                myElement = fieldtype;
                break;
            case "integertype":
                myElement = integertype;
                break;
            case "searchName":
                myElement = searchName;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndSend(String element, String value) {

        switch (element) {
            case "nameInput": myElement = nameInput; break;
            case "searchName": myElement = searchName;break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndVerify(String element, String text) {

        switch (element) {
            case "successMessage": myElement = successMessage; break;
        }
        verifyContainsText(myElement, text);
    }

}
