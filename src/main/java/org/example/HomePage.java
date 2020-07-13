package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//Create child class Home Page extends with parent class Util
public class HomePage extends Util
{   // To create Private Variable (for security) + store Locator in private variable
    private By _welComeTitleText = By.xpath("//div/h2[text()=\"Welcome to our store\"]"); // verify user is on home page
    String expectedTitleOfThePage = "Welcome to our store";// message store in string
    private By _registerButton = By.className("ico-register");//Click on registration page
    private By _computer = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a"); //click on computer
    private By _electronics = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");  //click on computer

    public void toVerifyUserIsOnHomePage()  //create method to store all relative actions
    {    //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_welComeTitleText),expectedTitleOfThePage,"User is not Homepage");
    }

    //create method to store all relative actions
    public void clickOnRegistrationButton()
    {
    clickOnElement(_registerButton);
    }

    public void clickOnComputer()   //create method to store all relative actions
    {
    //waitUntilElementIsClickAble(_computer,80);  // add explicitly wait
//       threadSleep(); // add threadSleep
    javaScriptClickONElement(_computer);}   // click on second Item + add wait by using Java script

    //create method to store all relative actions

    public void clickOnElectronics()
    {
        //threadSleep();    // add threadSleep
        clickOnElement(_electronics);   // click on Electronics
    }

}
