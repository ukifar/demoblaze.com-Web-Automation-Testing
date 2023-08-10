package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

public class ContactSteps {
    private WebDriver webDriver;
    public ContactSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Test Case 1
    @When("click on contact menu button")
    public void clickOnContactMenuButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnContactButton();
        Thread.sleep(2000);
    }
    @And("new message pop up will appear")
    public void newMessagePopUpWillAppear() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyPopupMessageVerification();
    }
    @And("user input \"(.*)\" as email, \"(.*)\" as name, and \"(.*)\" as message")
    public void userInputAsEmailAsNameAndAsMessage(String email, String name, String message) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setEmailNewMessageBox(email);
        landingPage.setNameNewMessageBox(name);
        landingPage.setMessageNewMessageBox(message);
        Thread.sleep(2000);
    }
    @Then("click on send message button")
    public void clickOnSendMessageButton() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnSendMessageButton();
    }
    @And("thanks for the message pop up will appear")
    public void thanksForTheMessagePopUpWillAppear() {
        webDriver.switchTo().alert().accept();
    }

    //Test Case 2
    @And("please input email and message pop up will appear")
    public void pleaseInputEmailAndMessagePopUpWillAppear() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyFailedSendMessageVerification();
    }
}
