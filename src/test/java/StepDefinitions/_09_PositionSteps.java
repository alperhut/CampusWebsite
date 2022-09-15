package StepDefinitions;

import Pages._09_Position_DialogContent;
import Utilities.GWDBasic;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _09_PositionSteps {
    _09_Position_DialogContent pdc=new _09_Position_DialogContent();

    @And("Create to new {string}, {string} from Position")
    public void createToNewFromPosition(String name, String shortName) {
        pdc.findAndClick("addButton");
        pdc.findAndSend("nameInput",name);
        pdc.findAndSend("shortName", shortName);
        pdc.findAndClick("saveButton");
    }

    @And("Edit to {string}, {string}  from Position")
    public void editToFromPosition(String newName, String newShortName) {
        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

        pdc.findAndClick("editButton");
        pdc.findAndSend("nameInput",newName);
        pdc.findAndSend("shortName", newShortName);
        pdc.findAndClick("saveButton");

    }

    @And("Click to Delete Button from Position")
    public void clickToDeleteButtonFromPosition() {
        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        pdc.findAndClick("deleteIcon");
        pdc.findAndClick("deleteButton");
    }



}
