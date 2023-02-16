package automationexercises.pages;

import automationexercises.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public  SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement login3;

    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//*[@id='id_gender2']")
    public WebElement radiobutton;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement days;

    @FindBy(xpath = "//*[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//*[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//*[@name='newsletter']")
    public WebElement newsLetter1;

    @FindBy(xpath = "//*[@name='optin']")
    public WebElement newsLetter2;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement lastname;

    @FindBy(xpath = "//*[@id='company']")
    public WebElement company;



    @FindBy(xpath = "//*[@id='address1']")
    public WebElement address1;
    @FindBy(xpath = "//*[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//*[@id='state']")
    public WebElement state;

    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//*[@id='mobil_number']")
    public WebElement mobilnumber;
}
