package org.example.BrowserConfiguration;

import org.example.Utilities.propertyfilereader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsersetup {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", propertyfilereader.getProperty("browserdriver_path"));
        WebDriver driver = new ChromeDriver();
        return driver;

    }
}
