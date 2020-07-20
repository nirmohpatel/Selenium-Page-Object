package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class New_Online_Store_Page extends Util
{
    private By _leaveYourCommentMessage = By.xpath("//strong[text()=\"Leave your comment\"]");
    String _expectedTextMessage = "Leave your comment";
    private By _titleText = By.id("AddNewComment_CommentTitle");
    private By _commentText = By.xpath("//textarea[@id=\"AddNewComment_CommentText\"]");
    private By _newCommentButton = By.name("add-comment");
    private By _verifyComment = By.xpath("//p[text()=\"Nirmoh's Comment\"]");
    String _expectedCommentMessage = "Nirmoh's Comment";
    private By _newCommentIsSuccessfullyAdd = By.xpath("//div [text()=\"News comment is successfully added.\"]");
    String _expectedNewCommentIsSuccessfullyAdd = "News comment is successfully added.";


    public void toVerifyUserIsOnNewOnlineStoreIsOpenPage ()
    {
        Assert.assertEquals(getTextFromElement(_leaveYourCommentMessage),_expectedTextMessage, "User is not on New Online store Is Open Page");
    }

    public void toVerifyUserEnterValidDetailsAndLeaveCommentSuccessfully()
    {
        typeText(_titleText,"Das");
        typeText(_commentText, "Nirmoh's Comment");
    }
    public void clickOnNewCommentButton ()
    {
        clickOnElement(_newCommentButton);
    }
    public void toVerifyUserTypeCommentSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_verifyComment),_expectedCommentMessage,"Comment is not been added successfully");

    }
    public void toVerifyUserShouldAbleToSeeCommentSuccessfullyAdd()
    {
        Assert.assertEquals(getTextFromElement(_newCommentIsSuccessfullyAdd),_expectedNewCommentIsSuccessfullyAdd,"New comment is not successfully added.");
    }
}
