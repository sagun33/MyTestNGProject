package maypracticetestng.test;

import com.github.javafaker.Faker;
import maypracticetestng.pages.HomePage;
import maypracticetestng.pages.LoginPage;
import maypracticetestng.pages.SignUpPage;
import maypracticetestng.utility.*;
import org.apache.commons.logging.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterUser {



    HomePage homePage;
    LoginPage loginPage;
    SignUpPage signUpPage;

    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;




    @Test
    public void customerLogin() throws IOException {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        SignUpPage signUpPage = new SignUpPage();

        String path = "./src/test/resources/dataMyTest1.xlsx";
        String sayfa = "Sayfa1";

        excelUtils = new ExcelUtils(path, sayfa);
        excelDatalari = excelUtils.getDataList();







        for (Map<String, String> data : excelDatalari) {

            //2. Navigate to url 'http://automationexercise.com'
            Driver.getDriver().get(ConfigReader.getProperty("url"));

            //        3. Verify that home page is visible successfully
            assert homePage.homePageTitle.isDisplayed();

            //4. Click on 'Signup / Login' button
            homePage.signUp.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle

            //5. Verify 'New User Signup!' is visible
            assert loginPage.newUserSignUp.isDisplayed();

            //        6. Enter name and email address
            loginPage.name.sendKeys(data.get("name"));
            ReusableMethods.waitFor(1);
            loginPage.signUpEmail.sendKeys(data.get("email"));
            ReusableMethods.waitFor(1);

            //        7. Click 'Signup' button
            loginPage.signUpButton.click();
            signUpPage.radiobutton.click();

            //        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
            assert signUpPage.enterAccountInformation.isDisplayed();

            // 9. Fill details: Title, Name, Email, Password, Date of birth
            signUpPage.password.sendKeys(data.get("password2"));
            ReusableMethods.waitFor(3);



            //        11. Select checkbox 'Receive special offers from our partners!'
            signUpPage.newsLetter2.click();

            //        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
            Select days =new Select(signUpPage.days);
            days.selectByVisibleText("27");
            ReusableMethods.waitFor(3);
            Select months=new Select(signUpPage.months);
            months.selectByVisibleText("September");
            ReusableMethods.waitFor(3);
            Select years=new Select(signUpPage.years);
            years.selectByVisibleText("1982");
            ReusableMethods.waitFor(3);
            signUpPage.firstName.sendKeys(data.get("firstname"));
            signUpPage.lastname.sendKeys(data.get("lastname"));
            signUpPage.company.sendKeys(data.get("company"));
            signUpPage.address1.sendKeys(data.get("adres1"));
            signUpPage.address2.sendKeys(data.get("adres2"));


            Select country=new Select(signUpPage.country);
            country.selectByVisibleText("Canada");
            signUpPage.state.sendKeys(data.get("state"));
            signUpPage.city.sendKeys(data.get("city"));
            signUpPage.zipcode.sendKeys(data.get("zipcode"));
            ReusableMethods.waitFor(3);


//        13. Click 'Create Account button'
            signUpPage.createAccountButton.click();

//            14. Verify that 'ACCOUNT CREATED!' is visible





//
//
//
//
//
//
//



            }

//        Driver.closeDriver();

        }




    }








//



//
//        15. Click 'Continue' button
//        16. Verify that 'Logged in as username' is visible
//        17. Click 'Delete Account' button
//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button//sible and click 'Continue' button