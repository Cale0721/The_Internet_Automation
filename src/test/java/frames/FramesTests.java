package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class FramesTests extends BaseTests {

    @Test
    public void testFrameText(){
        var nestedFramePage = homePage.clickFramesPage().clickNestedFrames();
        assertEquals(nestedFramePage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramePage.getBottomFrame(), "BOTTOM", "Bottom frame text incorrect");
    }
}
