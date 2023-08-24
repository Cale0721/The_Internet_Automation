package login;

import base.BaseTests;
import org.testng.annotations.Test;
import page.LoginPage;
import page.SecureAreaPage;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertFalse(secureAreaPage.getAlertText().contains("You logged into a secure area! x"), "Alert text is incorrect");
    }

}
