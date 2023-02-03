package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c1_HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello Selenium");
        //set up chrome driver
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
       // WebDriver driver2=new FirefoxDriver();
       // driver2.get("https://www.emo.org.tr/");
        //create a driver instance
        WebDriver driver=new ChromeDriver();
        //navigate to chrome browser
        driver.get("https://www.amazon.com/");
        //go to apple
        driver.get("https://www.apple.com/");

        driver.get("https://emo.org.tr");


        WebDriver hasan=new ChromeDriver();


        hasan.get("https://www.google.com/");
        hasan.manage().window().fullscreen();
        System.out.println("Title is ::"+hasan.getTitle());
        hasan.get("https://www.etsy.com/");
        hasan.manage().window().fullscreen();
        System.out.println("curent URL :"+hasan.getCurrentUrl());
        Thread.sleep(6000);
        driver.get("https://www.ford.com/");
        driver.close();
        hasan.close();





    }
}
