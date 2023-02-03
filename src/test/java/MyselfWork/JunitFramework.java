package MyselfWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JunitFramework {


    @Test

    public void test01(){ 


      WebDriverManager.chromedriver().setup();
      WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    //1-https://www.amazon.ca sayfasina gidin.

        driver.get("https:www.amazon.ca");
    //2-arama cubugunda "nutella "  yazdirin

    WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("nutella");
    //3-3- Nutella yazdiktan sonra ENTER a basin arama islmenini yapin
        aramaKutusu.submit();
    //4- Bulunan sonuc sayisini  yazdirin...
    WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(sonucYaziElementi.getText());

        driver.close();
    }

}
