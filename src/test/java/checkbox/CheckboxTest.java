package checkbox;

import base.BaseTests;
import org.testng.annotations.Test;
import page.CheckBoxesPage;

import static org.testng.Assert.*;

public class CheckboxTest extends BaseTests {



    @Test
    public void testCheckbox() {
       var checkBoxesPage = homePage.clickCheckBoxes();
       checkBoxesPage.clickCheckbox();
       checkBoxesPage.isCheckboxSelected();




    }
}


