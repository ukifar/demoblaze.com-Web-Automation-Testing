package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

public class LogOutSteps {
    private WebDriver webDriver;
    public LogOutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("click on Log out menu button")
    public void clickOnLogOutMenuButton() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnLogOutButton();
    }
    @And("user logout successfully")
    public void userLogoutSuccessfully() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyLogOutSuccessVerification();
    }
}
