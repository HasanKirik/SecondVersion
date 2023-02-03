package code.day03_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c1_LocatorPractice {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        //3. Click to iPhone
        //4. Print out the texts of all links

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        //3. Click to iPhone
       // driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
        //child to parent method
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();
        //parent to child
        //ul[@class='ac-gn-list']//following::li[5]
        //4. Print out the texts of all links
        //print out all links
        //count of links that does not have text
        //count of links that has text

        //find elements used only when more than 1 webElement
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));

        int linkWithoutext=0;
        int linkwithtext=0;
        for(WebElement eachLink:allLinks){
            String elementToText=eachLink.getText();
            System.out.println(elementToText);

            if(elementToText.isEmpty()){
                linkWithoutext++;
            }else {
                linkwithtext++;
            }
        }
        System.out.println("link with text= "+linkwithtext);
        System.out.println("Link without text= "+linkWithoutext);
        System.out.println("all links counts="+allLinks.size());





    }
}
