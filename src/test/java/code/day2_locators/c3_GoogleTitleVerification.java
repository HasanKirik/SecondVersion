package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_GoogleTitleVerification {

    // 1/Open Choreme Browser
    // Go to google
    //3. Verify title :Expected:Google

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("google actual title:"+driver.getTitle());

        //3. Verify title :Expected:Google

        boolean titleVerifiaction=driver.getTitle().equals("Google");
        if (titleVerifiaction){
            System.out.println("google title verfication has passed");
        }else{
            System.out.println("Google title verfication has failed");

        }
    }
}
