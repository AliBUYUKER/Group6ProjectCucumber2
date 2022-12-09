package Pages;

import Utilities.GWD;
import Utilities.GWDBasic;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='login']")
    private WebElement singInButton;
    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement creatEmail;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement createAnAccount;
    @FindBy(id = "id_gender1")
    private WebElement mrGenderRadioButton;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;
    @FindBy(id = "email")
    private WebElement emailInput;
    @FindBy(id = "passwd")
    private WebElement passworInput;
    @FindBy(id = "days")
    private WebElement daysSelect;
    @FindBy(id = "months")
    private WebElement monthsSelect;
    @FindBy(id = "years")
    private WebElement yearsSelect;
    @FindBy(id = "submitAccount")
    private WebElement submitAccount;
    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;
    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement alert;
    @FindBy(xpath = "//div[@class='alert alert-danger']/ol/li")
    private WebElement failed;
    @FindBy(xpath = "//div[@id='center_column']/h1")
    private WebElement myAccount;
    WebElement myelement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "creatEmail":
                myelement = creatEmail;
                break;
            case "firstNameInput":
                myelement = firstNameInput;
                break;
            case "lastNameInput":
                myelement = lastNameInput;
                break;
            case "emailInput":
                myelement = emailInput;
                break;
            case "passworInput":
                myelement = passworInput;
                break;

        }
        sendKeysFunction(myelement, value);
    }

    public void findAndClik(String strElement) {
        switch (strElement) {
            case "singInButton":
                myelement = singInButton;
                break;
            case "createAnAccount":
                myelement = createAnAccount;
                break;
            case "mrGenderRadioButton":
                myelement = mrGenderRadioButton;
                break;
            case "submitAccount":
                myelement = submitAccount;
                break;
            case "submitLogin":
                myelement = submitLogin;
                break;
        }
        clickFunction((myelement));
    }

    public void findAndCaontainText(String strElement, String text) {
        switch (strElement) {
            case "alert":
                myelement = alert;
                break;
            case "failed":
                myelement = failed;
                break;
            case "myAccount":
                myelement = myAccount;
                break;
        }
        verifyContainsTextFunction(myelement, text);

    }

    public void findAndSelect() {
        Select select = new Select(daysSelect);
        select.selectByIndex(7);
        Select select1 = new Select(monthsSelect);
        select1.selectByIndex(7);
        Select select2 = new Select(yearsSelect);
        select2.selectByIndex(4);


    }
}
