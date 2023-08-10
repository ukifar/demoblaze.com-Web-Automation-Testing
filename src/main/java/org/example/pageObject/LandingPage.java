package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public static WebDriver driver;
    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@id='nava']")
    private WebElement demoblazePageVerification;
    public void verifyDemoblazePageVerification() {
        demoblazePageVerification.isDisplayed();
    }

    //Sign up
    @FindBy(xpath = "//a[.='Sign up']")
    private WebElement signUpMenuButton;
    @FindBy(xpath = "//input[@id='sign-username']")
    private WebElement usernameBox;
    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElement passwordBox;
    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElement signUpButton;
    @FindBy(xpath = "//a[@id='nava']")
    private WebElement popupUsernameMustBeFilled;
    @FindBy(xpath = "//a[.='Home (current)']")
    private WebElement popupPasswordMustBeFilled;
    @FindBy(xpath = "//a[@id='nava']")
    private WebElement popupSuccessfullRegistrationVerification;
    @FindBy(xpath = "//a[.='About us']")
    private WebElement popupFailedRegistrationVerification;
    @FindBy(xpath = "")
    private WebElement popupInvalidUsernameVerification;
    public void clickOnSignUpMenuButton() {
        signUpMenuButton.click();
    }
    public void setUsername(String username) {
        usernameBox.sendKeys(username);
    }
    public void setPassword(String password) {
        passwordBox.sendKeys(password);
    }
    public void clickOnSignUpButton() {
        signUpButton.click();
    }
    public void verifyPopupUsernameMustBeFilled() {
        popupUsernameMustBeFilled.isDisplayed();
    }
    public void verifyPopupPasswordMustBeFilled() {
        popupPasswordMustBeFilled.isDisplayed();
    }
    public void verifyPopupSuccessfullRegistrationVerification() {
        popupSuccessfullRegistrationVerification.isDisplayed();
    }
    public void verifyPopupFailedRegistrationVerification() {
        popupFailedRegistrationVerification.isDisplayed();
    }
    public void verifyPopupInvalidUsernameVerification() {
        popupInvalidUsernameVerification.isDisplayed();
    }

    //Login
    @FindBy(xpath = "//a[.='Log in']")
    private WebElement loginMenuButton;
    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElement usernameLoginBox;
    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement passwordLoginBox;
    @FindBy(xpath = "//button[.='Log in']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[@id='cat']")
    private WebElement loginSuccessVerification;
    public void clickOnLoginMenuButton() {
        loginMenuButton.click();
    }
    public void setUsernameLogin(String username) {
        usernameLoginBox.sendKeys(username);
    }
    public void setPasswordLogin(String username) {
        passwordLoginBox.sendKeys(username);
    }
    public void clickOnLoginButton() {
        loginButton.click();
    }
    public void verifyLoginSuccessVerification() {
        loginSuccessVerification.isDisplayed();
    }

    //Categories
    @FindBy(xpath = "//a[.='Phones']")
    private WebElement phonesButton;
    @FindBy(xpath = "//a[.='Laptops']")
    private WebElement laptopsButton;
    @FindBy(xpath = "//a[.='Monitors']")
    private WebElement monitorsButton;
    @FindBy(xpath = "//a[.='Phones']")
    private WebElement phonesVerification;
    @FindBy(xpath = "//a[.='Laptops']")
    private WebElement laptopsVerification;
    @FindBy(xpath = "//a[.='Monitors']")
    private WebElement monitorsVerification;
    public void clickOnPhonesButton() {
        phonesButton.click();
    }
    public void clickOnLaptopsButton() {
        laptopsButton.click();
    }
    public void clickOnMonitorsButton() {
        monitorsButton.click();
    }
    public void verifyPhonesVerification() {
        phonesVerification.isDisplayed();
    }
    public void verifyLaptopsVerification() {
        laptopsVerification.isDisplayed();
    }
    public void verifyMonitorsVerification() {
        monitorsVerification.isDisplayed();
    }

    //Add to Cart
    @FindBy(xpath = "//div[@id='logInModal']//label[.='Username:']")
    private WebElement loginPopupVerificationss;
    public void verifyLoginPopupVerificationss() {
        loginPopupVerificationss.isDisplayed();
    }

    //Checkout
    @FindBy(xpath = "//a[.='Sony vaio i5']")
    private WebElement sonyVaioI5Button;
    @FindBy(xpath = "//a[@id='cartur']")
    private WebElement cartMenuButton;
    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
    private WebElement samsungGalaxyS6Button;
    public void clickOnSonyVaioI5Button() {
        sonyVaioI5Button.click();
    }
    public void clickOnCartMenuButton() {
        cartMenuButton.click();
    }
    public void clickOnSamsungGalaxyS6Button() {
        samsungGalaxyS6Button.click();
    }

    //Log Out
    @FindBy(xpath = "//a[.='Log out']")
    private WebElement logOutButton;
    @FindBy(xpath = "//a[@id='cat']")
    private WebElement logOutSuccessVerification;
    public void clickOnLogOutButton() {
        logOutButton.click();
    }
    public void verifyLogOutSuccessVerification() {
        logOutSuccessVerification.isDisplayed();
    }

    //About Us
    @FindBy(xpath = "//a[.='About us']")
    private WebElement aboutUsButton;
    @FindBy(xpath = "//div[@class='vjs-poster']")
    private WebElement videosButton;
    @FindBy(xpath = "//video[@class='vjs-tech']")
    private WebElement videosPlayedVerification;
    public void clickOnAboutUsButton() {
        aboutUsButton.click();
    }
    public void clickOnVideosButton() {
        videosButton.click();
    }
    public void verifyVideosPlayedVerification() {
        videosPlayedVerification.isDisplayed();
    }

    //Contact
    @FindBy(xpath = "//a[.='Contact']")
    private WebElement contactButton;
    @FindBy(xpath = "//h5[@id='exampleModalLabel']")
    private WebElement popupMessageVerification;
    @FindBy(xpath = "//input[@id='recipient-email']")
    private WebElement emailNewMessageBox;
    @FindBy(xpath = "//input[@id='recipient-name']")
    private WebElement nameNewMessageBox;
    @FindBy(xpath = "//textarea[@id='message-text']")
    private WebElement messageNewMessageBox;
    @FindBy(xpath = "//button[.='Send message']")
    private WebElement sendMessageButton;
    @FindBy(xpath = "//div[@id='logInModal']//button[@class='btn btn-secondary']")
    private WebElement failedSendMessageVerification;
    public void clickOnContactButton() {
        contactButton.click();
    }
    public void verifyPopupMessageVerification() {
        popupMessageVerification.isDisplayed();
    }
    public void setEmailNewMessageBox(String email) {
        emailNewMessageBox.sendKeys(email);
    }
    public void setNameNewMessageBox(String name) {
        nameNewMessageBox.sendKeys(name);
    }
    public void setMessageNewMessageBox(String msg) {
        messageNewMessageBox.sendKeys(msg);
    }
    public void clickOnSendMessageButton() {
        sendMessageButton.click();
    }
    public void verifyFailedSendMessageVerification() {
        failedSendMessageVerification.isDisplayed();
    }


}
