package alerts;

import base.baseprueba;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Alertsprueba extends baseprueba {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_ClickToAccept();
        assertEquals(alertsPage.getResult(),"You successfuly clicked an alert", "Results text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertspage = homePage.clickJavaScriptAlerts();
        alertspage.triggerConfirm();
        String text = alertspage.alert_getText();
        alertspage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }
    @Test
    public void testSetInputInAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();

        String text = "TAU rocks!";
        alertPage.alert_setInput(text);
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(), "You entered: " +  text, "Results text incorrect");
    }
}
