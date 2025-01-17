package com.qa.TestLayer;

import com.qa.PageLayer.AdminPage;
import com.qa.PageLayer.LoginPage;
import com.qa.TestBase.TestBase;
import org.testng.annotations.Test;

public class AdminPageTest extends TestBase {

    @Test
    public void addUserTest() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        AdminPage admin = new AdminPage(getDriver());
        admin.clickAdminButton();
        admin.clickAddButton();
        Thread.sleep(5000);
      // admin.selectUserRole("Admin"); // Select User Role
        //Thread.sleep(8000);
        
        admin.enterEmployeeName("John Smith"); // Enter Employee Name
        admin.selectStatus("Enabled"); // Select Status
        admin.enterUsername("NewUser123"); // Enter Username
        admin.enterPassword("Password@123"); // Enter Password
        admin.enterConfirmPassword("Password@123"); // Confirm Password
        admin.clickSaveButton(); // Click Save

        // Assertion can be added to validate user creation
    }
}
