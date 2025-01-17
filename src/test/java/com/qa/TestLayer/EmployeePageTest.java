package com.qa.TestLayer;

import com.qa.PageLayer.EmployeePage;
import com.qa.PageLayer.LoginPage;
import com.qa.TestBase.TestBase;
import org.testng.annotations.Test;

public class EmployeePageTest extends TestBase {

    @Test
    public void addEmployeeTest() {
        LoginPage login = new LoginPage(getDriver());
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        EmployeePage employee = new EmployeePage(getDriver());
        employee.clickAddEmployeeButton();
        employee.enterFirstName("John");
        employee.enterLastName("Doe");
        employee.clickSaveButton();
    }
}