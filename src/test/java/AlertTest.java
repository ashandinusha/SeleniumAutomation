import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertTest {
    private WebDriver webDriver;
    final String URL ="http://output.jsbin.com/texane";

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }


    @Test
    public void testAlerts(){
        //go the site
        webDriver.navigate().to(URL);

        //click on the button
        webDriver.findElement(By.id("btnAlert")).click();

        //Get the msg verified
       // webDriver.switchTo().alert().getText();
        Assert.assertEquals(webDriver.switchTo().alert().getText(),"I'm blocking!");

        webDriver.switchTo().alert().accept();

        //check message
        Assert.assertEquals(webDriver.findElement(By.id("output")).getText(),"Alert is gone.");
    }

    @Test
    public void testConfirmationCancel(){
        //go the site
        webDriver.navigate().to(URL);

        //click on the button
        webDriver.findElement(By.id("btnConfirm")).click();

        //Get the msg verified
        // webDriver.switchTo().alert().getText();
        Assert.assertEquals(webDriver.switchTo().alert().getText(),"Chose an option.");

        webDriver.switchTo().alert().accept();

        //check message
       Assert.assertEquals(webDriver.findElement(By.id("output")).getText(),"Confirmed.");
    }



    @Test
    public void testPromptCancel(){
        //go the site
        webDriver.navigate().to(URL);

        //click on the button
        webDriver.findElement(By.id("btnPrompt")).click();

        //Get the msg verified
        // webDriver.switchTo().alert().getText();
        Assert.assertEquals(webDriver.switchTo().alert().getText(),"What's the best web QA tool?");

        webDriver.switchTo().alert().accept();

        //check message
        Assert.assertEquals(webDriver.findElement(By.id("output")).getText(),"Selenium");
    }



    @Test
    public void testPromptOK(){

    }

}
