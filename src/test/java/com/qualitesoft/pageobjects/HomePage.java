package com.qualitesoft.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class HomePage extends PageObject {

  public static final By CART_FIELD = By.xpath("//a[@href='/cart']");

  public static final By search_field = By.xpath("//input[@placeholder='Find furniture and decor for your business']");

  public static By getMenuField(String menu) {

    return By.linkText(menu);
  }

  public static By getSubMenuField(String subMenu) {

    return By.linkText(subMenu);
  }

}
