package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage{

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement lnkLogout;

    @FindBy(id = "welcome")
    WebElement lnkWelcome;

    public String getMessage(){
        return lnkWelcome.getText();
    }
    public void logout(){
        lnkWelcome.click();
        lnkLogout.click();
    }
}
