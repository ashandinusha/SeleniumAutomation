import ScreenShot.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginHRMTest_withXPath{
    private WebDriver webDriver;
    final String URL ="http://opensource.demo.orangehrmlive.com";

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    @AfterClass
    public void afterClass(){
        if(webDriver!=null){
           // webDriver.close();
        }
    }

    //BC M1 M2 M3

    @Test
    public void testLogin_XPath1() throws Exception {
        String errMessage;

        webDriver.get(URL);

        ScreenShot.takeScreenshot(webDriver, "F:\\Dilanka\\OrangeAutomation\\sreens\\error2.png");

        webDriver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        webDriver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
        webDriver.findElement(By.xpath("//input[@name='txtUsername']")).submit();

        errMessage = webDriver.findElement(By.id("spanMessage")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(errMessage, "Password cannot be empty");

        ScreenShot.takeScreenshot(webDriver, "F:\\Dilanka\\OrangeAutomation\\sreens\\error11.png");
    }

    @Test
    public void testLogin_XPath2() throws Exception {
        String errMessage2;

        webDriver.get(URL);
        webDriver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("");
        webDriver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
        webDriver.findElement(By.xpath("//input[@name='txtUsername']")).submit();

        errMessage2 = webDriver.findElement(By.id("spanMessage")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(errMessage2, "Username cannot be empty");

        ScreenShot.takeScreenshot(webDriver, "F:\\Dilanka\\OrangeAutomation\\sreens\\errorwithoutUsername1.png");


    }

    @Test
    public void testLogin_XPath3() throws Exception {

        String dashBoard;

        webDriver.get(URL);
        webDriver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        webDriver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
        webDriver.findElement(By.xpath("//input[@name='txtUsername']")).submit();

        dashBoard = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
        Assert.assertEquals(dashBoard, "Dashboard");

        ScreenShot.takeScreenshot(webDriver, "F:\\Dilanka\\OrangeAutomation\\sreens\\Dashboard1.png");


    }

}
