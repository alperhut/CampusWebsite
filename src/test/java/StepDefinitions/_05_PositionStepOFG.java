package StepDefinitions;

import Pages._05_PositionPageOFG;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;


public class _05_PositionStepOFG {
    _05_PositionPageOFG pom = new _05_PositionPageOFG();

   /* @When("Click on the element in the Omer's LeftNav")
    public void clickOnTheElementInTheOmerSLeftNav(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.ClickFunctionOmerPom(listElements.get(i));
        }
    }*/

    @And("Click on the element in the Omer's DialogContent")
    public void clickOnTheElementInTheOmerSDialogContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.ClickFunctionOmerPom(listElements.get(i));
        }
    }

    @And("Send on the element in the Omer's DialogContent")
    public void sendOnTheElementInTheOmerSDialogContent(DataTable elements) {
        List<List<String>> listElements = elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.SendFunctionOmerPom(listElements.get(i).get(0), listElements.get(i).get(1));
        }
    }

    @Then("Verify on the element in the Omer's DialogContent")
    public void verifyOnTheElementInTheOmerSDialogContent(DataTable elements) {
        List<List<String>> listElements = elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.VerifyFunctionOmerPom(listElements.get(i).get(0), listElements.get(i).get(1));
        }
    }

    @And("Wait until visible")
    public void waitUntilVisible(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.WaitUntilVisible(listElements.get(i));
        }
    }

    @And("Wait stainless and Click in the Omer's DialogContent")
    public void waitStainlessAndClickInTheOmerSDialogContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.WaitStainlessAndClickPom(listElements.get(i));
        }
    }

    @And("Wait Until Flash DialogContent")
    public void waitUntilFlashDialogContent(DataTable elements) {
        List<List<String>> listElements = elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.WaitUntilFlashPom(listElements.get(i).get(0), listElements.get(i).get(1), listElements.get(i).get(2));
        }
    }

    @When("Go to HumanResource in the Omer's DialogContent")
    public void goToHumanResourceInTheOmerSDialogContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.ClickFunctionOmerPom(listElements.get(i));
        }

    }

    @And("Wait Stainless in the Omer's DialogContent")
    public void waitStainlessInTheOmerSDialogContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.WaitUntilStainlessPom(listElements.get(i));
        }
    }

    @And("Wait until all elements visible in the Omer's DialogContent")
    public void waitUntilAllElementsVisibleInTheOmerSDialogContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.WaitAllElemetsVisible(listElements.get(i));

        }
    }

    @And("Wait until element to be clickable Omer's DialogContent")
    public void waitUntilElementToBeClickableOmerSDialogContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.WaitUntilElementClickable(listElements.get(i));
        }
    }

    @And("Action class in the Omer's DialogContent")
    public void actionClassInTheOmerSDialogContent(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.ActionClassPom(listElements.get(i));
        }
    }
}