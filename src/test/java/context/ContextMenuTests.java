package context;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var menuPage = homePage.clickContextMenuPage();
        menuPage.rightClickInBox();
        String message = menuPage.getPopUpText();
        menuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}


