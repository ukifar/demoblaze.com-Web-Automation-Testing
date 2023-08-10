package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPage {
    public static WebDriver driver;
    public ProductDescriptionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Sony vaio i5
    @FindBy(xpath = "//a[@id='nava']")
    private WebElement sonyVaioI5AddtoCartButton;
    public void clickOnSonyVaioI5AddtoCartButton() {
        sonyVaioI5AddtoCartButton.click();
    }








}
