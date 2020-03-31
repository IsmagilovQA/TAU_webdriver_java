package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Result text is incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirmAlert();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text is incorrect");
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Result is incorrect");
    }

    @Test
    public void testSetInputToPromptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromptAlert();
        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Alert text incorrect");
    }
}
