package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on the HomePage$")
    public void iAmOnTheHomePage() {

    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() {

    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new LoginPage().enterUserName(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @Then("^I should Login successfully$")
    public void iShouldLoginSuccessfully() {

    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }
}
