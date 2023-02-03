package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_textMetod {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        driver.manage().window().maximize();
//xpath text method :// tagname[@attributte ='valu']

        driver.findElement(By.xpath("//a[.='Software Testing']")).click();
    }
}
