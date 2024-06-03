package stepdefinition;

import io.cucumber.java.en.Then;
import pages.TC1_page;

public class TC2_Stepdefinition {
    TC1_page tc1_page=new TC1_page();

    @Then("click {string} button")
    public void click_button(String string) {
       tc1_page.LogoutButton.click();
    }

}
