package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BrowserConfiguration.Browsersetup;
import org.example.POM.Search;
import org.example.Utilities.Takescreenshot;
import org.example.Utilities.propertyfilereader;
import org.openqa.selenium.WebDriver;

public class stepdefinations {
    WebDriver driver;
    @Given("Open Browser")
    public void open_browser() {
        driver= Browsersetup.getDriver();
    }
    @When("Redirect to bookmyshow page")
    public void redirect_to_bookmyshow_page() {
        driver.get(propertyfilereader.getProperty("Appurl"));
    }
        @Then("click on selected location")
    public void click_on_selected_location(){
        Search movies = new Search(driver);
            movies.location().click();
        }
        @When("Redirect to movie page")
    public void Redirect_to_movie_page(){
        Search movies = new Search(driver);
            movies.movie().click();
        }
    @Then("Redirect to search")
    public void Redirect_to_search(){
        Search movies = new Search(driver);
        movies.search().click();
    }
    @When("click on search bar")
    public void click_on_search_bar(){
        Search movies =new Search(driver);
        movies.searchbar().click();
    }
    @Then("Enter the movie name")
    public void Enter_the_movie_name() throws InterruptedException {
        Search movies = new Search(driver);
        movies.searchbar().sendKeys("Love today");
        Thread.sleep(2000);
        Takescreenshot.takeScreenshot(driver,
                System.getProperty("user.dir")+
                        "//screenshots//"+
                       System.currentTimeMillis()+".jpg");
    }
}