package StepDefinitions;

import Pages.LeftNavCommon;
import Pages.Parent;
import Pages._08_Field_DC;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _08_Field extends Parent {
    LeftNavCommon lnc=new LeftNavCommon();

    _08_Field_DC fdc=new _08_Field_DC();

    @And("Create new {string}")
    public void createNew(String Field) {


        fdc.FindAndClick("fieldaddButton");
        fdc.findAndSend("nameInput",Field);
        fdc.FindAndClick("fieldtype");
        fdc.FindAndClick("integertype");
        fdc.FindAndClick("saveButton");

    }

    @And("Delete {string}")
    public void delete(String newField) {

        fdc.waitUntilLoading();
        fdc.findAndSend("searchName",newField);
        fdc.FindAndClick("searchButton");
        fdc.waitUntilLoading();
        fdc.FindAndClick("deleteIcon");
        fdc.FindAndClick("deleteButton");


    }

    @And("Edit {string} as {string}")
    public void editAs(String Field,String newField) {

        fdc.waitUntilLoading();
        fdc.findAndSend("searchName",Field );
        fdc.FindAndClick("searchButton");
        fdc.waitUntilLoading();
        fdc.FindAndClick("editButton");
        fdc.findAndSend("nameInput",newField);
        fdc.FindAndClick("saveButton");

    }
    @Then("Success message should be on")
    public void successMessageShouldBeOn() {

        fdc.findAndVerify("successMessage", "success");
    }

}