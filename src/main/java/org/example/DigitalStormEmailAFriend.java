package org.example;

import org.openqa.selenium.By;
//Create child DigitalStormEmailAFriend class  extends with parent class
public class DigitalStormEmailAFriend extends Util
{   // To create Private Variable (for security) + store Locator in private variable + click on Desktop by using X path
        private By _emailAFriend = By .xpath("//input[@value=\"Email a friend\"]");
    //create method to store all relative action + click on product
        public void clickOnEmailAFriend()
        {
            clickOnElement(_emailAFriend);
        }

}
