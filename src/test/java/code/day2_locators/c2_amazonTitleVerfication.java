package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_amazonTitleVerfication {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // Open Chorime Browser
        // Go to google
        driver.get("https://www.google.com");
        driver.manage().window().maximize();


        // Navigate https :// www.amazon.com
       driver.navigate().to("https://www.amazon.com/");
       driver.manage().window().fullscreen();
        // Navigate back

        driver.navigate().back();
        //Navigate forwad
        driver.navigate().forward();
        driver.manage().window().maximize();
        // Verify titile contains :smile

        String expectedTitleWord="zon";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitleWord)){
            System.out.println("Ämazon title contains smile and verificitaion has passed");
        }else{
            System.out.println("Amazon title does not contain Smile and verficition has  not pass");
        }


        System.out.println("actual title :) :"+driver.getTitle());

        driver.close();

    }
}
