package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1BrowersNavagition {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("Curent Title is :"+driver.getTitle());
        System.out.println("curently URL is "+driver.getCurrentUrl());

        // Navigate to Tesla

        driver.get("https://www.tesla.com/");
        driver.manage().window().fullscreen();
        System.out.println("Tesla title is :"+driver.getTitle());
        System.out.println("get tesla of URL "+driver.getCurrentUrl());

        // to close browser page
        driver.close();

    }
}
