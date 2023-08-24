package Slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
