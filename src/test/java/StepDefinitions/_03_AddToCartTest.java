package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_AddToCartTest {
    HomePage hm=new HomePage();
    @And("Hover over a random product.")
    public void hoverOverARandomProduct() {
hm.randomDress();

    }

    @When("Click on Summer dress.")
    public void clickOnSummerDress() {
        hm.moveToElement();
        hm.findAndClik("SummerDress");
    }

    @And("Click Add to cart.")
    public void clickAddToCart() {
        hm.findAndClik("AddToCard");
    }

    @Then("Verify that the product has been added to the card.")
    public void verifyThatTheProductHasBeenAddedToTheCard() {
        hm.deneme();
        hm.findAndCaontainText("successfully","1 item");
    }
}
