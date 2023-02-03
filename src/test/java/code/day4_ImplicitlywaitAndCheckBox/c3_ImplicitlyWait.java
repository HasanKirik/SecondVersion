package code.day4_ImplicitlywaitAndCheckBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c3_ImplicitlyWait {

    public static void main(String[] args) {
        //1.open browser
        //2. go to the page https://www.vinexponewyork.com/
        // 3.click on attend button

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");
       // driver.findElement(By.xpath("//span[@class='elementor-button-text']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//a[@href='/attend/']")).click();



        driver.quit();// all of  browser for page are close.

    }
}
