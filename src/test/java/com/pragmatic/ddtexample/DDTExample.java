package com.pragmatic.ddtexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExample {

    private final String  BaseURL = "http://opensource.demo.orangehrmlive.com";
    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass(){
        webDriver = new HtmlUnitDriver(true);
    }

    //DataSource
    @DataProvider(name = "userCredentials")
    private Object[][] userCredentials(){
        return new Object[][]{
                {"Admin","","Password cannot be empty"},
                {"","","Username cannot be empty"},
                {"","admin","Username cannot be empty"},
                {"asdf","asdf","Invalid credentials"}


        };
    }

    @BeforeMethod
    public void beforeMethod(){
        webDriver.get(BaseURL);
    }


    @Test(dataProvider = "userCredentials")
    public void testInvalidUserCredentials(CharSequence username, CharSequence password, String expectedMessage){
        webDriver.findElement(By.id("txtUsername")).sendKeys(username);
        webDriver.findElement(By.id("txtPassword")).sendKeys(password);
        webDriver.findElement(By.id("txtPassword")).submit();
        Assert.assertEquals(getErrorMessage(),expectedMessage);
    }

    @Test(dataProvider = "userCredentials2", dataProviderClass = DataSource.class)
    public void testInvalidUserCredentials2(CharSequence username, CharSequence password, String expectedMessage){
        webDriver.findElement(By.id("txtUsername")).sendKeys(username);
        webDriver.findElement(By.id("txtPassword")).sendKeys(password);
        webDriver.findElement(By.id("txtPassword")).submit();
        Assert.assertEquals(getErrorMessage(),expectedMessage);
    }




    private String getErrorMessage(){
        return webDriver.findElement(By.id("spanMessage")).getText();
    }

}
