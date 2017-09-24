package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver webDriver;

    @BeforeSuite
            public void beforeSuite() {

    }


    private TestBase(){
         String browserType = Constants.BROWSER_TYPE;
        if (browserType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver,gecko,driver","Drivers/geckodriver.exe");
            webDriver = new FirefoxDriver();


        }else if (browserType.equalsIgnoreCase("chrome")){
            System.setProperty("","");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("","");
            webDriver = new OperaDriver(capabilities);

        }else if (browserType.equalsIgnoreCase("opera")){

        }else if (browserType.equalsIgnoreCase("safari")){

        }else if (browserType.equalsIgnoreCase("htmlunit")){

        }
        }




    private void initBrowser(){

    }

    private void AfterSuite(){

    }
}
