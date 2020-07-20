package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class IFrameExample extends Util
{
    private By _actualFramesExampleText = By .xpath("//h1[text()=\"Frames Examples in Selenium Webdriver\"]");
    String expectedIFramesExampleText = "Frames Examples in Selenium Webdriver";
    private By _topic = By.xpath("//input[@type=\"text\"]");
    private By _innerFrameCheckBox = By.xpath("//input [@id=\"a\"]");
    private By _animalName= By.xpath("//select[@id=\"animals\"]");





    public void toVerifyUserOnIFrameHomePage()
    {
        Assert.assertEquals(getTextFromElement(_actualFramesExampleText),expectedIFramesExampleText,"User is not on IFrame Examples page ");
    }

    public void toVerifyUserAbleToTypeText()
    {
        //waitUntilElementIsClickAble(_topic,40);
        driver.switchTo().frame("frame1");
        typeText(_topic,"Text Topic");
        driver.switchTo().frame("frame3");
        clickOnElement(_innerFrameCheckBox);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        selectFromDropDownByVisibleText(_animalName,"Avatar");
    }
}
