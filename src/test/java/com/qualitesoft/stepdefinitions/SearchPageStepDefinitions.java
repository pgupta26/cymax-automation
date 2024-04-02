package com.qualitesoft.stepdefinitions;

import com.qualitesoft.stepsimpl.SearchPageSteps;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class SearchPageStepDefinitions {

    @Steps
    SearchPageSteps searchPageSteps;

    @Then("Search results will be shown on Product List Page")
    public void verifySearchResultsOnPLP() {

        searchPageSteps.getArticlesFieldCount();
        Assert.assertTrue(searchPageSteps.getArticlesFieldCount() >= 1);
    }

}
