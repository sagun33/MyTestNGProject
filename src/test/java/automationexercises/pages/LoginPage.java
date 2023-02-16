package automationexercises.pages;

import automationexercises.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignUp;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement name;
     @FindBy(xpath = "//*[@data-qa='signup-email']")
     public WebElement signUpEmail;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUpButton;
    }
