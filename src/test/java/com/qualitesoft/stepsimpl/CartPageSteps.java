package com.qualitesoft.stepsimpl;


import com.qualitesoft.utils.PageTitles;
import net.serenitybdd.core.steps.UIInteractionSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CartPageSteps extends UIInteractionSteps {

  public void verifyCartPage () {

    assertEquals(PageTitles.CART_PAGE_TITLE, getTitle());
  }

}
