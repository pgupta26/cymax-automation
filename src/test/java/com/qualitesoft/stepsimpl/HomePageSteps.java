package com.qualitesoft.stepsimpl;


import com.qualitesoft.pageobjects.HomePage;
import com.qualitesoft.utils.PageTitles;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HomePageSteps extends UIInteractionSteps {

  public void verifyHomePage () {

    assertEquals(PageTitles.CYMAX_HOME_PAGE_TITLE, getTitle());
  }


  public void clickCartField () {

    clickOn($(HomePage.CART_FIELD));
  }


  public void typeSearchField(String pid) {

    typeInto($(HomePage.search_field), pid);
    enter(Keys.ENTER);
  }


  public void hoverOverMenuField (String menuName) {

    moveTo(HomePage.getMenuField(menuName));
  }


  public void clickSubMenuField (String subMenuName) {

    moveTo(HomePage.getSubMenuField(subMenuName)).click();
  }



}
