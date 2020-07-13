package org.example;

import org.openqa.selenium.By;

public class Desktop extends Util   //Create child class Desktop extends with parent class
{   // To create Private Variable (for security) + store Locator in private variable + click on Desktop by using linkText
    private By _DigitalStorm = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    //create method to store all relative action + click on product
    public void clickOnDigitalStorm()
    {
        clickOnElement(_DigitalStorm);
    }
}