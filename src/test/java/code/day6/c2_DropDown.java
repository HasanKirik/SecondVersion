package code.day6;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_DropDown {

    //1.Open Chrome browse
    //2.Go to "http://the-internet.herokuapp.com/"
    //3 click on dropdown
    //confirm default selected dropdown is "please select an option"

    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://the-internet.herokuapp.com/");


    }

    @Test
    public void TC1_VerifyDropdown(){
        WebElement dropDownClick=driver.findElement(By.xpath("//a[@href='/dropdown']" ));
         dropDownClick.click();

        WebElement dropDownClickk=driver.findElement(By.id("dropdown"));



        Select dropDown=new Select(dropDownClickk);
        String ActualdefaultOption=dropDown.getFirstSelectedOption().getText();
        String ExpectedDeafultOption="Please select an option";
        Assert.assertEquals(ActualdefaultOption,ExpectedDeafultOption,"The verfitition has  failed");

    }

    @Test
    public void TC2VerifyOptionsFromDropDown() throws InterruptedException {
        // task2
        //1.Open Chorme browser
        //2. Go to
        //3.Click on dropdown
        // choose option 2 from dropdown
        // chose option 1 from dropdown
        //chose option 2 from dropdown
        //
        WebElement dropDownClick=driver.findElement(By.xpath("//a[@href='/dropdown']" ));
        dropDownClick.click();

        WebElement dropDownClickk=driver.findElement(By.id("dropdown"));
        // confirm deafult selected dropdown is "please select an option"

        Select dropDown=new Select(dropDownClickk);
        //choose option 2 from dropdown
        Thread.sleep(2000);
        dropDown.selectByIndex(2);
        Thread.sleep(2000);
        dropDown.selectByValue("1");
        Thread.sleep(2000);
        dropDown.selectByVisibleText("Option 2");


    }

    @AfterMethod
    public void Closing(){
        driver.quit();
    }
}
