package StepDefinitions;

import Pages.LeftNavCommon;
import Pages.Staj13MAGDialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import java.util.List;

public class Staj13MAG {

    LeftNavCommon ln = new LeftNavCommon();
    Staj13MAGDialogContent dc = new Staj13MAGDialogContent();

    @And("Click on the Bank Account in the left Nav")
    public void clickOnTheBankAccountInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }
    @And("Banka hesabı ekle {string} {string} {string} {string}")
    public void bankaHesabıEkle(String arg0, String arg1, String arg2, String arg3) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", arg0);
        dc.findAndSend("iban", arg1);
        dc.findAndSend("integrationCode", arg3);
        dc.findAndClick("currency");
        dc.findAndClick(arg2);
        dc.findAndClick("saveBttn");
    }
    @Then("Islemi teyit et")
    public void islemiTeyitEt() {
        dc.findAndVerify("successMessage","successful");
    }

    @And("Banka hesabi sil {string}")
    public void bankaHesabiSil(String arg0) {
        dc.findAndSend("searchInput",arg0);
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteButton2");
    }
    @And("Banka hesabi duzenle {string}{string}{string}")
    public void bankaHesabiDuzenle(String arg0, String arg1, String arg2) {
        dc.searchAndWait(arg0);
        dc.findAndClick("editButton");
        dc.findAndClear("nameInput");
        dc.findAndSend("nameInput",arg1);
        dc.findAndClear("iban");
        dc.findAndSend("iban",arg2);
        dc.findAndClick("saveBttn");

    }
}
