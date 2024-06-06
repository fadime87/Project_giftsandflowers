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

    @FindBy(xpath = "//li[@id='menu-item-7485']")
    public WebElement HomeButton;

    @FindBy(xpath = "(//div[@class='info-box-content'])[2]")
    public WebElement FlowersButton;

    @FindBy(xpath = "//h1[@class='entry-title']")
    public WebElement VerfyFlowersText;

    @FindBy(xpath = "(//h3[@class='product-title'])[2]")
    public WebElement SelectProduct;

    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    public WebElement VerfyProductName;

    @FindBy(xpath = "//span[@style='color:#236ab5;cursor:pointer;']")
    public WebElement EditButton;

    @FindBy(xpath = "//span[@class='message-card clearfix']")
    public WebElement MessageCard;

    @FindBy(xpath = "//button[@class='button b-r']")
    public WebElement MessageSave;

    @FindBy(xpath = "//span[@style='color:#236ab5;cursor:pointer;']")
    public WebElement MessageSaved;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement AddToCart;

    @FindBy(xpath = "(//h3[@class='widget-title'])[1]")
    public WebElement VerfyTextShoppingCart;

    @FindBy(xpath = "(//a[@class='close-side-widget wd-cross-button wd-with-text-left'])[2]")
    public WebElement CloseButton;
}
