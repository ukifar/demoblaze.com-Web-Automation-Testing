package step_definitions;

import cucumber.api.java.en.And;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps {
    private WebDriver webDriver;
    public AddToCartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Test Case 1
    @And("user click on Samsung Galaxy s6")
    public void userClickOnSamsungGalaxyS() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnSamsungGalaxyS6Button();
    }
    @And("produck successfully added")
    public void produckSuccessfullyAdded() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyDemoblazePageVerification();
    }

    //Test Case 2
    @And("user redirected to login pop up")
    public void userRedirectedToLoginPopUp() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyLoginPopupVerificationss();
    }
}
