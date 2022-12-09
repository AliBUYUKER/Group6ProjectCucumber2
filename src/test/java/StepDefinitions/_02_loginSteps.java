package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _02_loginSteps extends Parent {
    DialogContent dc=new DialogContent();
    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        dc.findAndCaontainText("myAccount", "MY ACCOUNT");
    }

    @And("And Click on the element in the Dialog")
    public void andClickOnTheElementInTheDialog(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);
        for (String strButton : listElemanlar) {
            dc.findAndClik(strButton);
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elemanlar) {
        List<List<String>> listElemanlar = elemanlar.asLists(String.class);

        for (int i = 0; i < listElemanlar.size(); i++)
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));
        // eleman adı                    eleman değeri
    }

    @Then("Login unsuccessfuly")
    public void loginUnsuccessfuly() {
        dc.findAndCaontainText("failed", "failed");
    }
}
