package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;



public class HomePage extends Util  //Create child class Home Page extends with parent class Util
{
    // To create Private Variable (for security) + store Locator in private variable
    private By _welComeTitleText = By.xpath("//div/h2[text()=\"Welcome to our store\"]"); // verify user is on home page
    String expectedTitleOfThePage = "Welcome to our store";// message store in string
    private By _registerButton = By.className("ico-register");//Click on registration page
    private By _computer = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a"); //click on computer
    private By _electronics = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");  //click on computer
    private By _searchButton = By.xpath("//input[@type=\"submit\"]");//click on submit
    private By _newHomeStoreIsOpen = By.linkText("New online store is open!"); // click on new online store is open
    private By _facebookIcon = By.xpath("//a[text()=\"Facebook\"]");
    private By _currency = By.xpath("//select[@id=\"customerCurrency\"]");
    private By _USD = By.xpath("//select[@id=\"customerCurrency\"]/option[1]");
    private By _Euro = By.xpath("//select[@id=\"customerCurrency\"]/option[2]");


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

    public void clickOnSearchButton()
    {
        clickOnElement(_searchButton);
    } // click on search Button

    public void clickOnNewHomeStoreIsOpen()
    {
        clickOnElement(_newHomeStoreIsOpen);
    } // click on New Home Store Is Open

    public void clickOnFaceBookIcon()
    {
    clickOnElement(_facebookIcon);
    } // click on facebook Icon

    public void selectCurrency()    // select the currency from dropdown menu
    {

        selectFromDropDownByVisibleText(_currency,"US Dollar"); // select the currency from dropdown menu
        // create list variable and store xpath for product
        List <WebElement> productList = driver.findElements(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div"));
        // create list variable and store xpath for product price
        List<WebElement> productCost = driver.findElements(By.xpath("//div[@class=\"item-grid\"]//div[@class=\"prices\"]"));
        // print statement
        System.out.println("Total product in Grid :- " + productList.size());
        // to compare list of item and there price
        Assert.assertEquals(productList.size(),productCost.size());

        for (WebElement _currency:productCost)
        {
            System.out.println(_currency.getText());
        }

        //selectFromDropDownByVisibleText(_currency,"US Dollar");
//        clickOnElement(_USD);
//        //System.out.println("US Dollar");
//        //selectFromDropDownByVisibleText(_Euro, "Euro");
//        if (_currency == _Euro)
//        {
//            System.out.println("USD");
//        }else
//        {
//            System.out.println("Euro");
//        }


    }
    public void toVerifyAlertPopupWindowText()
    {
        Alert alert = driver.switchTo().alert();
        String actualAlertMassage = driver.switchTo().alert().getText();
        System.out.println(actualAlertMassage);
        String expectedAlertMassage = "Please enter some search keyword";
        Assert.assertEquals((actualAlertMassage),expectedAlertMassage);
        alert.accept();
    }

}

