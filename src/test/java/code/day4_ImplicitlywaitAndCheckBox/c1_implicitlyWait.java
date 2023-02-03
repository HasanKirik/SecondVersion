package code.day4_ImplicitlywaitAndCheckBox;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class c1_implicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        //1.open browser
        //2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        Thread.sleep(20000);
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");
        //it is gonna wait a specific time until page loaded
        //as soon as page loaded it will move on next step
        // if this was thread.sleep no matter it will wait for 20 second
        //implicitly wait will effect all code block where we use it


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='/attend/']")).click();




    }

}
