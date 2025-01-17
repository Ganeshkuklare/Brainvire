package com.qa.TestLayer;

import com.qa.PageLayer.LoginPage;
import com.qa.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(getDriver());
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("dashboard"), "Login failed!");
    }
}