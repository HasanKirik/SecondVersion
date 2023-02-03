package MyselfWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMetodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // driver.navigate().to  ---->> istenilenen Url e gider..
        //  1-  driver.get(ürl") ile aub=ni islemi yapar ama forward ve back yapilmasina imkan tanir..
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.facebook.com/");

        //  2-  driver.navigate().back(); ----... bir onceki sayfaya donus yapar..

        driver.navigate().back(); // amaozan geri donus yapar...

        //3- driver.navigate().forward(); ----> back() ile geldigi sayfaya geri doner
        driver.navigate().forward();

        //4-  driver.navigate().refresh(); ---->> bulundugu sayfayi yenilecektir...
        driver.navigate().refresh();

        //5-  driver olusturdugunda acilan  sayfayi kapatir....

       // driver.close();
        // driver calisirken birden fazla tab veya window actiysa tamamamini kapatir...
        driver.quit();


    }
}
