package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;

public class _01_RegisterSteps {
DialogContent dc=new DialogContent();
    @Given("Naviagate to Website")
    public void naviagateToWebsite() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        GWD.getDriver().manage().window().setPosition(new Point(2000, 0));
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click the Sign in button.")
    public void clickTheSignInButton() {
        dc.findAndClik("singInButton");
    }

    @And("Enter your email address.")
    public void enterYourEmailAddress() {
        dc.findAndSend("creatEmail","Group666@gmail.com");
    }

    @And("Click the Create an account button.")
    public void clickTheCreateAnAccountButton() {
        dc.findAndClik("createAnAccount");
    }
    @Then("Fill in the required information.")
    public void fillInTheRequiredInformation() {
    dc.findAndClik("mrGenderRadioButton");
    dc.findAndSend("firstNameInput","Groupp");
    dc.findAndSend("lastNameInput","Grouplastnname");
    dc.findAndSend("emailInput","Group666@gmail.com");
    dc.findAndSend("passworInput","Group1256");
    dc.findAndSelect();

    }
    @And("Click the Create an Register button.")
    public void clickTheCreateAnRegisterButton() {
        dc.findAndClik("submitAccount");
    }

    @Then("Verify that you have successfully logged in.")
    public void verifyThatYouHaveSuccessfullyLoggedIn() {
        dc.findAndCaontainText("alert","created");
    }



}
