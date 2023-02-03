package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium11 {


    //1. Open Chrome browser
//2. Go to https://www.apple.com
//3. Click to iPhone
//4. Print out the texts of all links

    public static void main(String[] args) {





        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.apple.com");

        System.out.println("Get to title : " + driver.getTitle());
        System.out.println("**********************************");
        System.out.println("Get to souurce"+ driver.getPageSource());
        System.out.println("-----------------------------------------");

        // get to hash code inside page

        System.out.println("get to hash code inside page:::"+ driver.getWindowHandle());


       // System.out.println("get to hash code inside page:::"+ driver.getWindowHandles());














    }

}


