package stepdefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC1_page;

public class TC4_Stepdefinition {
    TC1_page tc1_page=new TC1_page();

    @Then("Click {string} icon")
    public void click_icon(String string) {
       tc1_page.XiconforRemove.click();
    }

    @Then("Verfy Text {string} is visible successfuly")
    public void verfy_text_is_visible_successfuly(String string) {

        Assert.assertTrue(tc1_page.VerfyProductforRemove.isDisplayed());
    }
    @Then("click {string} Button")
    public void click_button(String string) {
        tc1_page.ReturnToShop.click();
    }

}
