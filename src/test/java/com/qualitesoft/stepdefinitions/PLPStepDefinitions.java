package com.qualitesoft.stepdefinitions;

import com.qualitesoft.stepsimpl.PLPPageSteps;
import com.qualitesoft.utils.ErrorMessage;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class PLPStepDefinitions {

    @Steps
    PLPPageSteps plpPageSteps;

    @Then("user will be redirected to PLP url contains {string}")
    public void verifyPageUrlContains(String expectedUrl) {

        Assert.assertTrue(String.format(ErrorMessage.PLP_URL_DOES_NOT_CONTAINS_EXPECTED_URL, expectedUrl), plpPageSteps.getCurrentUrl().contains(expectedUrl));
    }

}
