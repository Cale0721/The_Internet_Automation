package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckBoxesPage {

    private WebDriver driver;

    private By checkboxes = By.id("checkboxes");

    private By checkbox = By.cssSelector("input:checked[type='checkbox']");

    private By checkThebox = By.cssSelector("input:checked[type='checked']");


    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckbox() {
      driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    }

    public void isCheckboxSelected(){
    driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).getAttribute("checked");
    }


}