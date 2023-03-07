package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BrowserConfiguration.Browsersetup;
import org.example.POM.Plays;
import org.example.Utilities.Takescreenshot;
import org.example.Utilities.propertyfilereader;
import org.openqa.selenium.WebDriver;

public class StepdefB {
    WebDriver driver;
    @Given("open browser")
    public void open_browser() {
        driver= Browsersetup.getDriver();
    }
    @When("Redirect to Bookmyshow page")
    public void redirect_to_bookmyshow_page() {
        driver.get(propertyfilereader.getProperty("Appurl"));
    }
    @Then("click on Selected location")
    public void click_on_selected_location(){
        Plays plays = new Plays(driver);
        plays.location().click();
    }
    @When("Redirect to plays page")
    public void Redirect_to_plays_page(){
        Plays plays = new Plays(driver);
        plays.plays().click();
        Takescreenshot.takeScreenshot(driver,
                System.getProperty("user.dir")+
                        "//screenshots//"+
                        System.currentTimeMillis()+".jpg");
    }
}
