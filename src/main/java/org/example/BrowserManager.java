package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util    //Create BrowserManager class for Open and Close Browser
{
    public void setBrowser() // create Method for start up browser
    {
        // setting up chrome driver path
        System.setProperty("webdriver.chrome.driver","src\\test\\BrowserDrivers\\chromedriver.exe");
        // create chrome driver object to open Google Chrome browser
        driver=new ChromeDriver();
        // maximising screen
        driver.manage().window().maximize();
        // Applying implicitly wait of 10 sec to driver instance
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // open the URL
        driver.get("https://demo.nopcommerce.com/");
    }
    // create new method for Close Browser
    public void closeBrowser() { driver.close();}// reusable method to close browser
}
