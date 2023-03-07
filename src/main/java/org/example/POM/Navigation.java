package org.example.POM;

import org.example.Utilities.propertyfilereader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
    WebDriver driver;

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }
    By Location=By.xpath(propertyfilereader.getProperty("locationxpath"));
    By Navigation=By.xpath(propertyfilereader.getProperty("navigationxpath"));


    public WebElement navigation() {
        return driver.findElement(Navigation);
    }
    public WebElement location(){
        return driver.findElement(Location);
    }


}
