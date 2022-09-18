package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWDBasic.getDriver(),this);
    }
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    private WebElement successVerify;


    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement searchInputOne;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement searchInputTwo;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton;

    @FindBy(css = "ms-search-button button")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(css = "ms-edit-button>button")
    private WebElement editButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "(//ms-text-field//input)[3]")
    private WebElement name_F;

    @FindBy(xpath = "(//ms-text-field//input)[4]")
    private WebElement code_F;

    @FindBy(xpath = "(//mat-select[@role]//div[@cdk-overlay-origin])[2]")
    private WebElement fieldType;

    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement text;

    @FindBy(css = "[formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "//*[contains(@formcontrolname,'Stage')]")
    private WebElement stageOne;

    @FindBy(xpath = "(//*[@role='option'])[2]")
    private WebElement stageTwo;

    @FindBy(css = "[type='text'][pattern='[0-9]*']")
    private WebElement capacity;

    @FindBy(css = "[formcontrolname='code']>input")
    private WebElement integrationCode;

    @FindBy(css = "[formcontrolname='priority']>input")
    private WebElement priority;

    @FindBy(css = "[formcontrolname='description']>input")
    private WebElement descriptionInput;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private  WebElement name_GL;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private  WebElement shortNm_GL;

    @FindBy(xpath = "(//ms-text-field//input)[3]")
    private  WebElement order_GL;

    @FindBy(xpath = "//td[text()='GrLv_Hy']//following::ms-edit-button//button")
    private WebElement edit_GL;

    @FindBy(xpath = "//td[text()='GrLv_Yh']//following::ms-delete-button//button")
    private WebElement delete_GL;


    @FindBy(css = "[formcontrolname='iban']>input")
    private WebElement ibanInput;


    @FindBy(xpath = "//*[contains(@formcontrolname,'currency')]")
    private WebElement currency;


    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement currencyselect;


    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement currencyselect2;


    @FindBy(css = "[formcontrolname='integrationCode']>input")
    private WebElement integrationCode2;


    @FindBy(xpath = "//td[text()='zzz']//following::ms-edit-button//button")
    private WebElement edit_D;


    @FindBy(xpath = "//td[text()='zz']//following::ms-delete-button//button")
    private WebElement delete_D;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "searchInputOne":
                myElement = searchInputOne;
                break;
            case "searchInputTwo":
                myElement = searchInputTwo;
                break;
            case "name_F":
                myElement = name_F;
                break;
            case "code_F":
                myElement = code_F;
                break;
            case "description":
                myElement = description;
                break;
            case "capacity":
                myElement = capacity;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priority":
                myElement = priority;
                break;
            case "descriptionInput":
                myElement = descriptionInput;
                break;
            case "name_GL":
                myElement = name_GL;
                break;
            case "shortNm_GL":
                myElement = shortNm_GL;
                break;
            case "order_GL":
                myElement = order_GL;
                break;
            case "ibanInput":
                myElement = ibanInput;
                break;
            case "integrationCode2":
                myElement = integrationCode2;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;

            case "addButton":
                myElement = addButton;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "editButton":
                myElement = editButton;
                break;
            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;
            case "fieldType":
                myElement = fieldType;
                break;
            case "text":
                myElement = text;
                break;
            case "stageOne":
                myElement = stageOne;
                break;
            case "stageTwo":
                myElement = stageTwo;
                break;
            case "edit_GL":
                myElement = edit_GL;
                break;
            case "delete_GL":
                myElement = delete_GL;
                break;
            case "currency":
                myElement = currency;
                break;
            case "currencyselect":
                myElement = currencyselect;
                break;
            case "currencyselect2":
                myElement = currencyselect2;
                break;
            case "edit_D":
                myElement = edit_D;
                break;
            case "delete_D":
                myElement = delete_D;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "successVerify":
                myElement = successVerify;
                break;

        }
        verifyContainsText(myElement, text);
    }


    public void searchAndDelete(String searchText) {
        findAndSend("searchInputOne", searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");
    }
}
