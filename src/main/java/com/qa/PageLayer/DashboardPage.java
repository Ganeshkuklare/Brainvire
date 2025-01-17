package com.qa.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.WaitUtil;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Admin']")
    private WebElement adminMenu;

    @FindBy(xpath = "//span[normalize-space()='PIM']")
    private WebElement pimMenu;

    @FindBy(xpath = "//span[normalize-space()='Leave']")
    private WebElement leaveMenu;

    @FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[8]")
    private WebElement dashboardHeader;

    // Action Methods
    public void clickOnAdminMenu() {
        WaitUtil.waitForElementClickable(driver, adminMenu);
        adminMenu.click();
    }

    public void clickOnPimMenu() {
        WaitUtil.waitForElementClickable(driver, pimMenu);
        pimMenu.click();
    }

    public void clickOnLeaveMenu() {
        WaitUtil.waitForElementClickable(driver, leaveMenu);
        leaveMenu.click();
    }

    public boolean isDashboardDisplayed() {
        return dashboardHeader.isDisplayed();
    }
}