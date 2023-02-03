package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement gmailButton=driver.findElement(By.xpath("//a[@class='gb_d']"));
        //to get text of an Webelement
        System.out.println("Gmail button text is = "+gmailButton.getText());
        //to get an attribute value
        System.out.println("Gmail button, href attribute value= "+gmailButton.getAttribute("href"));

    }
}
