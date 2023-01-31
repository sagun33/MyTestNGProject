package maypracticetestng.pages;

import maypracticetestng.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath ="//*[@src='/static/images/home/logo.png']")
    public WebElement visibleHompage;

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement signUp;

    @FindBy(xpath = "//*[@src='/static/images/home/logo.png']")
    public WebElement homePageTitle;



}
