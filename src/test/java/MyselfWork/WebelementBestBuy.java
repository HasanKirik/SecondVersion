package MyselfWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebelementBestBuy {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https:www.bestbuy.com");

        List<WebElement> buttonListesi=driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());

        //4- sayfadaki her button uzerindeki yazilari yazdirin

        for (WebElement each:buttonListesi
             ) {
            System.out.println(each.getText());

        }
    }
}
