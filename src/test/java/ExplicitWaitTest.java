import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {

    private WebDriver webDriver;
    final String URL ="http://the-internet.herokuapp.com/dynamic_loading/2";

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testExplicitWait(){
        webDriver.get(URL);
       // webDriver.manage().window().maximize();
       // webDriver.findElement(By.tagName("button")).click();
        webDriver.findElement(By.xpath("//button[text()='Start']")).click();

        WebDriverWait wait = new WebDriverWait(webDriver,30);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
        element.getText();
        Assert.assertEquals(element.getText(),"Hello World!");
    }

}
