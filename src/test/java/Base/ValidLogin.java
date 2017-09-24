package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ValidLogin extends Constants{

    public WebDriver webDriver;

    @Test
    public void loginToPage() throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get(Constants.URL);

        webDriver.findElement(By.id("txtUsername")).sendKeys(Constants.USERNAME);
        webDriver.findElement(By.id("txtPassword")).sendKeys(Constants.PASSWORD);
        webDriver.findElement(By.id("btnLogin")).click();

        webDriver.get(Constants.URL_ADD_EMPLOYEE);

        //Uploading image
        webDriver.findElement(By.id("photofile")).click();
        //webDriver.findElement(By.id("photofile")).sendKeys("F:\\Dilanka\\OrangeAutomation\\testData\\images (50).jpg");
        Runtime.getRuntime().exec("F:\\Dilanka\\OrangeAutomation\\testData\\AutoIT.exe");

        //webDriver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

        //logout
        //webDriver.findElement(By.id("welcome")).click();
        //webDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        //webDriver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();


    }
}

