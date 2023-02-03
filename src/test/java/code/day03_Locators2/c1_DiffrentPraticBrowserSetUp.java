package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class c1_DiffrentPraticBrowserSetUp {
    public static void main(String[] args) {
        //firefox Browser SetUp
        //WebDriverManager.firefoxdriver().setup();
       // WebDriver driver=new FirefoxDriver();
        //driver.get("https://wwww.google.com/");

        // Edge Browser SetUp

        //WebDriverManager.edgedriver().setup();
       //  WebDriver driver=new EdgeDriver();
       //  driver.get("https://wwww.google.com/");

        // safari Browser setUp;

       // WebDriverManager.safaridriver().setup();
       // WebDriver driver=new SafariDriver();
       // driver.get("https://wwww.google.com/");
    }
}
