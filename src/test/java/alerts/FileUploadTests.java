package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUploading() {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/Users/ismagilov/IdeaProjects/TAU_webdriver_java/resources/chromedriver");
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver", "Uploaded file is incorrect");
    }
}
