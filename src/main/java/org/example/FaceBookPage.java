package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Util
{
    private String expectedFaceBookURL = "https://www.facebook.com/nopCommerce";
    //String expectedFaceBookURL = "";
    private By _actualTextForCreateAPageButton = By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    String expectedTextForCreateAPageButton = "Create a Page";
    String actualColourValue = "rgba(66, 183, 42, 1)";
    String expectedColourValue = "rgba(66, 183, 42, 1)";




    public void toVerifyFacebookPopupWindow()
    {
        String MainWindow=driver.getWindowHandle(); // To handle Main window

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                String actualURLFromCurrentPage = driver.getCurrentUrl();//Get URL from Popup Window

                Assert.assertEquals(actualURLFromCurrentPage,expectedFaceBookURL, "User is not on Facebook window");
                // create a page verification
                Assert.assertEquals(getTextFromElement(_actualTextForCreateAPageButton),expectedTextForCreateAPageButton,"Create A Button is not on Facebook Page");

                // to verification of Button Colour
                String Colour = driver.findElement(_actualTextForCreateAPageButton).getCssValue("background-color");
                System.out.println(Colour);
                Assert.assertEquals(actualColourValue,expectedColourValue,"Colour is not Green");

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);


    }


}
