package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_idLocator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        //locate web element with ID
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("clarks");
        //locate with xpath
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }
}
