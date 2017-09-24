package com.orange.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {

    WebDriver webDriver;
    public static final String Base_URL = "http://opensource.demo.orangehrmlive.com/";

    @BeforeClass
    public void beforeClass(){
        webDriver = new HtmlUnitDriver();

    }

    @Test
    public void verifyPageTitle(){
        webDriver.get(Base_URL);
        Assert.assertEquals(webDriver.getTitle(),"OrangeHRM");
    }
    @Test
    public void verifyCurrentURL(){
        webDriver.get(Base_URL);
        Assert.assertEquals(webDriver.getCurrentUrl(), Base_URL);
    }
}
