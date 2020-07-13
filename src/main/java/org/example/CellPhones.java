package org.example;

import org.openqa.selenium.By;

public class CellPhones extends Util    //Create child class CellPhone extends with parent class
{       // To create Private Variable (for security) + store Locator in private variable
    private By _hTCOneM8bAndroidL50Lollipop = By.xpath("//div[@data-productid=\"18\"]/div[2]/div[3]/div[2]/input[1]");
    // To create Private Variable (for security) + store Locator in private variable
    private By _closePageHTCOneLollipop = By.cssSelector("span.close");
    // To create Private Variable (for security) + store Locator in private variable
    private By _hTCOneMiniBlue = By.xpath("//div[@class=\"item-grid\"]/div[2]/div/div[2]/div[3]/div[2]/input[1]");
    // To create Private Variable (for security) + store Locator in private variable
    private By _closePageHTCOneMiniBlue = By.cssSelector("Span.close");
    // To create Private Variable (for security) + store Locator in private variable
    private By _shoppingCart = By.xpath("//span[text()=\"Shopping cart\"]");

    public void addProductToShoppingCart()  //create method to store all relative action
    {
        clickOnElement(_hTCOneM8bAndroidL50Lollipop);   // click on first product
        clickOnElement(_closePageHTCOneLollipop);       // click on close current page
        //waitUntilElementIsClickAble(_hTCOneMiniBlue,80); // add explicitly wait

        javaScriptClickONElement(_hTCOneMiniBlue); // click on second Item + add wait by using Java script

        clickOnElement(_closePageHTCOneMiniBlue); // click on close current page
        //waitUntilElementIsClickAble(_shoppingCart,40);    // add explicitly wait
        javaScriptClickONElement(_shoppingCart);    // click on second Item + add wait by using Java script
    }


}
