package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _05_PositionPageOFG extends Parent {
    WebElement myElement;

    public _05_PositionPageOFG() {

        PageFactory.initElements(GWDBasic.getDriver(), this);
    }

    //HumanResource
    //*********************************************
    //leftNava eklenecek
    @FindBy(xpath = "//fuse-nav-vertical-collapsable//span[text()='Human Resources']")
    private WebElement humanResource;
    @FindBy(xpath = "//fuse-nav-vertical-collapsable//span[text()='Setup']/following::span[55]")
    private WebElement HumanResourceSetup;
    @FindBy(xpath = "//fuse-nav-vertical-collapsable//span[text()='Position Categories']")
    private WebElement humanResourcePositionCategories;

    //*********************************************************
    // Start of General Elements
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//mat-dialog-actions/ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//fa-icon/*")//button[@aria-label='Close dialog']
    private WebElement closeDialog;
    /* @FindBy(xpath = "//div/button[text()='button']")
     private WebElement closeDialogcarpi;*/
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button/*/*")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "//button//following::button[11]/*/*/*/*")
    private WebElement editButton;
    @FindBy(xpath = "//mat-dialog-actions//span[text()=' Delete ']")
    private WebElement deleteDialogButton;
    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement cookiesAccept;
    @FindBy(xpath = "//ms-browse-table//tbody")
    private WebElement searchSearch;
    @FindBy(xpath = "//mat-form-field//ms-text-field")//Flash gecene kadar bekle elementi
    private WebElement flashWait;
    @FindBy(xpath = "//ms-edit-button/button")//Flash gecene kadar bekle elementi
    private WebElement stainlessElement;
    @FindBy(xpath = "//tr[@role='row'][1]")//Flash gecene kadar bekle elementi
    private WebElement elemets;
    @FindBy(xpath = "//button[@tabindex='-1']")//Flash gecene kadar bekle elementi
    private WebElement cancel;
    @FindBy(css = "Omar AGA")//Flash gecene kadar bekle elementi
    private WebElement name;
    @FindBy(css = "Omar Faruk AGA")//Flash gecene kadar bekle elementi
    private WebElement name2;






   /* @FindBy(xpath = "//td")//Flash gecene kadar bekle elementi
    private WebElement positionListName;*/





    //End of  General Elements

    public void SendFunctionOmerPom(String strElement, String text) {
        switch (strElement) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
           /* case "humanResourcePositionCategories" : myElement = humanResourcePositionCategories;break;
            case "Attestations" : myElement = Attestations;break;*/
        }
        sendKeysFunction(myElement, text);
    }

    public void ClickFunctionOmerPom(String element) {
        switch (element) {
            case "humanResource":
                myElement = humanResource;
                break;
            case "HumanResourceSetup":
                myElement = HumanResourceSetup;
                break;
            case "humanResourcePositionCategories":
                myElement = humanResourcePositionCategories;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
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
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "cookiesAccept":
                myElement = cookiesAccept;
                break;

        }

        clickFunction(myElement);
    }

    public void VerifyFunctionOmerPom(String strElement, String text) {
        switch (strElement) {
            case "successMessage":
                myElement = successMessage;
                break;
            case "alreadyExist":
                myElement = alreadyExist;
                break;
           // case "positionListName" : myElement = positionListName;break;
           /* case "humanResourcePositionCategories" : myElement = humanResourcePositionCategories;break;
            case "Attestations" : myElement = Attestations;break;*/
        }
        verifyContainsText(myElement, text);
    }

    public void WaitStainlessAndClickPom(String strElement) {
        switch (strElement) {
            case "editButton":
                myElement = editButton;
                break;
         /*   case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;*/

        }
        WebDriverWait wait=new WebDriverWait(GWDBasic.getDriver(),Duration.ofSeconds(30));
       /* wait.until(ExpectedConditions.elementToBeClickable(myElement));
        myElement.click();*/
        wait.until(ExpectedConditions.stalenessOf(myElement));

        myElement.click();
    }




    public void WaitUntilVisible(String strElement) {
        switch (strElement) {
            //case "searchSearch": myElement = searchSearch;break;
            // case "positionListName": myElement = positionListName;break;

        }
        WebDriverWait wait = new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(myElement));
    }

    public void WaitUntilStainlessPom(String strElement){
        switch (strElement) {
            case "stainlessElement": myElement = stainlessElement;break;
           // case "positionListName": myElement = positionListName;break;

        }
        WebDriverWait wait = new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));

wait.until(ExpectedConditions.stalenessOf(myElement));



    }
    public void WaitUntilFlashPom(String strElement,String attribute,String text){
        switch (strElement) {
            //case "flashWait": myElement = flashWait;break;
            case "searchButton": myElement = searchButton;break;
        }
        WebDriverWait wait = new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));

wait.until(ExpectedConditions.attributeContains(myElement,attribute,text));


    }

    public void WaitAllElemetsVisible(String strElement){

        switch (strElement) {
            //case "flashWait": myElement = flashWait;break;
            case "elemets": myElement = elemets;break;
            case "name": myElement = name;break;
            case "name2": myElement = name2;break;
        }


        WebDriverWait wait = new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(myElement));
    }
    public void WaitUntilElementClickable(String strElement){

        switch (strElement) {
            //case "flashWait": myElement = flashWait;break;
            case "searchButton": myElement = searchButton;break;
        }


        WebDriverWait wait = new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(myElement));
    }

public void ActionClassPom(String elements){

    switch (elements) {
        //case "flashWait": myElement = flashWait;break;
        case "editButton": myElement = editButton;break;
        case "deleteButton": myElement = deleteButton;break;
        case "deleteDialogButton": myElement = deleteDialogButton;break;
    }
    WebDriverWait wait = new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOf(myElement));
    wait.until(ExpectedConditions.elementToBeClickable(myElement));
    Actions actions=new Actions(GWDBasic.getDriver());
    Action action=actions.click(myElement).build();
    action.perform();

}
}


/*
cdk-focused cdk-program-focused*/
