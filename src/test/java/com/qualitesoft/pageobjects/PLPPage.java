package com.qualitesoft.pageobjects;


import com.qualitesoft.utils.Constants;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class PLPPage extends PageObject {

  public static final By CATALOG_PRODUCT_TOTAL_COUNT_FIELD = By.xpath("//p[text()='Displaying']/following-sibling::p");

  public static final By PRODUCT_FIELD = By.tagName("article");

  public static final By SORT_BY_FIELD = By.id("indexSortSelect");

  public static final By SALE_FIELD = By.className("chakra-switch__input");

  public static String EXPAND_COLLAPSE_FILTER_FIELD = "//div[text()='" + Constants.DYNAMIC_VALUE + "']/parent::button";

  public static String FILTER_TEXT_FIELD = "//p[text()='"+ Constants.DYNAMIC_VALUE +"']";


  public static By getExpandCollapseFilterField (String filterName) {

    return By.xpath(String.format(EXPAND_COLLAPSE_FILTER_FIELD, filterName));
  }

  public static By getFilterTextField(String filterText) {

    return By.xpath(String.format(FILTER_TEXT_FIELD, filterText));
  }
}