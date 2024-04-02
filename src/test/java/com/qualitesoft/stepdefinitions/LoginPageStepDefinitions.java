package com.qualitesoft.stepdefinitions;

import com.qualitesoft.stepsimpl.LoginPageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginPageStepDefinitions {

    @Steps
    LoginPageSteps loginPageSteps;

    @Given("Go to navigate to cymax login page")
    public void navigateToCymaxLoginPage() {

        loginPageSteps.navigateToLoginPage();
    }

    @When("enter visitor password {string}")
    public void login(String password) {

        loginPageSteps.typePasswordField(password);
        loginPageSteps.clickLogInField();
    }
}
