package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        DynamicLoadingExample1Page example1Page = homePage.clickDynamicLoading().clickExample1();
        example1Page.clickStart();
        assertEquals(example1Page.getLoadedText(), "Hello World!", "Loaded text is incorrect.");
    }

    @Test
    public void testWaitUntilVisible(){
        DynamicLoadingExample2Page loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
