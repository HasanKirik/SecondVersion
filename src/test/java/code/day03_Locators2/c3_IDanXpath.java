package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_IDanXpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https:www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("chrismis tree");

        // xpath locator : //tagname [@ attribu='value']

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
