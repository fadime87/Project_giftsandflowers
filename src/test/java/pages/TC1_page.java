package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class TC1_page {

    public TC1_page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//span[@class='wd-tools-icon']")
    public WebElement MyAccountButton;

    @FindBy(xpath = "//a[@class='btn btn-style-link btn-color-primary create-account-button']")
    public WebElement CreateAccountButton;

    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement EmailButton;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement RegisterButton;
//************
    @FindBy(xpath = "//a[@href='https://giftsandflowers.co.ke/my-account/customer-logout/?_wpnonce=fbe012ad76']")
    public WebElement LogoutButton;

    //*************

    @FindBy(xpath = "//button[@name='register']")
    public WebElement RegisterButton1;


}
