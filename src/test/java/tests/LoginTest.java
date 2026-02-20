package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {


    @Test(priority = 0)
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);



        loginPage.loginAs("Admin","admin123");

        // Example: after login, assert page title
        Assert.assertEquals(driver.getTitle(), "Dashboard", "Login failed or wrong page title!");
    }

    @Test(priority = 1)
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginAs("35556","admin123");

//
    }
    }