package maypracticetestng.test;

import maypracticetestng.pages.HomePage;
import maypracticetestng.pages.LoginPage;
import maypracticetestng.pages.SignUpPage;
import maypracticetestng.utility.ConfigReader;
import maypracticetestng.utility.Driver;
import maypracticetestng.utility.ExcelUtils;
import maypracticetestng.utility.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterUserTest2 {
    @DataProvider
    public Object[][] kullaniciBilgileri() {


        String path="./src/test/java/resources/dataMyTest1.xlsx";
        String sheetName ="Sayfa1";
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);
        Object[][] bilgiler =excelUtils.getDataArrayWithoutFirstRow();

        return bilgiler;

        };




    HomePage homePage;
    LoginPage loginPage;
    SignUpPage signUpPage;


    @Test(dataProvider="kullaniciBilgileri")
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


