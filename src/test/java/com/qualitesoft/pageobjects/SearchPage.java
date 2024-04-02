package com.qualitesoft.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchPage extends PageObject {

  public static final By search_count_field = By.xpath("//p[text()='Displaying']/following-sibling::p");

  public static final By articles_field = By.xpath("//article");

}
