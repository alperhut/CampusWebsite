package StepDefinitions;

import Pages._14_GradeLevel_DialogContent;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _14_GradeLevelSteps {

    _14_GradeLevel_DialogContent gdc = new _14_GradeLevel_DialogContent();
    @And("Create to new GradeLevel")
    public void createToNewGradeLevel(DataTable elements) {

        gdc.findAndClick("addButton");
        gdc.waitUntilLoading();

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i=0; i<listElement.size(); i++)

            gdc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }

    @And("Click to nextGradeLevel")
    public void clickToNextGradeLevel(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i=0; i < listElement.size(); i++){

            gdc.findAndClick(listElement.get(i));
        }
    }

    @Then("Success message should be displayed from GradeLevel")
    public void successMessageShouldBeDisplayedFromGradeLevel() {

        gdc.findAndVerify("successMessage", "success");
    }

    @And("Edit to GradeLevel")
    public void editToGradeLevel(DataTable elements) {

        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

        gdc.findAndClick("editButton");
        gdc.waitUntilLoading();

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)

            gdc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click to Delete button from GradeLevel")
    public void clickToDeleteButtonFromGradeLevel() {

        WebDriverWait wait = new WebDriverWait(GWDBasic.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        gdc.findAndClick("deleteIcon");
        gdc.findAndClick("deleteButton");
    }
}
