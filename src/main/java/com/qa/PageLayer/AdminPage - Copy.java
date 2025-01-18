package com.qa.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.qa.utility.WaitUtil;

public class AdminPage {
    WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    private WebElement adminButton;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addButton;

    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
    private WebElement userRoleDropdown;
    
    @FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]")
    private WebElement option;

    @FindBy(xpath = "(//div[contains(@class, 'oxd-autocomplete-text-input')])[1]")
    private WebElement employeeNameField;
    
    
    @FindBy(xpath = "(//div[@class=\"oxd-select-text--after\"])[2]")
    private WebElement statusDropdown;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[1]")
    private WebElement usernameField;

    @FindBy(xpath = "(//input[@type=\"password\"])[1]")
    private WebElement passwordField;

    @FindBy(xpath = "(//input[@type=\"password\"])[2]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement saveButton;

    // Action Methods

    public void clickAdminButton() {
        WaitUtil.waitForElementClickable(driver, adminButton);
        adminButton.click();
    }

    public void clickAddButton() {
        WaitUtil.waitForElementClickable(driver, addButton);
        addButton.click();
    }

//    public void selectUserRole(String role) {
//        WaitUtil.waitForElementVisible(driver, userRoleDropdown);
//        userRoleDropdown.click();
//        option.click();
//        
//    }
    

    public void enterEmployeeName(String employeeName) {
        WaitUtil.waitForElementVisible(driver, employeeNameField);
        employeeNameField.sendKeys(employeeName);
    }

    public void selectStatus(String status) {
        WaitUtil.waitForElementVisible(driver, statusDropdown);
        Select select = new Select(statusDropdown);
        select.selectByVisibleText(status); // Example: "Enabled" or "Disabled"
    }

    public void enterUsername(String username) {
        WaitUtil.waitForElementVisible(driver, usernameField);
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WaitUtil.waitForElementVisible(driver, passwordField);
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        WaitUtil.waitForElementVisible(driver, confirmPasswordField);
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickSaveButton() {
        WaitUtil.waitForElementClickable(driver, saveButton);
        saveButton.click();
    }
}
