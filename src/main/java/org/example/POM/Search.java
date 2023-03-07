package org.example.POM;

import org.example.Utilities.propertyfilereader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
    WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }
    By Location=By.xpath(propertyfilereader.getProperty("locationxpath"));
    By Movie=By.xpath(propertyfilereader.getProperty("moviexpath"));

    By Search=By.xpath(propertyfilereader.getProperty("searchxpath"));
    By Searchbar=By.xpath(propertyfilereader.getProperty("searchbarpath"));
    public WebElement location() {
        return driver.findElement(Location);
    }
    public WebElement movie(){
        return driver.findElement(Movie);
    }
    public WebElement search(){
        return driver.findElement(Search);
    }
    public WebElement searchbar(){
        return driver.findElement(Searchbar);
    }

}
