package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_CssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //css selector faster than xpath
       // driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("wallet");
        //second way if the element is ID you can use #
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("toys");

    }
}
