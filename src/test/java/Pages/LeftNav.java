package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWDBasic.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanResourcesSetup;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement educationSetup;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentType;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestations;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "setupOne":
                myElement = setupOne;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "humanResourcesSetup":
                myElement = humanResourcesSetup;
                break;
            case "positionCategories":
                myElement = positionCategories;
                break;
            case "discounts":
                myElement = discounts;
                break;
            case "gradeLevels":
                myElement = gradeLevels;
                break;
            case "bankAccounts":
                myElement = bankAccounts;
                break;
            case "schoolSetup":
                myElement = schoolSetup;
                break;
            case "departments":
                myElement = departments;
                break;
            case "locations":
                myElement = locations;
                break;
            case "education":
                myElement = education;
                break;
            case "educationSetup":
                myElement = educationSetup;
                break;
            case "subjectCategories":
                myElement = subjectCategories;
                break;
            case "positions":
                myElement = positions;
                break;
            case "fields":
                myElement = fields;
                break;
            case "documentType":
                myElement = documentType;
                break;
            case "attestations":
                myElement = attestations;
                break;
            case "nationalities":
                myElement = nationalities;
                break;
        }
        clickFunction(myElement);
    }
}
