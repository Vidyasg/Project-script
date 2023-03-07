package org.example.Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Takescreenshot {
    public static void takeScreenshot(WebDriver driver, String filepath){
        //takeScreenshot(driver,filepath)
        TakesScreenshot scrshot= (TakesScreenshot) driver;
        File src=scrshot.getScreenshotAs(OutputType.FILE);
        File dest=new File(filepath);
        try {
            FileUtils.copyFile(src,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
