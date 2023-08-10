package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.LandingPage;
import org.example.pageObject.ProductDescriptionPage;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private WebDriver webDriver;
    public CheckoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Test Case 1
    @When("user click on Log in menu button")
    public void userClickOnLogInMenuButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnLoginMenuButton();
        Thread.sleep(2000);
    }
    @And("user inputs \"(.*)\" as Username and inputs \"(.*)\" as Password on login field")
    public void userFillLoginBox(String username, String password) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setUsernameLogin(username);
        landingPage.setPasswordLogin(password);
        Thread.sleep(2000);
    }
    @And("user click Log in button")
    public void userClickLogInButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnLoginButton();
        Thread.sleep(2000);
    }
    @And("click on Sony vaio i5")
    public void clickOnSonyVaioI() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnSonyVaioI5Button();
        Thread.sleep(2000);
    }
    @Then("click add to cart button")
    public void clickAddToCartButton() throws InterruptedException {
        ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(webDriver);
        productDescriptionPage.clickOnSonyVaioI5AddtoCartButton();
        Thread.sleep(2000);
    }
    @When("user click on cart menu button")
    public void userClickOnCartMenuButton() {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnCartMenuButton();
    }
    @And("click on place order button")
    public void clickOnPlaceOrderButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickOnPlaceOrderButton();
        Thread.sleep(2000);
    }
    @And("place order pop up will be showed")
    public void placeOrderPopUpWillBeShowed() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.verifyPlaceOrderPopup();
    }
    @Then("user input \"(.*)\" as Name and \"(.*)\" as credit card on place order field")
    public void userInputAsNameAndAsCreditCardOnPlaceOrderField(String name, String creditCard) throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.setNamePlaceOrderBox(name);
        cartPage.setCreditCardPlaceOrderBox(creditCard);
        Thread.sleep(2000);
    }
    @And("click purchase button")
    public void clickPurchaseButton() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickOnPurchaseButton();
    }
    @And("thank you for your purchase pop up will be showed")
    public void thankYouForYourPurchasePopUpWillBeShowed() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.verifyThankYouPurchasePopup();
    }

    //Test Case 2
    @Then("user input \"(.*)\" as Name on place order field")
    public void userInputAsNameOnPlaceOrderField(String name) throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.setNamePlaceOrderBox(name);
        Thread.sleep(2000);
    }
    @And("please fill out credit card pop up will be showed")
    public void pleaseFillOutCreditCardPopUpWillBeShowed() {
        webDriver.switchTo().alert().accept();
    }

    //Test Case 3
    @And("pop up you have to add at least 1 item will be showed")
    public void popUpYouHaveToAddAtLeastItemWillBeShowed() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickOnPlaceOrderButton();
    }

    //Test Case 4
    @And("click on delete item button")
    public void clickOnDeleteItemButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Thread.sleep(2000);
        cartPage.clickOnDeleteItemButton();
    }

    //Test Case 5
    @And("click on Sony Samsung galaxy s6")
    public void clickOnSonySamsungGalaxyS() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickOnSamsungGalaxyS6Button();
        Thread.sleep(2000);

    }
    @And("product successfully added")
    public void productSuccessfullyAdded() {
        webDriver.switchTo().alert().accept();
    }
}
