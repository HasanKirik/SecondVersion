package code.day6;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_Smart_Bear_Login {
    // 1- Open a chorome browser
    //2- go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.




    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver= WebDriverUtil.getDriver("chorme");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void Closing(){
      //  driver.close();

    }
@Test
    public void TC1loginVerificition(){


}

}
