package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//Create child class Util extends with parent class Base Page
public class Util extends BasePage

{

    public static void waitUntilElementIsClickAble(By by,int TimeInSeconds)
    // this explicitly wait method to allow some extra time before action
    {
        WebDriverWait wait = new WebDriverWait(driver,TimeInSeconds);
        // create WebDriver Object
    }
    public static void threadSleep()
    // this thread sleep method to allow some extra time before action
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    // click able method for clicking action

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    // By using inBuild return type method, store text value in String

    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    // type text method for enter text
    public static long timestamp()
    {
        return(System.currentTimeMillis());
    }
    // by using this method add time in email address
    public static void selectFromDropDownByVisibleText(By by,String text)// this method use for drop down menu action
    {
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropDownByIndex(By by,int n) // this method use for drop down menu action
    {
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(by));
        select.selectByIndex(n);
    }
    public static void selectFromDropDownByValue(By by,String value) // this method use for drop down menu action
    {
        org.openqa.selenium.support.ui.Select select = new Select(driver.findElement(by));
        select.selectByValue(value);}
        public static void javaScriptClickONElement(By by)   // re use abel method for click on element in the case of other clickable method is not working
        {
    WebElement element = driver.findElement(by);
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element);}
}
