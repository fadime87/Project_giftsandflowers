package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TC1_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC1_Stepdefinition {

    TC1_page tc1_page=new TC1_page();
    Faker faker=new Faker();


    @Given("Navigate to url {string}")
    public void navigate_to_url(String giftsandflowerUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("giftsandflowerUrl"));
    }


    @Then("Click on {string} button")
    public void click_on_button(String string) {
       tc1_page.MyAccountButton.click();
    }

    @Then("Click {string} button")
    public void click_button(String string) {
        tc1_page.CreateAccountButton.click();
    }

    @Then("Enter {string}")
    public void enter(String string) {
        tc1_page.EmailButton.sendKeys(faker.internet().emailAddress());
    }

    @Then("Clickk {string} button")
    public void clickk_button(String string) {
        tc1_page.RegisterButton.click();
    }


}
