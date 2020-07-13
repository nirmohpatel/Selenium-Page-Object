package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//Create child class RegistrationSuccessfully Page extends with parent class Util
public class RegistrationSuccessfully extends Util
{
        private By _registrationSuccessfullyMassage = By.xpath("//div/div[text()=\"Your registration completed\"]");
    // To create Private Variable (for security) + store Locator in private variable
        String expectedTextMessage = "Your registration completed"; // message store in string
        private By _continueButton = By.xpath("//input[@class=\"button-1 register-continue-button\"]");
    // To create Private Variable (for security) + store Locator in private variable
    public void toVerifyUserIsRegistrationSuccessfulMessage()   //create method to store all relative actions
    {
        Assert.assertEquals(getTextFromElement(_registrationSuccessfullyMassage),expectedTextMessage, "user has not been registration Successful");
    }   //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
    public void toVerifyUserClickOnContinueButton()     //create method to store all relative actions
    {
        waitUntilElementIsClickAble(_continueButton,80);
        // add explicitly wait to allow some extra time before action
        clickOnElement(_continueButton); // click on Continue Button
    }
}
