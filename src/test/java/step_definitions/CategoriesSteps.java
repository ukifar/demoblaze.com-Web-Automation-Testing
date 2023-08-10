package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

public class CategoriesSteps {
    private WebDriver webDriver;
    public CategoriesSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Test Case 1
    @When("click on phones button on the category field")
    public void clickOnPhonesButtonOnTheCategoryField() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnPhonesButton();
    }
    @And("phones products will showed up")
    public void phonesProductsWillShowedUp() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyPhonesVerification();
    }

    //Test Case 2
    @When("click on laptops button on the category field")
    public void clickOnLaptopsButtonOnTheCategoryField() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnLaptopsButton();
    }
    @And("laptops products will showed up")
    public void laptopsProductsWillShowedUp() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyLaptopsVerification();
    }

    //Test Case 3
    @When("click on monitors button on the category field")
    public void clickOnMonitorsButtonOnTheCategoryField() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnMonitorsButton();
    }
    @And("monitors products will showed up")
    public void monitorsProductsWillShowedUp() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyMonitorsVerification();
    }

}
