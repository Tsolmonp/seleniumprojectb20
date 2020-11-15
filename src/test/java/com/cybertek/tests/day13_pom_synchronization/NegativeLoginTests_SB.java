package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests_SB {
    LoginPage loginPage;
    @Test(description = "entering incorrect username")
    public void negative_login_test1(){
       // Driver.getDriver().get(ConfigurationReader.getProperty("smartbearUrl"));

        String url = ConfigurationReader.getProperty("smartbearUrl");
        Driver.getDriver().get(url);
        //When we create the instance of this class, the constructor  immediately
        //E
        LoginPage loginPage = new LoginPage();
        //#2 Call the
        loginPage.usernameInput.sendKeys("adfga");

        String password = ConfigurationReader.getProperty("smartbear_password");
        loginPage.passwordInput.sendKeys(password);

        loginPage.loginButton.click();

        //assert true that error message is displayed on the page
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),
                "Error message is not displayed. Verification Failed!");


        //loginPage.usernameInput.sendKeys("test");
        //loginPage.loginButton.click();

    }

    @Test(description = "using login method for negative test")
    public void negative_login_test2(){
        String url = ConfigurationReader.getProperty("smartbearUrl");
        Driver.getDriver().get(url);

        loginPage = new LoginPage();

        String username = "wrongpassword";
        String password = ConfigurationReader.getProperty("smartbear_password");

        loginPage.login(username, password);

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),
                "Error message is not displayed. Verification Failed!");

    }
}
