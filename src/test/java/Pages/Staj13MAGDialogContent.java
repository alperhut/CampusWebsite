package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Staj13MAGDialogContent extends Parent{
    public Staj13MAGDialogContent() {
        PageFactory.initElements(GWDBasic.getDriver(), this);
    }
    WebElement myElement;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement iban;
    @FindBy(xpath = "//mat-select[@formcontrolname='currency']")
    private WebElement currency;
    @FindBy(xpath = "//span[contains(text(),'TRY')]")
    private WebElement tl;
    @FindBy(xpath = "//span[contains(text(),'USD')]")
    private WebElement usd;
    @FindBy(xpath = "//span[contains(text(),'EUR')]")
    private WebElement eur;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveBttn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button/*/*")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteButton2;
    @FindBy(xpath = "//ms-edit-button[1]")
    private WebElement editButton;
    @FindBy(xpath = "//div[contains(text(),'Bank Account successfully')]")
    private WebElement successMessage;



    public void findAndClick(String element) {

        switch (element) {
            case "addButton": myElement = addButton;break;
            case "currency": myElement = currency;break;
            case "tl": myElement = tl;break;
            case "usd": myElement = usd;break;
            case "eur": myElement = eur;break;
            case "saveBttn": myElement = saveBttn;break;
            case "searchButton": myElement = searchButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "deleteButton2": myElement = deleteButton2;break;
            case "editButton": myElement = editButton;break;
        }
        clickFunction(myElement);
    }
    public void findAndSend(String element, String value) {

        switch (element) {
            case "nameInput": myElement = nameInput;break;
            case "iban": myElement = iban;break;
            case "integrationCode": myElement = integrationCode;break;
            case "searchInput": myElement = searchInput;break;
        }
        sendKeysFunction(myElement, value);
    }
    public void findAndVerify(String element, String text) {

        switch (element) {
            case "successMessage": myElement = successMessage;break;
        }
        verifyContainsText(myElement, text);
    }

    public void findAndClear(String element) {

        switch (element) {
            case "nameInput": myElement = nameInput;break;
            case "iban": myElement = iban;break;

        }
        clearFunction(myElement);
    }
    public void searchAndWait(String searchText){


        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        WebDriverWait wait=new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

    }
}
