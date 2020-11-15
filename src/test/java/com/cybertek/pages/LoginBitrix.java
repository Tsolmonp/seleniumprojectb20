package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBitrix {

    public LoginBitrix() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement LogInButton;

    @FindBy(id="feed-add-post-form-tab-tasks")
    public WebElement TaskButton;

    @FindBy(id="tasks-task-priority-cb")
    public WebElement HighPriorityButton;

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        LogInButton.click();
        TaskButton.click();
        HighPriorityButton.click();

    //@FindBy(id="feed-add-post-form-tab-tasks" )
          //  public void WebElement taskButton;
    }
}