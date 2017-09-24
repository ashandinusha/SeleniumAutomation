package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShot {

    public static void takeScreenshot(WebDriver webdriver, String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshots
        TakesScreenshot scrShot = ((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file
        File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile = new File(fileWithPath);

        //Copy file at destination
       // org.apache.commons.io.FileUtils.copyFile(ScrFile, DestFile);
        FileUtils.copyFile(ScrFile, DestFile);
    }
}
