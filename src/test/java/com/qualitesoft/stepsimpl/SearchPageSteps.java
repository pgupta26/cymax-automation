package com.qualitesoft.stepsimpl;

import com.qualitesoft.pageobjects.SearchPage;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class SearchPageSteps extends UIInteractionSteps {

    public int getArticlesFieldCount() {

       return $$(SearchPage.articles_field).size();
    }
}
