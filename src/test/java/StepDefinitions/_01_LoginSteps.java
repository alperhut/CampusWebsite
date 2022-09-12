package StepDefinitions;

import Pages.LoginContent;
import Utilities.GWDBasic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class _01_LoginSteps {

    LoginContent lc = new LoginContent();
    @Given("Navigate to basqar")
    public void navigate_to_basqar() {
        GWDBasic.getDriver().get("https://demo.mersys.io/");
        GWDBasic.getDriver().manage().window().maximize();
    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {


        lc.findAndSend("username","richfield.edu");
        lc.findAndSend("password","Richfield2020!");
        lc.findAndClick("loginButton");

    }
    @Then("User should login successfuly")
    public void user_should_login_successfuly() {


        lc.findAndVerify("dashboard","Dashboard");

    }
}
