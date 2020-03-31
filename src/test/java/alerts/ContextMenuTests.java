package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickOnHotSpot();
        String alertText = contextMenuPage.getAlertText();
        contextMenuPage.alert_accept();
        assertEquals(alertText, "You selected a context menu", "Alert text incorrect");
    }
}
