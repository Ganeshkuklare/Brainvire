package com.qa.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.WaitUtil;

public class EmployeePage {
    WebDriver driver;

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Add Employee']")
    private WebElement addEmployeeButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameField;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement saveButton;

    public void clickAddEmployeeButton() {
        WaitUtil.waitForElementClickable(driver, addEmployeeButton);
        addEmployeeButton.click();
    }

    public void enterFirstName(String firstName) {
        WaitUtil.waitForElementVisible(driver, firstNameField);
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WaitUtil.waitForElementVisible(driver, lastNameField);
        lastNameField.sendKeys(lastName);
    }

    public void clickSaveButton() {
        WaitUtil.waitForElementClickable(driver, saveButton);
        saveButton.click();
    }
}
