package com.qa.TestLayer;


import com.qa.PageLayer.DashboardPage;
import com.qa.PageLayer.LoginPage;
import com.qa.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPageTest extends TestBase {

    @Test
    public void verifyDashboardMenus() {
        LoginPage login = new LoginPage(getDriver());
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        DashboardPage dashboard = new DashboardPage(getDriver());
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard not displayed");
        dashboard.clickOnAdminMenu();
        dashboard.clickOnPimMenu();
        dashboard.clickOnLeaveMenu();
    }
}