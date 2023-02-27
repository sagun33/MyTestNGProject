package automationexercises.pages;

import automationexercises.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@src='/static/images/home/logo.png']")
    public WebElement homePageTitle;


    @FindBy(xpath = "//*[@href='/login']")
    public WebElement signUp;




}
