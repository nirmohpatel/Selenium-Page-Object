package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

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
    New_Online_Store_Page new_online_store_page = new New_Online_Store_Page(); //create  object for New_Online_Store_Page class
    FaceBookPage faceBookPage = new FaceBookPage(); //create  object for FaceBookPage class
    IFrameExample iFrameExample = new IFrameExample(); //create  object for IFrameExample class


    @Test (priority = 0)
    public void toVerifyEachProductOnHomePage ()
    {
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div/div/div[2]/h2"));
        for (WebElement product:productList)
        {
            System.out.println(product.getText());
        }
    }

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
    {   // call all test case Thard action in this method
        homePage.clickOnElectronics();
        electronics.clickOnCellPhone();
        cellPhones.addProductToShoppingCart();
        shoppingCart.toVerifyUserIsOnShoppingCartPage();
        shoppingCart.toVerifyUserHasAddCorrectProductToCart();
    }
    @Test (priority = 3) // giver test case run priority
    public void toVerifyAlertPractice() // Test Case Four
    { // call all test case four action in this method
        homePage.clickOnSearchButton();
        homePage.toVerifyAlertPopupWindowText();

    }
    @Test (priority = 4) // giver test case run priority
    public void toVerifyUserShouldAbleNavigateOnNewOnlineStorePage ()
    {
        homePage.clickOnNewHomeStoreIsOpen();
        new_online_store_page.toVerifyUserIsOnNewOnlineStoreIsOpenPage();
        new_online_store_page.toVerifyUserEnterValidDetailsAndLeaveCommentSuccessfully();
        new_online_store_page.clickOnNewCommentButton();
        new_online_store_page.toVerifyUserTypeCommentSuccessfully();
        new_online_store_page.toVerifyUserShouldAbleToSeeCommentSuccessfullyAdd();
    }
    @Test (priority = 5) // giver test case run priority
    public void toVerifyUserShouldAbleToNavigateOnFacebookPage()
    {
        homePage.clickOnFaceBookIcon();
        faceBookPage.toVerifyFacebookPopupWindow();

    }

    @Test (priority = 6) // giver test case run priority
    public void toVerifyUserShouldBeAbelToChangeCurrency()
    {
        homePage.selectCurrency();
    }

    @Test (priority = 7) // giver test case run priority
    public void iFramePractice ()
    {
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");// over riding URL
        iFrameExample.toVerifyUserOnIFrameHomePage();//verify user is on correct website
        iFrameExample.toVerifyUserAbleToTypeText(); // type Topic Name

    }
}
