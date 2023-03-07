package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BrowserConfiguration.Browsersetup;
import org.example.POM.Navigation;
import org.example.Utilities.Takescreenshot;
import org.example.Utilities.propertyfilereader;
import org.openqa.selenium.WebDriver;

public class stepdef {
    WebDriver driver;
    @Given("OpenBrowser")
    public void openbrowser() {
        driver= Browsersetup.getDriver();
    }
    @When("Redirect to bookmyshowpage")
    public void Redirect_to_bookmyshowpage() {
        driver.get(propertyfilereader.getProperty("Appurl"));

    }
    @Then("bookmyshowpage opened")
    public void bookmyshowpage_opened(){
    }
    @When("Redirect to LocationPage")
    public void Redirect_to_LocationPage(){
        Navigation navigation = new Navigation(driver);
        navigation.location().click();

    }
    @Then("Redirect to navigationbar")
    public void Redirect_to_navigationbar() throws InterruptedException {
        Navigation navigation = new Navigation(driver);
        navigation.navigation().click();
        Thread.sleep(2000);
        Takescreenshot.takeScreenshot(driver,
                System.getProperty("user.dir")+
                        "//screenshots//"+
                        System.currentTimeMillis()+".jpg");
    }
}
