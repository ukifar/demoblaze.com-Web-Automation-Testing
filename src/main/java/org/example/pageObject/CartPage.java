package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement placeOrderButton;
    @FindBy(xpath = "//h5[@id='orderModalLabel']")
    private WebElement placeOrderPopup;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement namePlaceOrderBox;
    @FindBy(xpath = "//input[@id='card']")
    private WebElement creditCardPlaceOrderBox;
    @FindBy(xpath = "//button[.='Purchase']")
    private WebElement purchaseButton;
    @FindBy(xpath = "//h2[.='Thank you for your purchase!']")
    private WebElement thankYouPurchasePopup;
    @FindBy(xpath = "//a[.='Delete']")
    private WebElement deleteItemButton;
    @FindBy(xpath = "//h3[@id='totalp']")
    private WebElement priceVerification;
    public void clickOnPlaceOrderButton() {
        placeOrderButton.click();
    }
    public void verifyPlaceOrderPopup() {
        placeOrderPopup.isDisplayed();
    }
    public void setNamePlaceOrderBox(String name) {
        namePlaceOrderBox.sendKeys(name);
    }
    public void setCreditCardPlaceOrderBox(String creditCard) {
        creditCardPlaceOrderBox.sendKeys(creditCard);
    }
    public void clickOnPurchaseButton() {
        purchaseButton.click();
    }
    public void verifyThankYouPurchasePopup() {
        thankYouPurchasePopup.isDisplayed();
    }
    public void clickOnDeleteItemButton() {
        deleteItemButton.click();
    }
    public String verifyPriceVerification() {
        return priceVerification.getText();
    }

}
