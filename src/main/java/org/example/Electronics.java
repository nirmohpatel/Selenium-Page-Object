package org.example;

import org.openqa.selenium.By;
//Create child class Electronics extends with parent class
public class Electronics extends Util
{   // To create Private Variable (for security) + store Locator in private variable
    private By _cellPhones = By.xpath("//h2/a[text()=\" Cell phones \"]");

    //create method to store all relative actions + click on Cell Phone
    public void clickOnCellPhone ()
    {
        clickOnElement(_cellPhones);
    }
}
