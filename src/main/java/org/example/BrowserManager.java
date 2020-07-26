package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util    //Create BrowserManager class for Open and Close Browser
{
    public void setBrowser() // create Method for start up browser
    {
//        String browserName = "chrome";
//
//        if (browserName.equalsIgnoreCase("chrome"))
//        {
//        // setting up chrome driver path
//        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
//        // create chrome driver object to open Google Chrome browser
//        driver = new ChromeDriver();
//        }else if (browserName.equalsIgnoreCase("firefox"))
//        {
//            // setting up chrome driver path
//            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
//            // create chrome driver object to open Google Chrome browser
//            driver = new FirefoxDriver();
//        } else if (browserName.equalsIgnoreCase("ie"))
//        {
//            // setting up chrome driver path
//            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\ie.exe");
//            // create chrome driver object to open Google Chrome browser
//            driver = new ieDriver();
//        } else
//            {
//                System.out.println("you browser name is wrong or empty" + browserName);
//            }
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
