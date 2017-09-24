package com.pragmatic.ddtexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSource {

    private final String  BaseURL = "http://opensource.demo.orangehrmlive.com";
    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass(){
        webDriver = new HtmlUnitDriver(true);
    }

    //DataSource
    @DataProvider(name = "userCredentials2")
    private static Object[][] userCredentials() {
        return new Object[][]{
                {"Admin", "", "Password cannot be empty"},
                {"", "", "Username cannot be empty"},
                {"", "admin", "Username cannot be empty"},
                {"asdf", "asdf", "Invalid credentials"}


        };

    }

}
