package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

public class AboutUsSteps {
    private WebDriver webDriver;
    public AboutUsSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Test Case 1&2
    @And("click on about us menu button")
    public void clickOnAboutUsMenuButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnAboutUsButton();
        Thread.sleep(2000);
    }
    @Then("user click on the video")
    public void userClickOnTheVideo() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnVideosButton();
    }
    @And("video can be played")
    public void videoCanBePlayed() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyVideosPlayedVerification();
    }
}
