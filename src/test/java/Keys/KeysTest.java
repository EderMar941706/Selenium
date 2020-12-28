package Keys;

import base.baseprueba;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

import static org.testng.Assert.assertEquals;

public class KeysTest extends baseprueba {
    @Test
    public void testBackspace(){
        var keypage =homePage.clickKeyPresses();
        keypage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keypage.getResult(),"You entered: BACK_SPACE!");
    }
    @Test
    public void testPi(){
        var keyPage=homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
