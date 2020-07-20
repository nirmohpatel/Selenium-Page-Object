package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util
{   //Create child class BestTest extends with parent class Util
    BrowserManager browserManager = new BrowserManager(); // create Object to call all browser opening action

    @BeforeMethod
    public void openBrowser() // Create method for Open Browser
    {
        browserManager.setBrowser(); // this method have all pre condition method for open browser
    }
    @AfterMethod
    public void closeBrowser(ITestResult result) //create method for Close Browser
    {
     if (ITestResult.FAILURE==result.getStatus())
    {
        takeScreenShot(result.getName()+timestamp());
    }
        browserManager.closeBrowser();  // this method have all pre condition method for close browser
       }
}
