package org.example.POM;

import org.example.Utilities.propertyfilereader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Plays {
    WebDriver driver;

    public Plays(WebDriver driver) {
        this.driver = driver;
    }
    By Location=By.xpath(propertyfilereader.getProperty("locationxpath"));
    By Navigation=By.xpath(propertyfilereader.getProperty("navigationxpath"));
By Plays = By.xpath(propertyfilereader.getProperty("playsxpath"));


    public WebElement location(){
        return driver.findElement(Location);
    }
    public WebElement plays(){
        return driver.findElement(Plays);
    }


}
