package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        //1st set up the web driver
        WebDriverManager.chromedriver().setup();
        System.setProperty("driver.type","path to the driver");
        //2nd create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3rd test if driver is working
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: "+driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println("Actual Title String:"+actualTitle);

        String actualUrl = driver.getCurrentUrl();

        System.out.println("actualUrl = "+actualUrl);

        System.out.println("actualUrl = " + actualUrl);


        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");

          driver.close();
    }
}
