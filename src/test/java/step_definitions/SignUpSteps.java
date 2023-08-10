package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class SignUpSteps {
    private WebDriver webDriver;
    public SignUpSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Test Case 1
    @And("verification pop-up appears indicating successful registration")
    public void verificationPopUpAppearsIndicatingSuccessfulRegistration() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyPopupSuccessfullRegistrationVerification();
    }

    //Test Case 2
    @And("verification pop-up appears indicating failed registration")
    public void verificationPopUpAppearsIndicatingFailedRegistration() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyPopupFailedRegistrationVerification();
    }

    //Test Case 3
    @Given("user already on landing page")
    public void userAlreadyOnLandingPage() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyDemoblazePageVerification();
    }
    @When("user click on Sign up menu button")
    public void userClickOnSignUpButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnSignUpMenuButton();
        Thread.sleep(2000);
    }
    @And("input \"(.*)\" as Username and input \"(.*)\" as Password")
    public void inputAsUsernameAndInputAsPassword(String username, String password) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setUsername(username);
        landingPage.setPassword(password);
        Thread.sleep(2000);
    }
    @Then("user click Sign up button")
    public void userClickSignUpButton() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnSignUpButton();
    }
    @And("verification pop-up appears indicating that the username field must be filled")
    public void verificationPopUpAppearsIndicatingThatTheUsernameFieldMustBeFilled() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyPopupUsernameMustBeFilled();
    }

    //Test Case 4
    @And("verification pop-up appears indicating that the password field must be filled")
    public void verificationPopUpAppearsIndicatingThatThePasswordFieldMustBeFilled() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyPopupPasswordMustBeFilled();
    }

    //Test Case 7
    @And("pop-up indicating invalid username will be showed")
    public void popUpIndicatingInvalidUsernameWillBeShowed() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyPopupInvalidUsernameVerification();
    }

}
