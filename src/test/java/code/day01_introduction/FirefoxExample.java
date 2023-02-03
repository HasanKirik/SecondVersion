package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExample {
    public static void main(String[] args) {

       // WebDriverManager.firefoxdriver().setup();
     //   WebDriver Hasan=new FirefoxDriver();

        WebDriverManager.chromedriver().setup();
        WebDriver Hasan=new ChromeDriver();
        Hasan.get("https://emo.org.tr");

    }
}
