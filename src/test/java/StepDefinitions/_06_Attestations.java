package StepDefinitions;

import Pages.LeftNavCommon;
import Pages._06_Attestations_DialogContent;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _06_Attestations {

    LeftNavCommon lnc = new LeftNavCommon();

    _06_Attestations_DialogContent dc = new _06_Attestations_DialogContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            lnc.findAndClick(listElement.get(i));
        }
    }

    @And("Create to new {string}")
    public void createToNew(String attestations) {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", attestations);
        dc.findAndClick("saveButton");
        dc.waitUntilLoading();
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.waitUntilLoading();
        dc.findAndVerify("successMessage", "success");
    }

    @And("Edit to {string}")
    public void editTo(String newAttestations) {

        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", newAttestations);
        dc.findAndClick("saveButton");
        dc.waitUntilLoading();
    }


    @And("Click to Delete Button from Attestations")
    public void clickToDeleteButtonFromAttestations() {

        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        dc.findAndClick("deleteIcon");
        dc.findAndClick("deleteButton");

    }

}
