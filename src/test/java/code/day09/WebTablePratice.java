package code.day09;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class WebTablePratice {

    WebDriver driver;
    @BeforeMethod
    public void Setup(){
        driver= WebDriverUtil.getDriver("");
    }
}
