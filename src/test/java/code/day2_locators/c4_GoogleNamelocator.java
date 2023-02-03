package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_GoogleNamelocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // TASK:Google search
        // open a chrome browser
        //2-Go to: https:// www. google.com
        //3-Write orange"in search box
        //4-Click google search button
        //5- verify title:
        // Expect :Title should start with örange"word
        //6-navigate back
        //7- write banana in search box
        //8- verify title contains banana

        driver.get( "https://www.google.com/");
        //3-Write orange"in search box

       WebElement GoogleSearchBox= driver.findElement(By.name("q"));
       GoogleSearchBox.sendKeys("orange");
       Thread.sleep(2000);

        //4-Click google search button
       WebElement Googlebutton=driver.findElement(By.name("btnK"));
       Googlebutton.click();

        //5- verify title:

    }

}
