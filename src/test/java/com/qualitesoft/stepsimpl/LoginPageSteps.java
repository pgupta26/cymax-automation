package com.qualitesoft.stepsimpl;

import net.serenitybdd.core.steps.UIInteractionSteps;
import com.qualitesoft.pageobjects.LoginPage;

public class LoginPageSteps extends UIInteractionSteps {

    LoginPage loginPage;

    public void navigateToLoginPage() {

        loginPage.open();
    }


    public void typePasswordField(String password) {

        typeInto($(LoginPage.PASSWORD_FIELD), password);
    }

    public void clickLogInField() {

        clickOn($(LoginPage.LOGIN_IN_FIELD));
    }

    public void clickForgotPasswordField() {

        clickOn($(LoginPage.FORGOT_PASSWORD_FIELD));
    }

}
