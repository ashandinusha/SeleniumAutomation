package com.orange.tests;

import ScreenShot.ScreenShot;
import com.orange.pages.LandingPage;
import com.orange.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest {

    public static final String Base_URL = "http://opensource.demo.orangehrmlive.com";
    WebDriver webDriver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://opensource.demo.orangehrmlive.com");
        webDriver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod(){
        webDriver.get(Base_URL);
    }

    @Test
    public void loginWithBlankUsername() throws Exception {
        //Create a browser instance

        //Access the Login Page
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);

        //Login with Blank Username
        loginPage.login("","admin");

        //Verify Error Message
        Assert.assertEquals(loginPage.getMessage(),"Username cannot be empty");

        ScreenShot.takeScreenshot(webDriver,"F:\\Dilanka\\OrangeAutomation\\screenshots\\BlankUsername.png");

    }
    @Test
    public void loginWithBlankPassword() throws Exception {

        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.login("Admin", "");
        Assert.assertEquals(loginPage.getMessage1(),"Password cannot be empty");

        ScreenShot.takeScreenshot(webDriver,"F:\\Dilanka\\OrangeAutomation\\screenshots\\BlankPassword.png");
    }

    @Test
    public void loginWithBlankUNPW() throws Exception {

        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.login("","");
        Assert.assertEquals(loginPage.getMessage2(),"Username cannot be empty");

        ScreenShot.takeScreenshot(webDriver,"F:\\Dilanka\\OrangeAutomation\\screenshots\\BlankUNPW.png");
    }

    @Test
    public void loginWithInvalidPassword() throws Exception {

        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.login("Admin", "test");
        Assert.assertEquals(loginPage.getMessage3(),"Invalid credentials");

        ScreenShot.takeScreenshot(webDriver,"F:\\Dilanka\\OrangeAutomation\\screenshots\\InvalidPassword.png");
    }

    @Test
    public void successfullyLogin() throws Exception {

        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.login("Admin","admin");

        LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);
        Assert.assertEquals(landingPage.getMessage(), "Welcome Admin");

        ScreenShot.takeScreenshot(webDriver,"F:\\Dilanka\\OrangeAutomation\\screenshots\\Login.png");
    }

}
