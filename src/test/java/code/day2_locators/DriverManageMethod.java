package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class DriverManageMethod {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        




        System.out.println(driver.manage().window().getSize());

        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(55,55));

        driver.manage().window().setSize(new Dimension(900,600));


        System.out.println("new window  get possion::"+driver.manage().window().getSize());
        System.out.println("New window get to Dimmision::"+ driver.manage().window().getPosition());

        driver.manage().window().maximize();

        System.out.println("get to maximuma possion:"+driver.manage().window().getSize());
        System.out.println("New window get to Dimmision::"+ driver.manage().window().getPosition());

        driver.manage().window().fullscreen();

        System.out.println("get to maximuma possion:"+driver.manage().window().getSize());
        System.out.println("New window get to Dimmision::"+ driver.manage().window().getPosition());



        driver.manage().window().minimize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));





    }

}
