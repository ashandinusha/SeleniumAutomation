import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BlankUserName {

    @Test

    public void testBlankUsernameLoginCredentials(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://opensource.demo.orangehrmlive.com/");

        webDriver.findElement(By.id("txtUsername")).sendKeys("");

        webDriver.findElement(By.id("txtPassword")).sendKeys("admin");

        webDriver.findElement(By.id("btnLogin")).click();

        webDriver.close();
    }
}
