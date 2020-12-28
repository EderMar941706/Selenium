package javascript;

import base.baseprueba;
import org.testng.annotations.Test;

public class JavaScriptTests extends baseprueba {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
