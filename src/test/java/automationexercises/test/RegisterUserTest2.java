package automationexercises.test;

import automationexercises.pages.HomePage;
import automationexercises.pages.LoginPage;
import automationexercises.pages.SignUpPage;
import automationexercises.utility.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterUserTest2 {





    HomePage homePage;
    LoginPage loginPage;
    SignUpPage signUpPage;


    @Test(dataProvider="kullaniciBilgileri",dataProviderClass = DataProviderUtils.class)
    public void test1(String name,String email,String password,String firstname,String lastname,String company)
    {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        homePage =new HomePage();
        loginPage =new LoginPage();
        signUpPage=new SignUpPage();
        homePage.signUp.click();
        loginPage.name.sendKeys(name);
        loginPage.signUpEmail.sendKeys(email);
        loginPage.signUpButton.click();
        signUpPage.password.sendKeys(password);
        ReusableMethods.waitFor(2);

        Select days =new Select(signUpPage.days);
        days.selectByVisibleText("27");
        ReusableMethods.waitFor(3);
        Select months=new Select(signUpPage.months);
        months.selectByVisibleText("September");
        ReusableMethods.waitFor(3);
        Select years=new Select(signUpPage.years);
        years.selectByVisibleText("1982");
        ReusableMethods.waitFor(3);

        signUpPage.firstName.sendKeys(firstname);
        signUpPage.lastname.sendKeys(lastname);
        signUpPage.company.sendKeys(company);

        ReusableMethods.waitFor(3);

        Driver.closeDriver();


    }




}


