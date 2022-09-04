package Pages;

import Utilities.GWDBasic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavCommon extends Parent{

    public LeftNavCommon() {
        PageFactory.initElements(GWDBasic.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement underHRsetup;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement Attestations;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUp;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    WebElement myElement;

    public void findAndClick(String element){
        switch (element){
            case "acceptCookies" : myElement = acceptCookies;break;
            case "HResources" : myElement = HResources;break;
            case "underHRsetup" : myElement = underHRsetup;break;
            case "Attestations" : myElement = Attestations;break;
            case "setUp" : myElement = setUp;break;
            case "schoolSetup" : myElement = schoolSetup;break;
            case "locations" : myElement = locations;break;
        }
        clickFunction(myElement);
    }

}
