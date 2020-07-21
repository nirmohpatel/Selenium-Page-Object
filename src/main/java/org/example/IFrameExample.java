package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class IFrameExample extends Util     //Create child class IFrame Example extends with parent class Util
{   // To create Private Variable (for security) + store Locator in private variable
    // verify user is on Frames Example Home Page
    private By _actualFramesExampleText = By .xpath("//h1[text()=\"Frames Examples in Selenium Webdriver\"]");
    // Store message in string
    String expectedIFramesExampleText = "Frames Examples in Selenium Webdriver";
    // xpath for Topic box
    private By _topic = By.xpath("//input[@type=\"text\"]");
    // Xpath for Inner Frame Check Box
    private By _innerFrameCheckBox = By.xpath("//input [@id=\"a\"]");
    // Xpath for Animal Name Drop Down box
    private By _animalName= By.xpath("//select[@id=\"animals\"]");





    public void toVerifyUserOnIFrameHomePage() // create Method to verify Frames Example Home Page
    {   //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_actualFramesExampleText),expectedIFramesExampleText,"User is not on IFrame Examples page ");
    }

    public void toVerifyUserAbleToTypeText() // create Method to verify enter Data
    {
        // switch driver from Frames Example Home Page to frame1
        driver.switchTo().frame("frame1");
        // Enter Topic name by using type text
        typeText(_topic,"Text Topic");
        // switch driver from frame1 to frame3
        driver.switchTo().frame("frame3");
        // click on check box
        clickOnElement(_innerFrameCheckBox);
        // switch driver from frame3 to Frames Example Home Page + child frame to get back to main frame
        driver.switchTo().defaultContent();
        // switch driver from Frames Example Home Page to frame2
        driver.switchTo().frame("frame2");
        // select name by using Dropdown menu
        selectFromDropDownByVisibleText(_animalName,"Avatar");
        // switch driver from frame2 to Frames Example Home Page + child frame to parent frame
        driver.switchTo().parentFrame();
    }
}
