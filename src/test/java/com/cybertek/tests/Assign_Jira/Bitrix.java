package com.cybertek.tests.Assign_Jira;

import com.cybertek.pages.LoginBitrix;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class Bitrix {
    LoginBitrix loginBitrix;

    @Test
    public void login_test1() {
        String url = ConfigurationReader.getProperty("bitrixUrl");
        Driver.getDriver().get(url);
       // loginPage = new LoginPage();
        loginBitrix = new LoginBitrix();

        String password = ConfigurationReader.getProperty("bitrix_password");
        loginBitrix.passwordInput.sendKeys(password);

        String username = ConfigurationReader.getProperty("bitrix_username");
        loginBitrix.usernameInput.sendKeys(username);
        loginBitrix.LogInButton.click();
        loginBitrix.TaskButton.click();
        loginBitrix.HighPriorityButton.click();

      //  Assert.assertTrue(loginBitrix."Passed".getisDisplayed(),
               //  "Error message is not displayed. Verification Failed!");


    }

   // @Test
   // public void
}