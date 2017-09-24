package com.orange.keyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyBoardEventExample {

        public static final String Base_URL = "http://opensource.demo.orangehrmlive.com";
        WebDriver webDriver;

        @BeforeClass
        public void beforeClass(){
            //Create a browser instance
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
                public void keyBordEventsExample1(){

            WebElement txtUsername = webDriver.findElement(By.id("txtUsername"));

            //Create an instance of Action Object
            Actions builder = new Actions(webDriver);

            //Build the Action
            Action seriesOfActions = builder
                    .moveToElement(txtUsername)
                    .click()
                    .keyDown(txtUsername, Keys.SHIFT)
                    .sendKeys("Admin")
                    .keyUp(txtUsername, Keys.SHIFT)
                    .build();

            //Perform
            seriesOfActions.perform();



    }
}
