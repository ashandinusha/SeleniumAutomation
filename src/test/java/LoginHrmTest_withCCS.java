import Base.Constants;
import ScreenShot.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginHrmTest_withCCS {

        private WebDriver webDriver;
        //final String URL ="http://opensource.demo.orangehrmlive.com";

        @BeforeClass
        public void beforeClass(){
            System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
            webDriver = new FirefoxDriver();
        }

        @AfterClass
        public void afterClass(){
            if(webDriver!=null){
                //webDriver.close();
            }
        }

@Test
    public void testLogin_CCS1() throws Exception {
            webDriver.get(Constants.URL);

            ScreenShot.takeScreenshot(webDriver, "F:\\Dilanka\\OrangeAutomation\\sreens\\screen11.png");
            ScreenShot.takeScreenshot(webDriver,"F:\\Dilanka\\OrangeAutomation\\sreens\\screennew11.png");
            webDriver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");


            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

           // webDriver.findElement(By.id(""))

            webDriver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin");
            webDriver.findElement(By.cssSelector("input[id='btnLogin']")).submit();
    }

}
