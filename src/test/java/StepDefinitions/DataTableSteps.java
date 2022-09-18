package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DataTableSteps {

    LeftNav lnc = new LeftNav();

    DialogContent dc = new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWDBasic.getDriver(), Duration.ofSeconds(30));

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            lnc.findAndClick(listElement.get(i));
        }
    }
    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
            if (listElement.get(i).equals("stageTwo")) {
                Actions actions = new Actions(GWDBasic.getDriver());
                actions.keyDown(Keys.TAB).perform();
                actions.keyUp(Keys.TAB).perform();
            }
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndDelete(listElement.get(i));
        }
    }


    @Then("Success message should be displayedd")
    public void successMessageShouldBeDisplayedd() {

        dc.findAndContainsText("successVerify", "successfully");
    }
}
