package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class New_Online_Store_Page extends Util  //Create child class New online store page extends with parent class Util
{
    // To create Private Variable (for security) + store Locator in private variable
    // verify user is on New Online store page
    private By _leaveYourCommentMessage = By.xpath("//strong[text()=\"Leave your comment\"]");
    // Store message in string
    String _expectedTextMessage = "Leave your comment";
    // store title locator in variable
    private By _titleText = By.id("AddNewComment_CommentTitle");
    // store comment locator in variable
    private By _commentText = By.xpath("//textarea[@id=\"AddNewComment_CommentText\"]");
    // store New Comment Button locator in variable
    private By _newCommentButton = By.name("add-comment");
    // store verify Comment message locator in variable
    private By _verifyComment = By.xpath("//p[text()=\"Nirmoh's Comment\"]");
    // expected message in string
    String _expectedCommentMessage = "Nirmoh's Comment";
    // store new Comment successfully add locator in variable
    private By _newCommentIsSuccessfullyAdd = By.xpath("//div [text()=\"News comment is successfully added.\"]");
    // expected message in string
    String _expectedNewCommentIsSuccessfullyAdd = "News comment is successfully added.";


    public void toVerifyUserIsOnNewOnlineStoreIsOpenPage () // create Method to verify New Online Store page
    {
        //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_leaveYourCommentMessage),_expectedTextMessage, "User is not on New Online store Is Open Page");
    }

    public void toVerifyUserEnterValidDetailsAndLeaveCommentSuccessfully()  // create Method for enter text for title name + comment
    {   // Enter title name by using type text
        typeText(_titleText,"Das");
        // Enter comment text by using type text
        typeText(_commentText, "Nirmoh's Comment");
    }
    public void clickOnNewCommentButton ()  // create Method for clicking action
    {
        clickOnElement(_newCommentButton);  // click on New Comment Button
    }
    public void toVerifyUserTypeCommentSuccessfully() // create Method for verification action
    {   //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_verifyComment),_expectedCommentMessage,"Comment is not been added successfully");

    }
    public void toVerifyUserShouldAbleToSeeCommentSuccessfullyAdd() // create Method for verification action for added message
    {   //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_newCommentIsSuccessfullyAdd),_expectedNewCommentIsSuccessfullyAdd,"New comment is not successfully added.");
    }
}
