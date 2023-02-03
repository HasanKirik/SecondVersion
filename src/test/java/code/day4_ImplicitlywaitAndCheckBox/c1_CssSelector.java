package code.day4_ImplicitlywaitAndCheckBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_CssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("televison");

        // !!!!!!  Css Selector faster than xpath locator  !!!!!!!!

       // driver.findElement(By.cssSelector("input[type='text']")).sendKeys("radio");

        // second way

       // driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("phone");
    }
}
