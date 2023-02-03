package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_LinnkText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        // click Gmail
        // used Linktext
       // driver.findElement(By.linkText("Gmail")).click();
        // used partial linkText
        driver.findElement(By.partialLinkText("Gm")).click();

        // used Classname
       // driver.findElement(By.className("gb_j")).click();
    }
}
