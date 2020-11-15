package com.cybertek.tests.Assign_Jira;

import com.cybertek.pages.LoginPageVytrack;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests_Vytrack {
    //TC#30 : Vytrack negative login testàWrong Password Test
    // 1. Go to https://qa3.vytrack.com
    //2. Enter correct username
    //3. Enter incorrect password
    //4. Verify error message text is as expected Expected:
    // “Invalid user name or password.”
    //Note: Follow Page Object Model design pattern,
    // and get your correct credentials from configuration.properties file
    LoginPageVytrack loginPageVytrack;
    @Test(description = "using login method for negative test")
    public void negative_login_test1(){
        // Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));

        String url = ConfigurationReader.getProperty("vytrackUrl");
        Driver.getDriver().get(url);

         loginPageVytrack = new LoginPageVytrack();

        loginPageVytrack.usernameInput.sendKeys("User169");



        String password = "incorrect";
        String username = ConfigurationReader.getProperty("vytrack_username");
        loginPageVytrack.passwordInput.sendKeys(username);

        loginPageVytrack.loginButton.click();



        Assert.assertTrue(loginPageVytrack.errorMessage.isDisplayed(),
               "Error message is not displayed. Verification Failed!");


        //loginPageVytrack.usernameInput.sendKeys("test");
        //loginPageVytrack.loginButton.click();

    }

    @Test(description = "using login method for negative test")
    public void negative_login_test2(){
        String url = ConfigurationReader.getProperty("vytrackUrl");
        Driver.getDriver().get(url);

        loginPageVytrack = new LoginPageVytrack();

        String username = "incorrect";
        String password = ConfigurationReader.getProperty("vytrack_password");

        loginPageVytrack.login(username, password);

       Assert.assertTrue(loginPageVytrack.errorMessage.isDisplayed(),
            " Verification Failed!");
    }

    @Test(description = "Vytrack positive login testSales Manager")
    public void positive_login_test3() {
        //Driver.getDriver().get(ConfigurationReader.getProperty("vytrack");
        String url = ConfigurationReader.getProperty("vytrackUrl");
        Driver.getDriver().get(url);

        loginPageVytrack = new LoginPageVytrack();

        String password = ConfigurationReader.getProperty("SalesManager_password");
        loginPageVytrack.passwordInput.sendKeys(password);

        String username = ConfigurationReader.getProperty("SalesManager_username");
        loginPageVytrack.usernameInput.sendKeys(username);

        loginPageVytrack.loginButton.click();

        //       Assert.assertTrue(loginPageVytrack.);
    }
}

