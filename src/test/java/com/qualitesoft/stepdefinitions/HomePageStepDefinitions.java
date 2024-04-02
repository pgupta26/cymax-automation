package com.qualitesoft.stepdefinitions;


import com.qualitesoft.stepsimpl.HomePageSteps;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;


public class HomePageStepDefinitions {

  @Steps
  HomePageSteps homePageSteps;


  @Then("cymax home page should load without crashes")
  public void navigateToFreightClubPage () {

    homePageSteps.verifyHomePage();
  }

  @When("click on 'cart logo' at top right corner")
  public void clickOnCartField () {

    homePageSteps.clickCartField();
  }

  @When("click on search box and Enter PID {string} then press enter")
  public void clickOnSearchFieldAndEnterPID (String pid) {

    homePageSteps.typeSearchField(pid);
  }


  @When("user click on {string} category under {string} top menu bar")
  public void clickOnSubMenu (String subMenu, String menu) {

    homePageSteps.hoverOverMenuField(menu);
    homePageSteps.clickSubMenuField(subMenu);
  }


}
