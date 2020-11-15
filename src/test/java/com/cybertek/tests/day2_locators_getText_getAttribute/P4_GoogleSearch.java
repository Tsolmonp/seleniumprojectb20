package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {
        //TC #4: Google search
        //1- Open chrome browser
        //setup the browser driver
        WebDriverManager.chromedriver().setup();
        //create driver instance and open chrome browser
        WebDriver driver = new ChromeDriver();

        //2- go to: https://google.com
        driver.get("https://google.com");

        //3- write apple in search box
        //to be able to write anything in the search box
        //I need to locate the search box and use sendKey()method to send "apple"
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with "apple-Google Search"
        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();
       /* driver.get("https:youtube.com");
        driver.findElement(By.name("search_query")).sendKeys("No Women No Cry"+ Keys.ENTER);
        */
        if (actualTitle.equals(expectedTitle)) {

            System.out.println("Search title verification PASSED!");

        } else {
            System.out.println("Search title verification FAILED!!!");
        }
    }
}
