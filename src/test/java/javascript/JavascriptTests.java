package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPage;

public class JavascriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
