package org.example;

import org.openqa.selenium.By;

public class Computer extends Util      //Create child class Computer extends with parent class
{        // To create Private Variable (for security) + store Locator in private variable
    private By _desktop = By .xpath("//div[@class=\"side-2\"]/div/div[2]/ul/li/ul/li[1]/a"); // click on Desktop


    public void clickOnDesktop()    //create method to store all relative action
    {
        waitUntilElementIsClickAble(_desktop,40);   // add explicitly wait to allow some extra time before action
        clickOnElement(_desktop);   // click on product
    }




}
