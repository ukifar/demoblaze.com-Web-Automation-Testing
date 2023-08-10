package step_definitions;

import cucumber.api.java.en.And;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

public class LogInSteps {
    private WebDriver webDriver;
    public LogInSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Test Case 1
    @And("user login successfully")
    public void userLoginSuccessfully() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.verifyLoginSuccessVerification();
    }

    //Test Case 2
    @And("pop up showed with message wrong password")
    public void popUpShowedWithMessageWrongPassword() {
        webDriver.switchTo().alert().accept();
    }

    //Test Case 3
    @And("pop up showed with message user does not exist")
    public void popUpShowedWithMessageUserDoesNotExist() {
        webDriver.switchTo().alert().accept();
    }

    //Test Case 4 & 5
    @And("pop up showed with message please fill out username and password")
    public void popUpShowedWithMessagePleaseFillOutUsername() {
        webDriver.switchTo().alert().accept();
    }
}
