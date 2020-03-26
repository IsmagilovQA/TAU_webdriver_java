package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotpasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgotpasswordTests extends BaseTests {

    @Test
    public void testAlertText() {
        ForgotpasswordPage forgotpasswordPage = homePage.clickForgotPassword();
        forgotpasswordPage.setEmail("test@gmail.com");
        forgotpasswordPage.clickSubmit();
        assertEquals(forgotpasswordPage.getAlertContent(), "Your e-mail's been sent!",
                "Incorrect alert");
    }
}
