package stepdefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC1_page;
import utilities.Driver;

public class TC5_Stepdefinition {
    TC1_page tc1_page=new TC1_page();
    Actions action = new Actions(Driver.getDriver());


    @Then("clickk {string} button")
    public void clickk_button(String string) {
       tc1_page.SearchButton.click();
        action.click(tc1_page.SearchButton)
                .sendKeys("Sweet Hugs")
                .sendKeys(Keys.TAB).perform();
    }

    @Then("Verfy TEXT {string} is visible successfuly")
    public void verfy_text_is_visible_successfuly(String string) {
        Assert.assertTrue(tc1_page.VerfyProductName.isDisplayed());
    }
    @Then("Write {string} Text")
    public void write_text(String string) {
        action.click(tc1_page.MessageCard)
                .sendKeys("This is for you")
                .sendKeys(Keys.TAB).perform();
    }



    }


