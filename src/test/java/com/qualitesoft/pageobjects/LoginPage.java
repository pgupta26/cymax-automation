package com.qualitesoft.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://qamp.cymax.com/")
public class LoginPage extends PageObject {

    public static final By PASSWORD_FIELD = By.name("_vercel_password");

    public static final By LOGIN_IN_FIELD = By.xpath("//button[@class= 'submit']");

    public static final By FORGOT_PASSWORD_FIELD = By.linkText("Forgot password?");

}
