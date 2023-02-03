package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c5_findelements {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        // click to Iphone
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();

        //4- Print out the texts of all Links
        // 5- print out all links

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));

        int LinkWithText=0;
        int LinkWithoutText=0;

        for (WebElement eachLink:allLinks) {
            String elementToText=eachLink.getText();
            System.out.println(elementToText);

            //6- count of links that dosent have text
            //7-count of links that has have text

            if (elementToText.isEmpty()){
                LinkWithoutText++;
            }else{
                LinkWithText++;
            }


        }
        System.out.println("Link with Text="+LinkWithText);
        System.out.println("Link without Text="+LinkWithoutText);
        System.out.println("all Links"+allLinks.size());





    }
}
