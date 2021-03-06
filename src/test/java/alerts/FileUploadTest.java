package alerts;

import base.baseprueba;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends baseprueba {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\eder-\\IdeaProjects\\PruebasSelenium\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),
                "chromedriver.exe",
                "Uploaded files incorrect");
    }
}
