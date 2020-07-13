package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{   //Create child class TestSuit extends with parent class BaseTest
    HomePage homePage = new HomePage(); // create HomePage Object
    RegistrationPage registrationPage = new RegistrationPage(); //  create Registration page  Object
    RegistrationSuccessfully registrationSuccessfully = new RegistrationSuccessfully();
    //create  object for registration Successfully class
    Computer computer = new Computer(); //create  object for Computer class
    Desktop desktop = new Desktop(); //create  object for Desktop class
    DigitalStormEmailAFriend digitalStormEmailAFriend = new DigitalStormEmailAFriend();
    //create  object for DigitalStorm Product Email A Friend  class
    DigitalStormProductEmailAFriend digitalStormProductEmailAFriend = new DigitalStormProductEmailAFriend();
    //create  object for digitalStormProductEmailAFriend class
    EmailSuccessfulMessage emailSuccessfulMessage = new EmailSuccessfulMessage();
    //create  object for emailSuccessfullyMessage  class
    Electronics electronics = new Electronics(); //create  object for electronics class
    CellPhones cellPhones = new CellPhones(); //create  object for cell phone class
    ShoppingCart shoppingCart = new ShoppingCart(); //create  object for shoppingCart class


    @Test (priority = 0)   // giver test case run priority
    public void toVerifyUserShouldAbleToRegisterSuccessfully() // Test case one
    {   // call all test case one action in this method
        homePage.toVerifyUserIsOnHomePage();
        homePage.clickOnRegistrationButton();
        registrationPage.toVerifyUserIsOnRegistrationPage();
        registrationPage.toVerifyUserEnterRegistrationDetails();
        registrationPage.toVerifyUserClickOnRegistrationButton();
        registrationSuccessfully.toVerifyUserIsRegistrationSuccessfulMessage();
        registrationSuccessfully.toVerifyUserClickOnContinueButton();
    }
    @Test (priority = 1) // giver test case run priority
    public void toVerifyUserShouldAbleToReferProductToFriend() // Test Case Second
    {    // call all test case Second action in this method
        toVerifyUserShouldAbleToRegisterSuccessfully();
        homePage.clickOnComputer();
        computer.clickOnDesktop();
        desktop.clickOnDigitalStorm();
        digitalStormEmailAFriend.clickOnEmailAFriend();
        digitalStormProductEmailAFriend.toVerifyUserShouldEmailAFriend();
        digitalStormProductEmailAFriend.sendButton();
        emailSuccessfulMessage.toVerifyUserShouldAbleToSeeSuccessfulMessage();
    }
    @Test (priority = 2) // giver test case run priority

    public void toVerifyUserShouldAbleToAddProductToCart() // Test Case three
    {   // call all test case Second action in this method
        homePage.clickOnElectronics();
        electronics.clickOnCellPhone();
        cellPhones.addProductToShoppingCart();
        shoppingCart.toVerifyUserIsOnShoppingCartPage();
        shoppingCart.toVerifyUserHasAddCorrectProductToCart();

    }
}
