package StepDefinitions;

import Pages._11_Locations_DialogContent;
import Utilities.GWDBasic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _11_LocationsSteps {

    _11_Locations_DialogContent lodc = new _11_Locations_DialogContent();

    @And("Create to new {string} and {string}  and {string} from location")
    public void createToNewAndAndFromLocation(String name, String shortName, String capacity) {

        lodc.findAndClick("addButton");
        lodc.findAndSend("nameInput", name);
        lodc.findAndSend("shortNameInput", shortName);
        lodc.findAndClick("locationType");
        lodc.findAndClick("locTypeOther");
        lodc.findAndSend("capacity", capacity);
        lodc.findAndClick("saveButton");

    }

    @Then("Success message should be displayed from location")
    public void successMessageShouldBeDisplayedFromLocation() {

        lodc.waitUntilLoading();
        lodc.findAndVerify("successMessage", "success");

    }

    @And("Edit to {string} and {string} and {string} from location")
    public void editToAndAndFromLocation(String name, String newShort, String newcapacity) {

        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

        lodc.findAndClick("editButton");
        lodc.findAndSend("nameInput", name);
        lodc.findAndSend("shortNameInput", newShort);
        lodc.findAndClick("locationType");
        lodc.findAndClick("locTypeOther");
        lodc.findAndSend("capacity", newcapacity);

    }

    @And("Click to Delete Button from location")
    public void clickToDeleteButtonFromLocation() {


        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        lodc.findAndClick("deleteIcon");
        lodc.findAndClick("deleteButton");

    }

}
