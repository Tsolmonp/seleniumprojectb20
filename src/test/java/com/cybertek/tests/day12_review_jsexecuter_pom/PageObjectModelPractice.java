package com.cybertek.tests.day12_review_jsexecuter_pom;

import com.cybertek.pages.LoginBitrix;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.LoginPageVytrack;
import org.testng.annotations.Test;

public class PageObjectModelPractice {

    @Test
    public void login_to_smartbear() {
        LoginPage loginPage = new LoginPage();

        //loginPage.usernameInput.sendKeys("anyusername")
    }

    @Test
    public void login_to_vytrack() {
        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();
    }

    @Test
    public void login_to_bitrix() {
        LoginBitrix loginBitrix = new LoginBitrix();
    }
}