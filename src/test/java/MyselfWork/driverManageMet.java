package MyselfWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class driverManageMet {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));


       // driver.manage().window().getSize();----> icinde oldugu sayfanin pixel olarak olculerini getirir..
        System.out.println( driver.manage().window().getSize());

//1-- driver.manage().window().getPosition() --->> icinde oldugu sayfanin pixel olarak konumunu dondurur..
        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(15,20));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println(driver.manage().window().getPosition());

        //
        driver.manage().window().maximize(); // icinde oldugu sayfayi boyutlari makisum yapar..
        System.out.println("maksimum konum:"+driver.manage().window().getPosition());
        System.out.println("maksimum boyut:"+driver.manage().window().getSize());

        driver.manage().window().fullscreen(); // icinde oldugu syafanin full secren yapar..

        System.out.println("fulscreen konum"+driver.manage().window().getPosition());
        System.out.println("fulscreen bouut"+driver.manage().window().getSize());

        driver.manage().window().maximize();


        //2-- driver.manage().timeouts()

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




    }



}
