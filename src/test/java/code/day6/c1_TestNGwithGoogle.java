package code.day6;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_TestNGwithGoogle {

    // go to google
    //search macbook
    //verify title


    WebDriver driver;
    @BeforeMethod
    public void setUP(){
       driver=WebDriverUtil.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.get("https://www.google.com/");


    }
    @Test
    public void GoogleTitleVerfication(){

        //search macbook
        WebElement GoogleSearchBox=driver.findElement(By.xpath("//input[@class='gLFyf']"));
        GoogleSearchBox.sendKeys("macbook", Keys.ENTER);

        //verify title  contains "macbook"


        String actualTitle=driver.getTitle();
        String expectedTitle="macbook";

        boolean b=actualTitle.contains(expectedTitle);

        Assert.assertTrue(b,"assertion failed,title does not contain macbook");




    }
    @AfterMethod
    public void Closing(){
        driver.quit();
    }
}
