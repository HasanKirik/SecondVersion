package MyselfWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMetodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        // 1- driver.get(ürl") ---->> yazdigimiz url ye gider.

        driver.get("https://www.azazon.com");

        // 2- driver.getTitle() ------>> icinde oldugu sayfanin basligini dondurur.

        System.out.println("sayfa title:" + driver.getTitle());  // Amazon.com Spend less. Smile more..

        // 3- driver.getCurrentUrl() ------->> icinde oldugu sayfanin URL inin dondurur..


        System.out.println(driver.getCurrentUrl()); //  https://www.amazon.com/
        // 4- driver.getPageSource():  ------>> icinde oldugu sayfanin kaynak kodlarinini dondurur..

        System.out.println("-------------------------------------------");

       // System.out.println(driver.getPageSource());
        System.out.println("++++++++++++++++++++++++++++++++++");

        // 5- driver.getWindowHandele() -----> // Calistigi sayfain hash kodunu dondurur..


        System.out.println(driver.getWindowHandle());

        //6- 5- driver.getWindowHandeles() -----> // Calistigi sayfalarin hash kodunu dondurur..

        System.out.println(driver.getWindowHandles());


        //CTRl +U ile sayfanin kaynak kodlarini gorebiliriz...









    }



}
