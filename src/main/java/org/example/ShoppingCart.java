package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//Create child class ShoppingCart Page extends with parent class Util
public class ShoppingCart extends Util
{
    private By _shoppingCartText = By.xpath("//h1[text()=\"Shopping cart\"]");
    // To create Private Variable (for security) + store Locator in private variable
    String expectedTitleOfThePage = "Shopping cart";// message store in string
    private By _hTCOneM8AndroidL50LollipopText = By.xpath("//td[4]/a[text()=\"HTC One M8 Android L 5.0 Lollipop\"]");
    // To create Private Variable (for security) + store Locator in private variable
    String expectedHTCOneM8AndroidL50LollipopText = "HTC One M8 Android L 5.0 Lollipop";
    // message store in string
    private By _hTCOneMiniBlueText = By.xpath("//td[4]/a[text()=\"HTC One Mini Blue\"]");
    // To create Private Variable (for security) + store Locator in private variable
    String expectedHTCOneMiniBlueText = "HTC One Mini Blue";
    // message store in string

    public void toVerifyUserIsOnShoppingCartPage()  //create method to store all relative actions
    {
        Assert.assertEquals(getTextFromElement(_shoppingCartText),expectedTitleOfThePage, "User is not on Shopping Cart Page");
        //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
    }
    public void toVerifyUserHasAddCorrectProductToCart()    //create method to store all relative actions
    {
        Assert.assertEquals(getTextFromElement(_hTCOneM8AndroidL50LollipopText),expectedHTCOneM8AndroidL50LollipopText, "User Have add wrong Product To Cart");
        //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_hTCOneMiniBlueText), expectedHTCOneMiniBlueText, "User Have add wrong Product To Cart");
    }   //Compare (Assert) actual and expected Message + when condition will fail then message will print in console

}
