package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//Create child class EmailSuccessfulMessage extends with parent class Util
public class EmailSuccessfulMessage extends Util
{   // To create Private Variable (for security) + store Locator in private variable
    private By _successfulMessage = By.xpath("//div[@class=\"result\"]");
    // store Expected Message in String
    String expectedTextMessage = "Your message has been sent.";

    //create method to store all relative actions
    public void toVerifyUserShouldAbleToSeeSuccessfulMessage()
    {   //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_successfulMessage),expectedTextMessage, "your email has not been send Successful");
    }
}
