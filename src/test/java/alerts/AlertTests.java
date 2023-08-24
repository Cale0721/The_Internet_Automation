package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {


    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Results text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerConfirm();

        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();

        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertspage = homePage.clickJavaScriptAlert();
        alertspage.triggerPrompt();

        String text = "TAU rocks!";
        alertspage.alert_setInput(text);
        alertspage.alert_clickToAccept();

        assertEquals(alertspage.getResult(), "You entered: " + text, "Results text incorrect");
    }
}
