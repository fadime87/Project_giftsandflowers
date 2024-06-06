package stepdefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC1_page;
import org.junit.Assert;
import utilities.Driver;

import java.security.Key;

public class TC3_Stepdefinition {
    TC1_page tc1_page=new TC1_page();

    Actions action = new Actions(Driver.getDriver());

    @Then("Click on {string} page")
    public void click_on_page(String string) {
        tc1_page.HomeButton.click();
    }

    @Then("Click {string} buttonn")
    public void click_buttonn(String string) {
       tc1_page.FlowersButton.click();
    }

    @Then("Verify that page {string} is visible successfully")
    public void verify_that_page_is_visible_successfully(String string) {
        Assert.assertTrue(tc1_page.VerfyFlowersText.isDisplayed());
    }

    @Then("Select Product {string}")
    public void select_product(String string) {
      tc1_page.SelectProduct.click();
    }

    @Then("veryf that text {string}")
    public void veryf_that_text(String string) {
       Assert.assertTrue(tc1_page.VerfyProductName.isDisplayed());
    }

    @Then("Click {string} Button")
    public void click_button(String string) {
       tc1_page.EditButton.click();
    }

    @Then("Write {string} text")
    public void write_text(String string) {
    action.click(tc1_page.MessageCard)
            .sendKeys("All the best")
            .sendKeys(Keys.TAB).perform();

    }

    @Then("Click on {string} buttonnn")
    public void click_on_buttonnn(String string) {
       tc1_page.MessageSave.click();
    }

    @Then("Verfy text {string} is visible successfully")
    public void verfy_text_is_visible_successfully(String string) {
       Assert.assertTrue(tc1_page.MessageSaved.isDisplayed());
    }
    @Then("Click {string}")
    public void click(String string) {
        tc1_page.AddToCart.click();
    }
    @Then("Click on {string} buttons")
    public void click_on_buttons(String string) {
        tc1_page.CloseButton.click();
    }








}
