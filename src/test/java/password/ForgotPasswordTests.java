package password;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgotPasswordPage.retrievePassword("test@test.com");
        assertEquals(emailSentPage.getMessage(), "Your email has been sent!", "message is incorrect");
    }
}
