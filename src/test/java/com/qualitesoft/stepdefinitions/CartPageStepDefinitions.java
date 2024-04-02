package com.qualitesoft.stepdefinitions;


import com.qualitesoft.stepsimpl.CartPageSteps;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;


public class CartPageStepDefinitions {


  @Steps
  CartPageSteps cartPageSteps;


  @Then("cart page should load without crashes")
  public void verifyCartPageTitle () {

    cartPageSteps.verifyCartPage();

  }
}
