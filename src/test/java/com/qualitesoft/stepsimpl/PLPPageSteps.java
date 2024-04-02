package com.qualitesoft.stepsimpl;


import com.qualitesoft.pageobjects.PLPPage;
import net.serenitybdd.core.steps.UIInteractionSteps;


public class PLPPageSteps extends UIInteractionSteps {

  public int getCatalogProductTotalCount() {

    return Integer.parseInt(textOf(PLPPage.CATALOG_PRODUCT_TOTAL_COUNT_FIELD).split(" ")[0].replace(",", ""));
  }

  public int getTotalArticles() {

    return $$(PLPPage.PRODUCT_FIELD).size();
  }

  public void selectSortBy(String name) {

    selectFromDropdown($(PLPPage.SORT_BY_FIELD), name);
  }

  public String getCurrentUrl() {

    return getDriver().getCurrentUrl();
  }
}
