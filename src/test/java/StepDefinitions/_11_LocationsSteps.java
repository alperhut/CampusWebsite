package StepDefinitions;

import Pages._11_Locations_DialogContent;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _11_LocationsSteps {

    _11_Locations_DialogContent lodc = new _11_Locations_DialogContent();

    @And("Create to new Locations and shortName  and capacity from location")
    public void createToNewLocationsAndShortNameAndCapacityFromLocation(DataTable elements) {

        lodc.findAndClick("addButton");
        lodc.waitUntilLoading();

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)

            lodc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

    }
    @And("Click to Location type")
    public void clickToLocationType(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            lodc.findAndClick(listElement.get(i));
        }

    }

    @Then("Success message should be displayed from location")
    public void successMessageShouldBeDisplayedFromLocation() {

        lodc.findAndVerify("successMessage", "success");

    }

    @And("Edit to newLocations and newShortName and newcCapacity from location")
    public void editToNewLocationsAndNewShortNameAndNewcCapacityFromLocation(DataTable elements) {
        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

        lodc.findAndClick("editButton");
        lodc.waitUntilLoading();

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)

            lodc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

    }


    @And("Click to Delete Button from Locations")
    public void clickToDeleteButtonFromLocations() {

        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        lodc.findAndClick("deleteIcon");
        lodc.findAndClick("deleteButton");
    }


}
