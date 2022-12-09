package Pages;

import Utilities.GWD;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends Parent {
    public HomePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Women']")
    private WebElement Women;
    @FindBy(xpath = "(//a[text()='Summer Dresses'])[1]")
    private WebElement SummerDress;
    @FindBy(xpath = "//img[@class='replace-2x img-responsive']")
    private List<WebElement> SummerDresses;
    @FindBy(css = "button[name='Submit']")
    private WebElement AddToCard;
    @FindBy(xpath = "//span[@class='ajax_cart_product_txt ']")
    private WebElement successfully;

    WebElement myelement;

    public void findAndClik(String strElement) {
        switch (strElement) {
            case "SummerDress":
                myelement = SummerDress;
                break;
            case "AddToCard":
                myelement = AddToCard;
                break;

        }
        clickFunction((myelement));
    }

    public void findAndCaontainText(String strElement, String text) {
        switch (strElement) {
            case "successfully":
                myelement = successfully;
                break;
        }
        verifyContainsTextFunction(myelement, text);
    }

    public void moveToElement() {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(Women).perform();
    }

    public void randomDress() {
        ArrayList<String> dresses = new ArrayList<>();
        for (WebElement w : SummerDresses) {
            dresses.add(w.getAttribute("src"));
        }
        WebElement gorsel = GWD.getDriver().findElement(By.xpath("//img[@src='" + dresses.get(Tools.randomNumber()) + "']"));
        gorsel.click();
    }
    public void deneme(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("text"+successfully.getText());
    }
}
