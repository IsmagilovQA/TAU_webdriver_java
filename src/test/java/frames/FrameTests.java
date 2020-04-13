package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.NestedFramePage;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrame() {
        WysiwygEditorPage editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello";
        String text2 = " world!";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1 + text2, " text is incorrect");
    }

    @Test
    public void switchingBetweenFrames_MyVersion() {
        FramePage framePage = homePage.clickFrame();
        NestedFramePage nestedFramePage = homePage.clickNestedFrame();
        nestedFramePage.switchToFrame("frame-top");
        nestedFramePage.switchToFrame("frame-left");
        assertEquals(nestedFramePage.getFrameText(), "LEFT", "text is incorrect");
        nestedFramePage.switchToParentFrame();
        nestedFramePage.switchToParentFrame();
        nestedFramePage.switchToFrame("frame-bottom");
        assertEquals(nestedFramePage.getFrameText(), "BOTTOM", "text is incorrect");
    }
}
