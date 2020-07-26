package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfully registrationSuccessfully = new RegistrationSuccessfully();

    @Given("^user is on HomePage$")
    public void user_is_on_HomePage()
    {
        homePage.toVerifyUserIsOnHomePage();

    }

    @When("^user click on register button$")
    public void user_click_on_register_button()
    {
        homePage.clickOnRegistrationButton();

    }

    @When("^user enter all required registration details$")
    public void user_enter_all_required_registration_details()
    {
        registrationPage.toVerifyUserIsOnRegistrationPage();
        registrationPage.toVerifyUserEnterRegistrationDetails();


    }

    @When("^user clicks on registration button$")
    public void user_clicks_on_registration_button()
    {
        registrationPage.toVerifyUserClickOnRegistrationButton();
    }

    @Then("^user able to registration successfully$")
    public void user_able_to_registration_successfully()
    {
        registrationSuccessfully.toVerifyUserIsRegistrationSuccessfulMessage();
        registrationSuccessfully.toVerifyUserClickOnContinueButton();
    }
}
