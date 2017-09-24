import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static sun.plugin.javascript.navig.JSType.URL;

public class Login {

    @BeforeClass
    public void beforeClass(){

    }

    @AfterClass
    public void afterClass(){

    }

    @Test

    public void testValidUserLogin(){
        //Set system property for the browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");


        //open browser instance
        WebDriver webDriver = new ChromeDriver();
        //Implicit Wait
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //navigate to the login page
        webDriver.get("http://opensource.demo.orangehrmlive.com/");

        //Maximize Page
        webDriver.manage().window().maximize();

        //type user name
        //WebElement txtUsername = webDriver.findElement(By.id("txtUserName"));
        //txtUsername.sendKeys("Admin");
        webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //type password
        webDriver.findElement(By.id("txtPassword")).sendKeys("admin");

        //submit login form
        webDriver.findElement(By.id("btnLogin")).click();

        //verify the login page



        //Logout
        webDriver.findElement(By.id("welcome")).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 2);
        webDriver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();




        //close browser



       // webDriver.close();


    }
}
