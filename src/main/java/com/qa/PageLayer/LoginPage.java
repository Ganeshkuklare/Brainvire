package com.qa.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.WaitUtil;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'Invalid credentials')]")
    private WebElement invalidMessage;

    // Action Methods
    public void enterUsername(String uname) {
        WaitUtil.waitForElementVisible(driver, username);
        username.sendKeys(uname);
    }

    public void enterPassword(String pass) {
        WaitUtil.waitForElementVisible(driver, password);
        password.sendKeys(pass);
    }

    public void clickLogin() {
        WaitUtil.waitForElementClickable(driver, loginButton);
        loginButton.click();
    }

    
    //Represents the error message displayed for invalid credentials
    public boolean isInvalidLoginMessageDisplayed() {
        return invalidMessage.isDisplayed();
    }
}