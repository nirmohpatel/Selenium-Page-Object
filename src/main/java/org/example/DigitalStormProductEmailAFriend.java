package org.example;

import org.openqa.selenium.By;
//Create child class DigitalStormProductEmailAFriend extends with parent class
public class DigitalStormProductEmailAFriend extends Util
{   // To create Private Variable (for security) + store Locator in private variable
    private By _friendEmail = By.cssSelector("input#FriendEmail");
    // To create Private Variable (for security) + store Locator in private variable
    private By _yourEmailAddress = By.cssSelector("input#YourEmailAddress");
    // To create Private Variable (for security) + store Locator in private variable
    private By _personalMessage = By.cssSelector("textarea.your-email");
    // To create Private Variable (for security) + store Locator in private variable
    private By _sendButton = By.xpath("//input[contains(@value,\"Send email\")]");

    //create method to store all relative actions
    public void toVerifyUserShouldEmailAFriend()
    {    // enter friend email id
        typeText(_friendEmail,"patelnirmoh"+timestamp()+"@gmail.com");
        // Here i have to skip this field, Because of, this field get the data from registration page (field Email)
        //typeText(_yourEmailAddress,"nirmohpatelunique1"+timestamp()+"@gmail.com");
        // enter Text persona Message
        typeText(_personalMessage,"This product is very Good with best price.");
    }
    //create method to store all relative action + click on product
    public void sendButton()
    {
        clickOnElement(_sendButton);
    }
}
